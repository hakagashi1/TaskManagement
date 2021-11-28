/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 *
 * @author ZenBook
 */
public class UserDAO extends DBContext {

    public List<User> getAllUsers() {
        List<User> list = new ArrayList<>();
        String sql = "SELECT * FROM dbo.[User]";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setRole(new RoleDAO().getRoleById(rs.getInt("roleId")));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setFirstname(rs.getString("firstName"));
                u.setMiddlename(rs.getString("middleName"));
                u.setLastname(rs.getString("lastName"));
                u.setEmail(rs.getString("email"));
                u.setMobile(rs.getString("mobile"));
                u.setIntro(rs.getString("intro"));
                u.setProfile(rs.getString("profile"));
                list.add(u);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return list;
    }

    public List<User> getMembersByTeamId(int teamId) {
        List<User> list = new ArrayList<>();
        String sql = "select \n"
                + "	u.id,\n"
                + "	u.roleId,\n"
                + "	u.username,\n"
                + "	u.password,\n"
                + "	u.firstName,\n"
                + "	u.middleName,\n"
                + "	u.lastName,\n"
                + "	u.avatar,\n"
                + "	u.email,\n"
                + "	u.mobile,\n"
                + "	u.registerAt,\n"
                + "	u.lastLogin,\n"
                + "	u.intro,\n"
                + "	u.profile\n"
                + "from dbo.[User] u inner join Team_User tu\n"
                + "	on u.id = tu.userId\n"
                + "	inner join Team t\n"
                + "	on tu.teamId = t.id\n"
                + "where t.id = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, teamId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setRole(new RoleDAO().getRoleById(rs.getInt("roleId")));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setFirstname(rs.getString("firstName"));
                u.setMiddlename(rs.getString("middleName"));
                u.setLastname(rs.getString("lastName"));
                u.setEmail(rs.getString("email"));
                u.setMobile(rs.getString("mobile"));
                u.setIntro(rs.getString("intro"));
                u.setProfile(rs.getString("profile"));
                list.add(u);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return list;
    }
    
    public User getUserById(int id) {
        String sql = "select * from dbo.[User]\n"
                + "where id = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));u.setRole(new RoleDAO().getRoleById(rs.getInt("roleId")));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setFirstname(rs.getString("firstName"));
                u.setMiddlename(rs.getString("middleName"));
                u.setLastname(rs.getString("lastName"));
                u.setEmail(rs.getString("email"));
                u.setMobile(rs.getString("mobile"));
                u.setIntro(rs.getString("intro"));
                u.setProfile(rs.getString("profile"));
                return u;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public User checkUsernameExist(String username) {
        String sql = "select * from dbo.[User]\n"
                + "where username = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                return u;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public User checkUserExist(String username, String password) {
        String sql = "select * from dbo.[User]\n"
                + "where username = ? and password = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, username);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                u.setRole(new RoleDAO().getRoleById(rs.getInt("roleId")));
                u.setUsername(rs.getString("username"));
                u.setPassword(rs.getString("password"));
                u.setFirstname(rs.getString("firstName"));
                u.setMiddlename(rs.getString("middleName"));
                u.setLastname(rs.getString("lastName"));
                u.setEmail(rs.getString("email"));
                u.setMobile(rs.getString("mobile"));
                u.setIntro(rs.getString("intro"));
                u.setProfile(rs.getString("profile"));
                return u;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public User checkEmailExist(String email) {
        String sql = "select * from dbo.[User]\n"
                + "where email = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("id"));
                return u;
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public boolean checkPassword(String password, String repassword) {
        return false ? password.equals(repassword) : !password.equals(repassword);
    }

    public void register(String username, String email, String password, String firstname, String middlename, String lastname, String mobile, String roleId) {
        String sql = "insert into dbo.[User] (roleId, username, password, firstName, middleName, lastName, email, mobile, registerAt, lastLogin)\n"
                + "values (?, ?, ?, ?, ?, ?, ?, ?, GETDATE(), GETDATE());";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, roleId);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setString(4, firstname);
            ps.setString(5, middlename);
            ps.setString(6, lastname);
            ps.setString(7, email);
            ps.setString(8, mobile);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public String convertMili(long milliSeconds) {
        String dateFormat = "dd-MM-yyyy hh:mm a";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormat);
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(milliSeconds);
        return convertDateTime(simpleDateFormat.format(calendar.getTime()));
    }

    public String convertDateTime(String time) {
        String[] dt = time.split(" ");
        if (dt[2].equalsIgnoreCase("CH")) {
            String[] hh = dt[1].split(":");
            int h = Integer.parseInt(hh[0]) + 12;
            int m = Integer.parseInt(hh[1]);
            return dt[0] + " " + h + ":" + m;
        } else {
            return dt[0] + " " + dt[1];
        }
    }

    public void setLastLogin(int userId) {
        String sql = "update dbo.[user]\n"
                + "set lastLogin = getdate(),\n"
                + "where id = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, userId);
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        UserDAO u = new UserDAO();
//        u.setLastLogin("25-11-2021 10:04 CH", 1);
//        System.out.println(u.checkUserExist("aaa", "aaa"));
        System.out.println(u.convertDateTime("25-11-2021 10:04 CH"));
    }
}
