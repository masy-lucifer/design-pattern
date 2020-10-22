package com.masy.create.builder;

/**
 * 抽象建造者
 * @Author: masy
 * @Date: 2020/10/22 13:59
 * @Version: 1.0
 */
public abstract class Builder {

    protected Product product = new Product();

    /**
     * 组建名称
     * @Author: masy
     * @Date: 2020/10/22 14:02
     * @Version: 1.0
     * @return void
     */
    public abstract void builderName();

    /**
     * 组建类型
     * @Author: masy
     * @Date: 2020/10/22 14:02
     * @Version: 1.0
     * @return void
     */
    public abstract void builderType();

    /**
     * 返回产品
     * @Author: masy
     * @Date: 2020/10/22 14:03
     * @Version: 1.0
     * @return com.masy.create.builder.Product
     */
    public abstract Product getResult();
}
