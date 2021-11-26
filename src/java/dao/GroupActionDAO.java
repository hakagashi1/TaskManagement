/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.GroupAction;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZenBook
 */
public class GroupActionDAO extends DBContext{
    public GroupAction getGroupActionById(int groupId) {
        String sql = "SELECT * FROM Group_Action where id = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, groupId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                GroupAction group = new GroupAction();
                group.setId(rs.getInt("id"));
                group.setName(rs.getString("groupName"));
                return group;
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return null;
    }
    
    public static void main(String[] args) {
        GroupActionDAO g = new GroupActionDAO();
        System.out.println(g.getGroupActionById(1));
    }
}
