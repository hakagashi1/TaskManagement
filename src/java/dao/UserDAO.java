/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ZenBook
 */
public class UserDAO extends DBContext {

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
        } catch(Exception e) {
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
                
                return u;
            }
        } catch(Exception e) {
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
        } catch(Exception e) {
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
    
    public static void main(String[] args) {
        UserDAO u = new UserDAO();
        System.out.println(u.checkEmailExist("baa@gmail.com"));
    }
}
