package com.fcant.dao;

import org.springframework.stereotype.Repository;

import java.util.Map;

/**
 * RoleMapper
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 9:22 2019-06-14/0014
 */
@Repository
public interface RoleMapper {

    /**
     * 插入角色
     *
     * @param map
     * @return int
     * @author Fcscanf
     * @date 上午 9:23 2019-06-14/0014
     */
    public int insert(Map<String, Object> map);
}
