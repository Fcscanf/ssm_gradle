package com.fcant.service.impl;

import com.fcant.dao.RoleMapper;
import com.fcant.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * RoleServiceImpl
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:27 2019-06-14/0014
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int addRole(Map<String, Object> map) {
        return roleMapper.insert(map);
    }
}
