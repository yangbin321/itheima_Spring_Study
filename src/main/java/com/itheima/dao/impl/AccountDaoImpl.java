package com.itheima.dao.impl;

import com.itheima.damain.Account;
import com.itheima.dao.IAccountDao;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

/**
 * @author yangbin
 * @create 2020-02-26 20:31
 * 账户的持久层实现类
 */
public class AccountDaoImpl extends JdbcDaoSupport implements IAccountDao {

    /**
     * 记得补全
     * @param accountId
     * @return
     */
    public Account findAccountById(Integer accountId) {
        List<Account> accounts = super.getJdbcTemplate().query("select * from account where id =");
        return accounts.isEmpty()?null:accounts.get(0);
    }

    /**
     * 记得补全
     * @param accountName
     * @return
     */
    public Account findAccountByName(String accountName) {
        List<Account> accounts = super.getJdbcTemplate().query("select * from account where name = #{accountName}");
        return accounts;
    }

    /**
     * 有错，一会儿记得修改
     * @param account
     */
    public void updeteAccount(Account account) {
        super.getJdbcTemplate().update("update account set name =? where id=?",account.getName());
    }
}
