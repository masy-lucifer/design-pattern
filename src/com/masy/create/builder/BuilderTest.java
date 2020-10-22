package com.masy.create.builder;

/**
 * 建造者模式测试
 * @Author: masy
 * @Date: 2020/10/22 14:23
 * @Version: 1.0
 */
public class BuilderTest {

    public static void main(String[] args) {
        bmw();
        benz();
    }

    private static void bmw() {
        Builder builder = new BMWConcreteBuilder();
        Directon directon = new Directon(builder);
        Product product = directon.construct();
        System.out.println(product.getName());
        System.out.println(product.getType());
    }

    private static void benz() {
        Builder builder = new BenzConcreteBuilder();
        Directon directon = new Directon(builder);
        Product product = directon.construct();
        System.out.println(product.getName());
        System.out.println(product.getType());
    }
}
