package com.masy.create.factory.method;

/**
 * 工厂方法模式测试类
 * @Author: masy
 * @Date: 2020/10/19 13:58
 * @Version: 1.0
 */
public class FactoryMethodTest {

    public static void main(String[] args) {
        // 1、创建苹果实例
        Factory fruitsFactory = new AppleFactory();
        Product fruitsProduct = fruitsFactory.createProduct();
        fruitsProduct.show();

        // 2、创建香蕉实例
        Factory veggieFactory = new BananaFactory();
        Product veggieProduct = veggieFactory.createProduct();
        veggieProduct.show();

        // 当需要增加产品是，直接增加一个具体产品类实现抽象产品接口和增加一个具体工厂类实现抽象工厂接口。
    }
}
