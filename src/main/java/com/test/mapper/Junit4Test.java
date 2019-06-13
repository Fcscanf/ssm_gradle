package com.test.mapper;

/**
 * Junit4Test
 * <p>
 * encoding:UTF-8
 *
 * @author Fcscanf
 * @description
 * @date 下午 17:04 2019-06-13/0013
 */


import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" }) // 加载配置文件
@TransactionConfiguration(transactionManager="transactionManager",defaultRollback=true)

public class Junit4Test {
}
