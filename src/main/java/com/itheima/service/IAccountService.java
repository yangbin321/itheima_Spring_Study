package com.itheima.service;

/**
 * @author yangbin
 * @create 2019-10-10 23:00
 */

import com.itheima.domain.Account;

/**
 * 账户的业务层接口
 */
public interface IAccountService {

    /**
     * 查询所有
     */
    void findAllAccount();

    /**
     * 查询一个
     */
    void findAccountById(Integer accountId);

    /**
     * 保存操作
     * @param account
     */
    void saveAccount(Account account);

    /**
     * 更新
     * @param account
     */
    void updateAccount(Account account);

    /**
     * 删除
     * @param accountId
     */
    void deleteAccount(Integer accountId);

    /**
     * 转账
     * @param sourceName    转出账户名称
     * @param targetName    转入账户名称
     * @param money         转账金额
     */
    void transfer(String sourceName,String targetName,Float money);
}
