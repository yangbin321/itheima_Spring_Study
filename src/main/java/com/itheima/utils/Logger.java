package com.itheima.utils;

/**
 * @author yangbin
 * @create 2019-11-29 21:54
 *
 * 用于记录日志的工具类，它里卖弄提供了公共的代码
 */
public class Logger {

    /**
     * 用于打印日志，计划让其在切入点方法执行之前执行（切入点方法就是业务层方法）
     */
    public void  ptintLog(){
        System.out.println("Logger类中的printLog方法开始记录日志了。。。。");
    }
}
