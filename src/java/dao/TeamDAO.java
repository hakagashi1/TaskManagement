/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Team;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZenBook
 */
public class TeamDAO extends DBContext {

    public List<Team> getAllTeams() {
        List<Team> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.[Team]";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Team team = new Team();
                team.setId(rs.getInt("id"));
                team.setName(rs.getString("name"));
                team.setLeader(new UserDAO().getUserById(rs.getInt("leaderId")));
                team.setMembers(new UserDAO().getMembersByTeamId(rs.getInt("id")));
                team.setDescription(rs.getString("description"));
                list.add(team);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return list;
    }

    public Team getTeamById(int teamId) {
        String sql = "SELECT * FROM Team where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, teamId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Team team = new Team();
                team.setId(rs.getInt("id"));
                team.setName(rs.getString("name"));
                team.setLeader(new UserDAO().getUserById(rs.getInt("leaderId")));
                team.setMembers(new UserDAO().getMembersByTeamId(teamId));
                team.setDescription(rs.getString("description"));
                return team;
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return null;
    }

    public void addTeam(String name, int leaderId, String details) {
        String sql = "insert into Team\n"
                + "values (?, ?, ?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, name);
            ps.setInt(2, leaderId);
            ps.setString(3, details);
            ps.executeUpdate();
        } catch (Exception e) {
            System.err.println(e);
        }
    }

    public void addMember(int teamId, int userId) {
        String sql = "insert into Team_User (teamId, userId)\n"
                + "values (?, ?);";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, teamId);
            ps.setInt(2, userId);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void deleteMember(int teamId, int userId) {
        String sql = "delete from Team_User\n"
                + "where teamId = ? and userId = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, teamId);
            ps.setInt(2, userId);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        TeamDAO t = new TeamDAO();
//        System.out.println(t.getAllTeams());
//        t.addTeam("AI", 6, "demo1");
        t.addMember(3, 10);
    }
}
