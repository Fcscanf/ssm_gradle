package com.test.mapper;

import com.fcant.bean.User;
import com.fcant.service.UserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * TestMybatis
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 17:06 2019-06-13/0013
 */
public class TestMybatis extends Junit4Test {

    @Autowired
    private UserService userService;

    @Test
    @Transactional
    @Rollback(false)
    public void test() {
        testUser();
    }

    private void testUser() {
        //add
        Map<String,Object> map = new HashMap<String,Object>();
        map.put("username", "jerry");
        map.put("password", "sl311");
        map.put("name", "Jerry bruce");
        userService.addUser(map);

        User user = new User();
        user.setUserName("jerry");
        user.setPassword("sl311");
        user = this.userService.getUser(user);
        System.out.println(user.getName());
    }

}
