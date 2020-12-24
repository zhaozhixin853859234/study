package com.DesignPattern.BuilderPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 16:09
 */
public class ConcreteBuilder2 extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("ConcreteBuilder2创建的部件A");
        System.out.println("ConcreteBuilder2创建的部件A");
    }

    @Override
    public void buildPartB() {
        product.setPartB("ConcreteBuilder2创建的部件B");
        System.out.println("ConcreteBuilder2创建的部件B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("ConcreteBuilder2创建的部件C");
        System.out.println("ConcreteBuilder2创建的部件C");
    }

    @Override
    public Product getBuildResult() {
        return product;
    }
}
