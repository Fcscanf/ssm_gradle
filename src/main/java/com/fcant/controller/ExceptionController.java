package com.fcant.controller;

import com.fcant.exception.FcantException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.SQLException;

/**
 * ExceptionController
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 上午 11:16 2019-06-18/0018
 */
@Controller
@RequestMapping("/exception")
public class ExceptionController {

    @RequestMapping("/database")
    public String dataBaseException(String key) throws SQLException {
        if (key == null) {
            throw new SQLException("数据库错误");
        }
        return "querydata";
    }

    @RequestMapping("/custom")
    public String customException(String key) throws FcantException {
        if (key == null) {
            throw new FcantException("Fcant自定义异常");
        }
        return "querydata";
    }
}
