package com.itheima.factory;

/**
 * @author yangbin
 * @create 2019-10-04 11:21
 */

import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/**
 * 是一个创建Bena对象的工厂
 *
 * Bean：在计算机英语中，有可重用组件的含义。
 * JavaBean：用java语言编写的可重用组件。
 *      JavaBean   不等于   实体类
 *      JavaBean   远大于   实体类
 *
 *    它就是创建让我们的service和dao对象的。
 *
 *    第一步：需要一个配置文件来配置我们的service和dao
 *              配置的内容：唯一标识 = 全限定类名（key = value）
 *    第二步：通过读取配置文件中配置的内容，反射创建对象
 *
 *    配置文件可以是xml，也可以是properties
 *
 */
public class BeanFactory {

    /**
     * 定义一个Properties对象
     */
    private static Properties props;

    //定义一个Map，用于存放我们要创建的对象，我们把它称之为容器。
    private static Map<String,Object> beans;

    //使用静态代码块为Properties对象赋值
    static {
        try {
            //实例化对象
            props = new Properties();
            //获取Properties流对象,使用这样的方法可以避免发布或者移到其他电脑上也可以使用
            InputStream in = BeanFactory.class.getClassLoader().getResourceAsStream("bean.properties");
            props.load(in);
            //实例化容器
            beans  = new HashMap<String, Object>();
            //取出配置文件中所以的key
            Enumeration keys = props.keys();
            //遍历枚举
            while (keys.hasMoreElements()){
                //取出每个key
                String key = keys.nextElement().toString();
                //根据key获取value
                String beanPatn = props.getProperty(key);
                //反射创建对象
                Object value = Class.forName(beanPatn).newInstance();
                //把key和value存入容器中
                beans.put(key,value);
            }
        } catch (Exception e) {
            throw  new ExceptionInInitializerError("初始化properties失败！");
        }
    }

    /**
     *  根据Bean的名称，获取bean对象      单例的
     * @param benaName
     * @return
     */
    public static Object getBean(String benaName){
        return beans.get(benaName);
    }

    /**
     * 根据Bean的名称，获取bean对象
     * @param benaName
     * @return
     *
     * 这个是多例的对象
     *
    public static Object getBean(String benaName){

        Object bean = null;
        try {
            String beanPath = props.getProperty(benaName);
            bean = Class.forName(beanPath).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bean;
    }
    */
}
