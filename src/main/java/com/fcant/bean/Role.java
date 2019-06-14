package com.fcant.bean;

import lombok.Data;

/**
 * Role
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:20 2019-06-14/0014
 */
@Data
public class Role {
    private int roleID;
    private String roleName;
    private String description;
    private int isvalide;

    public int getRoleID() {
        return roleID;
    }

    public void setRoleID(int roleID) {
        this.roleID = roleID;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getIsvalide() {
        return isvalide;
    }

    public void setIsvalide(int isvalide) {
        this.isvalide = isvalide;
    }
}
