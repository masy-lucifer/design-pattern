package com.masy.create.factory.abstractPattern;

/**
 * 海尔电视（具体产品）
 * @author: masy
 * @date: 2020/10/19 18:06
 * @version: 1.0
 */
public class HaierTV implements TV{

    /**
     * 实现抽象方法
     * @author: masy
     * @date: 2020/10/19 18:09
     * @version: 1.0
     * @return: void
     */
    @Override
    public void showTV() {
        System.out.println("这是海尔电视");
    }
}
