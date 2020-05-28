package com.itheima.test;

/**
 * @author yangbin
 * @create 2019-10-11 20:01
 */

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import comfig.SpringConfiguration;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * 使用junit测试我们的配置
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SpringConfiguration.class)
public class AccountServiceTest {

    @Autowired
    private IAccountService as;

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll() {
        //3、执行方法
        List<Account> accounts = as.findAllAccount();
        for (Account account : accounts){
            System.out.println(account);
        }
    }

    /**
     * 测试查询一个
     */
    @Test
    public void testFindOne() {
        //3、执行方法
        Account account = as.findAccountById(1);
        System.out.println(account);
    }

    /**
     * 测试保存
     */
    @Test
    public void testSave() {
        Account account = new Account();
        account.setName("save anno");
        account.setMoney(12345f);

        //3、执行方法
        as.saveAccount(account);
    }

    /**
     * 测试更新
     */
    @Test
    public void testUpdate() {

        //3、执行方法
        Account account = as.findAccountById(5);
        account.setMoney(23456f);
        as.updateAccount(account);
    }

    /**
     * 测试删除
     */
    @Test
    public void testDelete() {

        //3、执行方法
        as.deleteAccount(4);
    }
}
