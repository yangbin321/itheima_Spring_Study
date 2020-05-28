package com.itheima.jdbctemplate;

import com.sun.org.apache.xalan.internal.xsltc.compiler.Template;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import java.sql.DriverManager;

/**
 * @author yangbin
 * @create 2020-02-23 21:43
 *
 * JdbcTemplataDemo1的最基本用法
 */
public class JdbcTemplateDemo1 {

    public static void main(String[] args) {
        //准备数据源：spring的内置数据源
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/eesy");
        ds.setUsername("root");
        ds.setPassword("123321");

        //1、创建JdbcTemplataDemo1对象
        JdbcTemplate jt = new JdbcTemplate();

        jt.setDataSource(ds);
        //2、执行操作
        jt.execute("insert into account(name,money)values('abc',1111)");
    }
}
