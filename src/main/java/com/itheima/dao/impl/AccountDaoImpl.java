package com.itheima.dao.impl;

import com.itheima.dao.IAccountDao;
import org.springframework.stereotype.Repository;

/**
 * @author yangbin
 * @create 2019-10-04 11:12
 */

@Repository("accountDao")
public class AccountDaoImpl implements IAccountDao {

    /**
     * 保存账户
     */
    public void saveAccount() {
        System.out.println("保存了账户！");
    }
}
