package com.itheima.proxy;

/**
 * @author yangbin
 * @create 2019-10-15 20:06
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 模拟一个消费者
 */
public class Client {
    public static void main(String[] args) {

        final Producer producer = new Producer();

        /**
         * 动态代理：
         *      特点：字节码随用随创建，随用随加载
         *      作用：
         */
        IProducer proxyProducer = (IProducer) Proxy.newProxyInstance(producer.getClass().getClassLoader(),
                producer.getClass().getInterfaces(),
                new InvocationHandler(){
                    /**
                     * 作用：
                     * @param proxy
                     * @param method
                     * @param args
                     * @return
                     * @throws Throwable
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        Object returnValue = null;

                        Float money = (Float) args[0];
                        if("saleProduct".equals(method.getName())){
                            returnValue = method.invoke(producer,money*0.8f);
                        }
                        return returnValue;
                    }
                });
        proxyProducer.saleProduct((1000f));
    }
}
