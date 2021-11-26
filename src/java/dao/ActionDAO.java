/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entity.Action;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ZenBook
 */
public class ActionDAO extends DBContext{
    public List<Action> getAllActions() {
        List<Action> list = new ArrayList<>();
        String sql = "SELECT * FROM Action";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Action action = new Action();
                action.setId(rs.getInt("id"));
                action.setName(rs.getString("actionName"));
                action.setGroup(new GroupActionDAO().getGroupActionById(rs.getInt("groupId")));
                action.setActionCode(rs.getString("actionCode"));
                list.add(action);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return list;
    }
    
    public List<Action> getActionByGroupId(int groupId) {
        List<Action> list = new ArrayList<>();
        String sql = "SELECT * FROM Action where groupId = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, groupId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Action action = new Action();
                action.setId(rs.getInt("id"));
                action.setName(rs.getString("actionName"));
                action.setGroup(new GroupActionDAO().getGroupActionById(rs.getInt("groupId")));
                action.setActionCode(rs.getString("actionCode"));
                list.add(action);
            }
        } catch (Exception e) {
            System.err.print(e);
        }
        return list;
    }
    
    public static void main(String[] args) {
        ActionDAO a = new ActionDAO();
        System.out.println(a.getActionByGroupId(2));
    }
}
