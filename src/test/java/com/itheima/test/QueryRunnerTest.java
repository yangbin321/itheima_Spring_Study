package com.itheima.test;

/**
 * @author yangbin
 * @create 2019-10-11 23:15
 */

import comfig.SpringConfiguration;
import org.apache.commons.dbutils.QueryRunner;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * 测试QueryRunner是否单例
 */
public class QueryRunnerTest {

    @Test
    public void testQueryRunner(){
        //1、获取容器
        ApplicationContext ac = new AnnotationConfigApplicationContext(SpringConfiguration.class);
        //2、获取QueryRunner对象
        QueryRunner runner1 = ac.getBean("runner",QueryRunner.class);
        QueryRunner runner2 = ac.getBean("runner",QueryRunner.class);
        System.out.println(runner1 == runner2);
    }
}
