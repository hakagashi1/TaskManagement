package dao;

import entity.Role;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ZenBook
 */
public class RoleDAO extends DBContext{
    public List<Role> getAllRoles() {
        List<Role> list = new ArrayList<>();
        String sql = "SELECT * FROM Role";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Role role = new Role();
                role.setId(rs.getInt("id"));
                role.setRole(rs.getString("role"));
                list.add(role);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return list;
    }
    
    public Role getRoleById(int id) {
        List<Role> list = new ArrayList<>();
        String sql = "SELECT * FROM Role where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Role role = new Role();
                role.setId(rs.getInt("id"));
                role.setRole(rs.getString("role"));
                list.add(role);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return null;
    }
    
    public static void main(String[] args) {
        RoleDAO r = new RoleDAO();
        System.out.println(r.getAllRoles());
    }
}
