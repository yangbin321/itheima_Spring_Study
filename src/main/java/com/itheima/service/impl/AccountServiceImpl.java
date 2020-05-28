package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.domain.Account;
import com.itheima.service.IAccountService;

import java.util.List;

/**
 * @author yangbin
 * @create 2019-10-10 23:08
 */

/**
 * 账户的业务层实现类
 *
 *
 */
public class AccountServiceImpl implements IAccountService {

    private IAccountDao accountDao;


    public void setAccountDao(IAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void findAllAccount() {
        List<Account> accounts = accountDao.findAllAccount();
         for (Account account :accounts){
             System.out.println(account);
         }
    }

    public void findAccountById(Integer accountId) {

        Account account =accountDao.findAccountById(accountId);
        System.out.println(account);
    }

    public void saveAccount(Account account) {
        accountDao.saveAccount(account);
    }

    public void updateAccount(Account account) {

        accountDao.updateAccount(account);

    }

    public void deleteAccount(Integer accountId) {

        accountDao.deleteAccount(accountId);
    }

    public void transfer(String sourceName, String targetName, Float money) {

            //2、执行操作
            //2.1、根据名称查询转出账户
            Account source = accountDao.findAccountByName(sourceName);
            //2.2、根据名称查询转入账户
            Account target = accountDao.findAccountByName(targetName);
            //2.3、转出账户减钱
            source.setMoney(source.getMoney() - money);
            //2.4、转入账户加钱
            target.setMoney(target.getMoney() + money);
            //2.5、更新转出账户
            accountDao.updateAccount(source);

            int i = 1/0;

            //2.6、更新转入账户
            accountDao.updateAccount(target);
    }
}
