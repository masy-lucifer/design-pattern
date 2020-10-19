package com.masy.create.factory.method;

/**
 * 香蕉（具体产品：实现抽象产品接口）
 * @Author: masy
 * @Date: 2020/10/19 13:41
 * @Version: 1.0
 */
public class BananaProduct implements Product{

    /**
     * 实现抽象产品接口的方法
     * @Author: masy
     * @Date: 2020/10/19 13:41
     * @Version: 1.0
     */
    @Override
    public void show() {
        System.out.println("这是具体产品：香蕉。");
    }
}
