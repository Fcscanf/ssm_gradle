package com.fcant.controller;

import com.fcant.bean.Role;
import com.fcant.dao.RoleMapper;
import com.fcant.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

/**
 * RolseController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:30 2019-06-14/0014
 */
@Controller
@RequestMapping("role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping("/addRole")
    public String addRole() {
        Map<String, Object> map = new HashMap<>();
        map.put("rolename", "管理员");
        map.put("description", "事物管理");
        roleService.addRole(map);
        return "userList";
    }
}
