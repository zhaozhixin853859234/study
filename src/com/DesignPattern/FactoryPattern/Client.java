package com.DesignPattern.FactoryPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 11:07
 */
public class Client {
    public static void main(String[] args) {
        Factory factoryA = new FactoryA();
        Product productA = factoryA.getProduct();
        productA.abstractMethod();
        productA.publicMethod();

        Factory factoryB = new FactoryB();
        Product productB = factoryB.getProduct();
        productB.abstractMethod();
        productB.publicMethod();

        // 优点：增加产品时增加对应的工厂实现类和产品实现类，不需要修改原码，符合开闭原则
        // 缺点：增加一个产品需要增加两个类，增加系统负担
//        Factory factoryC = new FactoryC();
//        Product productC = factoryC .getProduct();
//        productB.abstractMethod();
//        productB.publicMethod();
    }
}
