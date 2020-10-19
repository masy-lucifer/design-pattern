package com.masy.create.factory.method;

/**
 * 抽象工厂：提供了创建产品的接口
 * @Author: masy
 * @Date: 2020/10/19 13:44
 * @Version: 1.0
 */
public interface Factory {

    /**
     * 创建产品的抽象方法
     * @author: masy
     * @date: 2020/10/19 13:45
     * @version: 1.0
     * @return: Product 抽象产品
     */
    Product createProduct();
}
