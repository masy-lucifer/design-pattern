package com.masy.create.singleton;

/**
 * 单例测试类
 * @Author: masy
 * @Date: 2020/10/15 11:20
 * @Version: 1.0
 */
public class SingletonTest {

    public static void main(String[] args) {
//        lazySingletonTest();
        hungrySingletonTest();

    }

    private static void lazySingletonTest() {
        LazySingleton singleton = LazySingleton.getInstance();
        System.out.println(singleton.toString());
        LazySingleton singleton1 = LazySingleton.getInstance();
        System.out.println(singleton1.toString());
    }

    private static void hungrySingletonTest() {
        HungrySingleton singleton = HungrySingleton.getInstance();
        System.out.println(singleton.toString());
        HungrySingleton singleton1 = HungrySingleton.getInstance();
        System.out.println(singleton1.toString());
    }
}
