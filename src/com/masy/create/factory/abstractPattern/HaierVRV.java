package com.masy.create.factory.abstractPattern;

/**
 * 海尔空调（具体产品）
 * @author: masy
 * @date: 2020/10/19 18:05
 * @version: 1.0
 */
public class HaierVRV implements VRV{

    /**
     * 实现抽象产品的抽象方法
     * @author: masy
     * @date: 2020/10/19 18:05
     * @version: 1.0
     * @return: void
     */
    @Override
    public void showVRV() {
        System.out.println("这是海尔空调");
    }
}
