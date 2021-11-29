/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Task;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZenBook
 */
public class TaskDAO extends DBContext {

    public List<Task> getTaskByProjectId(int projectId) {
        List<Task> list = new ArrayList<>();
        String sql = "select * from Task where projectId = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, projectId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Task t = new Task();
                t.setId(rs.getInt("id"));
                t.setUser(new UserDAO().getUserById(rs.getInt("userId")));
                t.setProject(new ProjectDAO().getProjectById(projectId));
                t.setCreatedBy(new UserDAO().getUserById(rs.getInt("createdBy")));
                t.setUpdatedBy(new UserDAO().getUserById(rs.getInt("updatedBy")));
                t.setTitle(rs.getString("title"));
                t.setDescription(rs.getString("description"));
                t.setStatus(rs.getInt("status"));
                t.setHours(rs.getInt("hours"));
                t.setCreateAt(rs.getDate("createdAt"));
                t.setPlannedStartDate(rs.getDate("plannedStartDate"));
                t.setPlannedEndDate(rs.getDate("plannedEndDate"));
                t.setActualStartDate(rs.getDate("actualStartDate"));
                t.setActualEndDate(rs.getDate("actualEndDate"));
                t.setContent(rs.getString("content"));
                list.add(t);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return list;
    }

    public void addTask(int userId, int projectId, int createdBy, int updatedBy, String title, String description, String plannedStartDate, String plannedEndDate) {
        String sql = "insert into Task(userId, projectId, createdBy, updatedBy, title, description, status, hours, createdAt, updatedAt, plannedStartDate, plannedEndDate)\n"
                + "values(?, ?, ?, ?, ?, ?, 0, 0, GETDATE(), GETDATE(), ?, ?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.setInt(2, projectId);
            ps.setInt(3, createdBy);
            ps.setInt(4, updatedBy);
            ps.setString(5, title);
            ps.setString(6, description);
            ps.setString(7, plannedStartDate);
            ps.setString(8, plannedEndDate);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void deleteTask(int id) {
        String sql = "delete from Task \n"
                + "where id = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public static void main(String[] args) {
        TaskDAO t = new TaskDAO();
        System.out.println(t.getTaskByProjectId(1));
    }
}
