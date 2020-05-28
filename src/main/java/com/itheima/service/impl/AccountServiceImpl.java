package com.itheima.service.impl;

import com.itheima.service.IAccountService;

/**
 * @author yangbin
 * @create 2019-11-29 21:49
 *
 * 账户的业务实现类
 */
public class AccountServiceImpl implements IAccountService {

    public void saveCccount() {
        System.out.println("执行了保存操作。。。。。");
    }

    public void updateAccount(int i) {
        System.out.println("执行了更新操作。。。" + i);
    }

    public int deleteAccount() {
        System.out.println("执行了删除。。。。。");
        return 0;
    }
}
