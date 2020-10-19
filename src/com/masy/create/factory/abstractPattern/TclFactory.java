package com.masy.create.factory.abstractPattern;

/**
 * TCL工厂（具体工厂）
 * @author: masy
 * @date: 2020/10/19 18:21
 * @version: 1.0
 */
public class TclFactory implements Factory {

    /**
     * 创建TCL空调实例
     * @author: masy
     * @date: 2020/10/19 18:21
     * @version: 1.0
     * @return: com.masy.create.factory.abstractPattern.VRV
     */
    @Override
    public VRV createVRV() {
        System.out.println("TCL工厂---生产---TCL空调");
        return new TclVRV();
    }

    /**
     * 创建TCl电视实例
     * @author: masy
     * @date: 2020/10/19 18:22
     * @version: 1.0
     * @return: com.masy.create.factory.abstractPattern.TV
     */
    @Override
    public TV createTV() {
        System.out.println("TCL工厂---生产---TCl电视");
        return new TclTV();
    }
}
