/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author ZenBook
 */
public class Action {
    private int id;
    private String name;
    private GroupAction group;
    private String actionCode;

    public Action() {
    }

    public Action(int id, String name, GroupAction group, String actionCode) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.actionCode = actionCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupAction getGroup() {
        return group;
    }

    public void setGroup(GroupAction group) {
        this.group = group;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    @Override
    public String toString() {
        return "Action{" + "id=" + id + ", name=" + name + ", group=" + group + ", actionCode=" + actionCode + '}';
    }
    
    
}
