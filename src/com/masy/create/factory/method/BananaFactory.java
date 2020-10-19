package com.masy.create.factory.method;

/**
 * 香蕉工厂（具体工厂：实现了抽象工厂）
 * @Author: masy 
 * @Date: 2020/10/19 13:52
 * @Version: 1.0
 */
public class BananaFactory implements Factory{

    /**
     * 生成香蕉产品实例，实现创建产品的抽象方法
     * @Author: masy
     * @Date: 2020/10/19 13:56
     * @Version: 1.0
     * @Return: com.masy.create.factory.method.Product
     */
    @Override
    public Product createProduct() {
        System.out.println("香蕉工厂---生产---香蕉");
        return new BananaProduct();
    }
}
