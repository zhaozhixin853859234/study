package com.DesignPattern.BuilderPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 16:06
 */
public class ConcreteBuilder1 extends Builder {
    @Override
    public void buildPartA() {
        product.setPartA("ConcreteBuilder1创建的部件A");
        System.out.println("ConcreteBuilder1创建的部件A");

    }

    @Override
    public void buildPartB() {
        product.setPartB("ConcreteBuilder1创建的部件B");
        System.out.println("ConcreteBuilder1创建的部件B");
    }

    @Override
    public void buildPartC() {
        product.setPartC("ConcreteBuilder1创建的部件C");
        System.out.println("ConcreteBuilder1创建的部件C");
    }

    @Override
    public Product getBuildResult() {
        return product;
    }
}
