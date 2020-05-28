package com.itheima.proxy;

/**
 * @author yangbin
 * @create 2019-10-15 20:05
 */
public interface IProducer {

    /**
     * 销售
     * @param money
     */
    public void saleProduct(float money);

    /**
     * 售后
     * @param money
     */
    public void afterService(float money);
}
