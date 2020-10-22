package com.masy.create.builder;

/**
 * 具体建造者
 * @Author: masy
 * @Date: 2020/10/22 14:11
 * @Version: 1.0
 */
public class BenzConcreteBuilder extends Builder{

    /**
     * 组建名称
     * @Author: masy
     * @Date: 2020/10/22 14:02
     * @Version: 1.0
     * @return void
     */
    @Override
    public void builderName() {
        product.setName("奔驰");
    }

    /**
     * 组建类型
     * @Author: masy
     * @Date: 2020/10/22 14:02
     * @Version: 1.0
     * @return void
     */
    @Override
    public void builderType() {
        product.setType(2);
    }

    /**
     * 返回产品
     * @Author: masy
     * @Date: 2020/10/22 14:03
     * @Version: 1.0
     * @return com.masy.create.builder.Product
     */
    @Override
    public Product getResult() {
        return product;
    }
}
