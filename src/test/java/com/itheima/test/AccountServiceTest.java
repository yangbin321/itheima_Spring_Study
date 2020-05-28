package com.itheima.test;

/**
 * @author yangbin
 * @create 2019-10-11 20:01
 */

import com.itheima.domain.Account;
import com.itheima.service.IAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * 使用junit测试我们的配置
 */
public class AccountServiceTest {

    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll() {
        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
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
        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
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
        account.setName("save");
        account.setMoney(12345f);
        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        //3、执行方法
        as.saveAccount(account);

    }

    /**
     * 测试更新
     */
    @Test
    public void testUpdate() {
        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
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
        //1、获取容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //2、得到业务层对象
        IAccountService as = ac.getBean("accountService",IAccountService.class);
        //3、执行方法
        as.deleteAccount(4);
    }
}
