package com.masy.create.factory.method;

/**
 * 苹果工厂（具体工厂：实现了抽象工厂）
 * @Author: masy
 * @Date: 2020/10/19 13:47
 * @Version: 1.0
 */
public class AppleFactory implements Factory{

    /**
     * 生成苹果产品实例，实现创建产品的抽象方法
     * @Author: masy
     * @Date: 2020/10/19 13:48
     * @Version: 1.0
     * @Return: com.masy.create.factory.method.Product
     */
    @Override
    public Product createProduct() {
        System.out.println("苹果工厂---生产---苹果产品");
        return new AppleProduct();
    }
}
