package com.itheima.dao;

import com.itheima.damain.Account;

/**
 * @author yangbin
 * @create 2020-02-26 20:26
 *
 * 账号的持久层接口
 */

public interface IAccountDao {

    /**
     * 根据ID查询账户
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 根据姓名来查询账户
     * @param accountName
     * @return
     */
    Account findAccountByName(String accountName);

    /**
     * 更新账户
     * @param account
     */
    void updeteAccount(Account account);


}
