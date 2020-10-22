package com.masy.create.builder;
/**
 * 产品类
 * @Author: masy
 * @Date: 2020/10/22 13:55
 * @Version: 1.0
 */
public class Product {

    /**名称*/
    private String name;
    /**类型*/
    private Integer type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
