package com.masy.create.factory.abstractPattern;

/**
 * 海尔工厂（具体工厂）
 * @author: masy
 * @date: 2020/10/19 18:18
 * @version: 1.0
 */
public class HaierFactory implements Factory {

    /**
     * 创建海尔空调实例
     * @author: masy
     * @date: 2020/10/19 18:18
     * @version: 1.0
     * @return: com.masy.create.factory.abstractPattern.VRV
     */
    @Override
    public VRV createVRV() {
        System.out.println("海尔工厂---生产---海尔空调");
        return new HaierVRV();
    }

    /**
     * 创建海尔电视实例
     * @author: masy
     * @date: 2020/10/19 18:20
     * @version: 1.0
     * @return: com.masy.create.factory.abstractPattern.TV
     */
    @Override
    public TV createTV() {
        System.out.println("海尔工厂---生产---海尔电视");
        return new HaierTV();
    }
}
