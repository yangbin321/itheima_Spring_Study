package com.itheima.ui;

/**
 * @author yangbin
 * @create 2019-10-04 11:15
 */

import com.itheima.dao.IAccountDao;
import com.itheima.service.IAccountService;
import com.itheima.service.impl.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 模拟一个表现层，用于调用业务层
 */
public class Client {
    /**
     * 获取spring的Ioc核心容器，并根据id获取对象
     *
     *  ApplicationContext的三个常用实现类
     *         ClassPathXmlApplicationContext: (更常用的一种)
     *              它可以加载类路径下的配置文件，要求配置文件必须在类路径下。不在的话，加载不了。
     *         FileSystemXmlApplicationContext:
     *              它可以加载磁盘任意路径下的配置文件（必须有访问权限）
     *         AnnotationConfigApplicationContext:
     *              它是用于读取注解创建容器的。
     *
     *
     * 核心容器两个接口引发出的问题：
     *  ApplicationContext   -->  单例对象适用     开发中采用此接口多
     *      它在构建核心容器的时，创建对象采取的策略是采用立即加载的方式。
     *      也就是说，只要一读取完配置文件马上就创建配置文件中配置的对象。
     *
     *  BeanFactory:     -->  多例对象适用
     *      它在构建核心容器的时，创建对象采取的策略是采用延迟加载的方式。
     *      也就是说，什么时候根据id获取对象了，什么时候才真正的创建对象。
     *
     * @param args
     */
    public static void main(String[] args) {
       //1.获取核心容器对象
//        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        /**
         * 演示：FileSystemXmlApplicationContext
         */
        ApplicationContext ac = new
                FileSystemXmlApplicationContext("E:\\WorkDirectory\\workspace02\\IDEAspace" +
                "\\Spring\\Spring_day01_eesy_03spring\\src\\main\\resources\\bean.xml");
        //2.根据id获取bean对象
        IAccountService as = (IAccountService) ac.getBean("accountService");
        IAccountDao adao = ac.getBean("accountDao",IAccountDao.class);

        System.out.println(as);
        System.out.println(adao);

//       as.saveAccount();
    }
}
