package com.itheima.factory;

import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;

/**
 * @author yangbin
 * @create 2019-10-07 10:31
 */

/**
 * 模拟一个工厂类，该类可能存在于jar包中的，我们无法通过修改源码的方式来提供默认构造函数
 */
public class InstanceFactory {
    public IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
