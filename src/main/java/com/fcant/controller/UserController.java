package com.fcant.controller;

import com.fcant.bean.User;
import com.fcant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/**
 * UserController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 20:14 2019-06-13/0013
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private Logger logger;

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/validateUser")
    public String login(User user, HttpSession session) {
        user = userService.getUser(user);
        if(user == null) {
            return "login";
        }else {
            session.setAttribute("userName", user.getUserName());
            return "welcome";
        }
    }


    @RequestMapping("/regUser")
    public String regUser() {
        return "regUser";
    }

    @RequestMapping("/addUser")
    public String addUser(User user) {//新增用户
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("username", user.getUserName());
        map.put("password", user.getPassword());
        map.put("name", user.getName());
        this.userService.addUser(map);
        return "login";
    }

    @RequestMapping("/getUserInfo")
    String getUserInfo(User user,Model model) {
        user = this.userService.getUserInfo(user);
        model.addAttribute("user",user);
        return "userInfo";
    }

    @RequestMapping("/updateUser")
    String updateUser(User user) {
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("userId", user.getUserId());
        map.put("userName", user.getUserName());
        map.put("password", user.getPassword());
        map.put("name", user.getName());
        this.userService.updateUser(map);
        return "userInfo";
    }


    @RequestMapping(value = "/userlist")
    public String listUser(Model model) {//查看用户列表
        List<User> list = this.userService.getUserList();
        model.addAttribute("userList",list);
        return "userList";
    }

}

