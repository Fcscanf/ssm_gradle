package com.fcant.service.impl;

import com.fcant.bean.User;
import com.fcant.dao.UserMapper;
import com.fcant.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * UserServiceImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 16:57 2019-06-13/0013
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public void addUser(Map<String,Object> map) {
        userMapper.insert(map);
    }

    @Override
    public int updateUser(Map<String, Object> map) {
        return userMapper.update(map);
    }

    @Override
    public User getUser(User user) {
        return this.userMapper.getUser(user);
    }

    @Override
    public User getUserInfo(User user) {
        return this.userMapper.getUserInfo(user);
    }

    @Override
    public List<User> getUserList(){
        return this.userMapper.getUserList();
    }
}
