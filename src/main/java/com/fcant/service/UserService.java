package com.fcant.service;

import com.fcant.bean.User;

import java.util.List;
import java.util.Map;

/**
 * UserService
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 16:56 2019-06-13/0013
 */
public interface UserService {
    public void addUser(Map<String,Object> map);
    public int updateUser(Map<String, Object> map);
    public User getUser(User user);
    public User getUserInfo(User user);
    public List<User> getUserList();
}
