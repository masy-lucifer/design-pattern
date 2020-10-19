package com.masy.create.factory.abstractPattern;

/**
 * 抽象工厂
 * @author: masy
 * @date: 2020/10/19 18:14
 * @version: 1.0
 */
public interface Factory {

    /**
     * 创建空调产品实例的抽象方法
     * @author: masy
     * @date: 2020/10/19 18:15
     * @version: 1.0
     * @return: com.masy.create.factory.abstractPattern.VRV
     */
    VRV createVRV();

    /**
     * 创建电视实例的抽象方法
     * @author: masy
     * @date: 2020/10/19 18:16
     * @version: 1.0
     * @return: com.masy.create.factory.abstractPattern.TV
     */
    TV createTV();
}
