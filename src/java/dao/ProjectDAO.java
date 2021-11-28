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
    
    public static void main(String[] args) {
        ProjectDAO p = new ProjectDAO();
        System.out.println(p.getAllProjects());
    }
}
