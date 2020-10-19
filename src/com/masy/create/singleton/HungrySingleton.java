package com.masy.create.singleton;

/**
 * 饿汉单例模式
 * 特点：类在创建的同时就已经创建好一个静态的对象供系统使用，
 * 以后不会再改变，所以是线程安全的，可直接用于多线程。
 * @Author: masy
 * @Date: 2020/10/14 14:47
 * @Version: 1.0
 */
public class HungrySingleton {

    /**
     * 私有构造方法，防止被实例化
     * @Author: masy
     * @Date: 2020/10/15 11:25
     * @Version: 1.0
     */
    private HungrySingleton(){}

    /**
     * 使用内部类来维护单例
     * JVM内部机制一个类加载过程是线程互斥的
     * @Author: masy
     * @Date: 2020/10/15 11:27
     * @Version: 1.0
     */
    private static class HungrySingletonFactory {
        private static HungrySingleton instance = new HungrySingleton();
    }

    /**
     * 静态工程方法，创建实例
     * @Author: masy
     * @Date: 2020/10/15 13:39
     * @Version: 1.0
     */
    public static HungrySingleton getInstance() {
        return HungrySingletonFactory.instance;
    }

    /**
     * 如果该对象被用于序列化，可以保证对象在序列化前后保持一致
     * @Author: masy
     * @Date: 2020/10/14 14:32
     * @Version: 1.0
     * @Return: java.lang.Object
     */
    public Object readResolve() {
        return getInstance();
    }
}
