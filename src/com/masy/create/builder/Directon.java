package com.masy.create.builder;

/**
 * 指挥者/导演
 * @Author: masy
 * @Date: 2020/10/22 14:17
 * @Version: 1.0
 */
public class Directon {

    private Builder builder = null;

    public Directon(Builder builder) {
        this.builder = builder;
    }

    /**
     * 组建产品实例
     * @Author: masy
     * @Date: 2020/10/22 14:21
     * @Version: 1.0
     * @return com.masy.create.builder.Product
     */
    public Product construct() {
        builder.builderName();
        builder.builderType();
        return builder.getResult();
    }

}
