package com.masy.create.factory.abstractPattern;

/**
 * 抽象工厂模式测试类
 * @author: masy
 * @date: 2020/10/19 18:24
 * @version: 1.0
 */
public class AbstractFactoryTest {

    public static void main(String[] args) {
        // 1、生成海尔空调及电视实例
        Factory factory = new HaierFactory();
        VRV vrv = factory.createVRV();
        vrv.showVRV();
        TV tv = factory.createTV();
        tv.showTV();

        // 2、生成TCL空调及电视实例
        factory = new TclFactory();
        vrv = factory.createVRV();
        vrv.showVRV();
        tv = factory.createTV();
        tv.showTV();

        // 当需要增加一个产品等级时，需要增加一个抽象产品及其具体产品，并修改工厂（不满足开闭原则）;
        // 当需要增加一个产品族时，需要增加具体产品并增加这个产品族的工厂即可。
    }
}
