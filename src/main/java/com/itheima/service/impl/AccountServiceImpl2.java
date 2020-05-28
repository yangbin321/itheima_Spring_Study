package com.itheima.service.impl;

import com.itheima.service.IAccountService;

import java.util.Date;

/**
 * @author yangbin
 * @create 2019-10-04 11:06
 */

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl2 implements IAccountService {

    //如果是经常变化的数据，并不适用于注入的方式
    private String name;
    private Integer age;
    private Date birthday;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * 保存账户
     */
    public void saveAccount(){
        System.out.println("service中的saveAccount方法执行了...."+ "," + name + "," + age + "," + birthday);
    }

}
