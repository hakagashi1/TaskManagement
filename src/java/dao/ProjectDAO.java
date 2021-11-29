/*
 * To change this license header, choose License Headers in ProjectDAO Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Project;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZenBook
 */
public class ProjectDAO extends DBContext {

    public List<Project> getAllProjects() {
        List<Project> list = new ArrayList<>();
        String sql = "SELECT * FROM Project";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Project p = new Project();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                p.setTeam(new TeamDAO().getTeamById(rs.getInt("teamId")));
                p.setCreatedBy(new UserDAO().getUserById(rs.getInt("createdBy")));
                p.setUpdatedBy(new UserDAO().getUserById(rs.getInt("updatedBy")));
                p.setStatus(rs.getInt("status"));
                p.setHours(rs.getInt("hours"));
                p.setCreateAt(rs.getDate("createdAt"));
                p.setUpdatedAt(rs.getDate("updatedAt"));
                p.setPlannedStartDate(rs.getDate("plannedStartDate"));
                p.setPlannedEndDate(rs.getDate("plannedEndDate"));
                p.setActualStartDate(rs.getDate("actualStartDate"));
                p.setActualEndDate(rs.getDate("actualEndDate"));
                p.setContent(rs.getString("content"));
                list.add(p);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return list;
    }

    public List<Project> getTeamProjects() {
        List<Project> list = new ArrayList<>();
        String sql = "SELECT * FROM Project where teamId is not null;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Project p = new Project();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                p.setTeam(new TeamDAO().getTeamById(rs.getInt("teamId")));
                p.setCreatedBy(new UserDAO().getUserById(rs.getInt("createdBy")));
                p.setUpdatedBy(new UserDAO().getUserById(rs.getInt("updatedBy")));
                p.setStatus(rs.getInt("status"));
                p.setHours(rs.getInt("hours"));
                p.setCreateAt(rs.getDate("createdAt"));
                p.setUpdatedAt(rs.getDate("updatedAt"));
                p.setPlannedStartDate(rs.getDate("plannedStartDate"));
                p.setPlannedEndDate(rs.getDate("plannedEndDate"));
                p.setActualStartDate(rs.getDate("actualStartDate"));
                p.setActualEndDate(rs.getDate("actualEndDate"));
                p.setContent(rs.getString("content"));
                list.add(p);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return list;
    }

    public List<Project> getSingleProjects() {
        List<Project> list = new ArrayList<>();
        String sql = "SELECT * FROM Project where teamId is null;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Project p = new Project();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                p.setTeam(new TeamDAO().getTeamById(rs.getInt("teamId")));
                p.setCreatedBy(new UserDAO().getUserById(rs.getInt("createdBy")));
                p.setUpdatedBy(new UserDAO().getUserById(rs.getInt("updatedBy")));
                p.setStatus(rs.getInt("status"));
                p.setHours(rs.getInt("hours"));
                p.setCreateAt(rs.getDate("createdAt"));
                p.setUpdatedAt(rs.getDate("updatedAt"));
                p.setPlannedStartDate(rs.getDate("plannedStartDate"));
                p.setPlannedEndDate(rs.getDate("plannedEndDate"));
                p.setActualStartDate(rs.getDate("actualStartDate"));
                p.setActualEndDate(rs.getDate("actualEndDate"));
                p.setContent(rs.getString("content"));
                list.add(p);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return list;
    }
    
    public Project getProjectById(int id) {
        String sql = "SELECT * FROM Project where id = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Project p = new Project();
                p.setId(rs.getInt("id"));
                p.setTitle(rs.getString("title"));
                p.setDescription(rs.getString("description"));
                p.setTeam(new TeamDAO().getTeamById(rs.getInt("teamId")));
                p.setCreatedBy(new UserDAO().getUserById(rs.getInt("createdBy")));
                p.setUpdatedBy(new UserDAO().getUserById(rs.getInt("updatedBy")));
                p.setStatus(rs.getInt("status"));
                p.setHours(rs.getInt("hours"));
                p.setCreateAt(rs.getDate("createdAt"));
                p.setUpdatedAt(rs.getDate("updatedAt"));
                p.setPlannedStartDate(rs.getDate("plannedStartDate"));
                p.setPlannedEndDate(rs.getDate("plannedEndDate"));
                p.setActualStartDate(rs.getDate("actualStartDate"));
                p.setActualEndDate(rs.getDate("actualEndDate"));
                p.setContent(rs.getString("content"));
                return p;
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return null;
    }

    public void createTeamProject(String title, int teamId, int createdBy, int updatedBy, String plannedStartDate, String plannedEndDate, String description) {
        String sql = "insert into Project(title, description, teamId, createdBy, updatedBy, status, hours, createdAt, updatedAt, plannedStartDate, plannedEndDate)\n"
                + "values(?, ?, ?, ?, ?, 0, 0, GETDATE(), GETDATE(), ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, description);
            ps.setInt(3, teamId);
            ps.setInt(4, createdBy);
            ps.setInt(5, updatedBy);
            ps.setString(6, plannedStartDate);
            ps.setString(7, plannedEndDate);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public void createSingleProject(String title, int createdBy, int updatedBy, String plannedStartDate, String plannedEndDate, String description) {
        String sql = "insert into Project(title, description, createdBy, updatedBy, status, hours, createdAt, updatedAt, plannedStartDate, plannedEndDate)\n"
                + "values(?, ?, ?, ?, 0, 0, GETDATE(), GETDATE(), ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, title);
            ps.setString(2, description);
            ps.setInt(3, createdBy);
            ps.setInt(4, updatedBy);
            ps.setString(5, plannedStartDate);
            ps.setString(6, plannedEndDate);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.print(e);
        }
    }

    public static void main(String[] args) {
        ProjectDAO p = new ProjectDAO();
//        p.createTeamProject("title", 2, 3, 3, "2021/12/01", "2021/12/20", "Demo1");
        System.out.println(p.getTeamProjects());
        System.out.println(p.getSingleProjects());
    }
}
