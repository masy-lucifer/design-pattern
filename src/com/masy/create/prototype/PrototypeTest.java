package com.masy.create.prototype;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * 原型模式测试类
 * @Author: masy
 * @Date: 2020/10/23 16:00
 * @Version: 1.0
 */
public class PrototypeTest {

    public static void main(String[] args) {
        shallowCloneTest();
        deepCloneTest();
    }

    /**
     * 浅复制测试
     * @Author: masy
     * @Date: 2020/10/23 17:13
     * @Version: 1.0
     * @param
     * @return void
     */
    private static void shallowCloneTest() {
        System.out.println("===========浅复制============");
        List<String> list = new ArrayList<>();
        Prototype prototype1 = new Prototype();
        prototype1.setStrs(list);
        Prototype prototype2 = (Prototype)prototype1.clone();
        System.out.println(prototype1 == prototype2);
        System.out.println(prototype1.getStrs() == prototype2.getStrs());
    }

    /**
     * 深度复制测试
     * @Author: masy
     * @Date: 2020/10/23 17:16
     * @Version: 1.0
     * @param
     * @return void
     */
    private static void deepCloneTest() {
        System.out.println("===========深复制============");
        List<String> list = new ArrayList<>();
        Prototype prototype1 = new Prototype();
        prototype1.setStrs(list);
        Prototype prototype2 = (Prototype)prototype1.deepClone();
        System.out.println(prototype1 == prototype2);
        System.out.println(prototype1.getStrs() == prototype2.getStrs());
    }
}
