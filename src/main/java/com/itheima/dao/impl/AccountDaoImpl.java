package com.itheima.dao.impl;

import com.itheima.damain.Account;
import com.itheima.dao.IAccountDao;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author yangbin
 * @create 2020-02-26 20:31
 * 账户的持久层实现类
 */
public class AccountDaoImpl implements IAccountDao {

    private JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public Account findAccountById(Integer accountId) {
        return null;
    }

    public Account findAccountByName(String accountName) {
        return null;
    }

    public void updeteAccount(Account account) {

    }
}
