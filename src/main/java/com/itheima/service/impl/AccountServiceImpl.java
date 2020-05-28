package com.itheima.service.impl;

import com.itheima.dao.IAccountDao;
import com.itheima.dao.impl.AccountDaoImpl;
import com.itheima.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author yangbin
 * @create 2019-10-04 11:06
 */

/**
 * 账户的业务层实现类
 *
 * 曾经xml的配置
 * <bean id="accountService" class="com.itheima.service.impl.AccountServiceImpl" ></bean>
 *
 */

@Component(value = "accountService")
public class AccountServiceImpl implements IAccountService {

    @Autowired
    @Qualifier
    private IAccountDao accountDao ;

    public AccountServiceImpl(){
        System.out.println("对象创建了。。。。");
    }

    /**
     * 保存账户
     */
    public void saveAccount() {
        accountDao.saveAccount();
    }
}
