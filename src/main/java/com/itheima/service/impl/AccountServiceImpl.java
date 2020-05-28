package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;

/**
 * @author yangbin
 * @create 2019-10-04 11:06
 */

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao = new AccountDaoImpl();

    /**
     * 保存账户
     */
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
