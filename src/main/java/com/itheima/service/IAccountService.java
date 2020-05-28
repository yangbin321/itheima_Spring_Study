package com.itheima.service;

import com.itheima.damain.Account;

/**
 * @author yangbin
 * @create 2020-02-29 11:12
 *
 * 账户的业务层接口
 */
public interface IAccountService {

    /**
     * 根据id查找账户信息
     * @param accountId
     * @return
     */
    Account findAccountById(Integer accountId);

    /**
     * 转账
     * @param sourceName    转出账户名称
     * @param targetNmae    转入账户名称
     * @param money         转账金额
     */
    void transfer(String sourceName,String targetNmae,float money);

}
