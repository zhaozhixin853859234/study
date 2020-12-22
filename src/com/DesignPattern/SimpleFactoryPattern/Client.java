package com.DesignPattern.SimpleFactoryPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 10:56
 */
public class Client {
    public static void main(String[] args) {
        Product product;
        // 通过传入产品名字匹配对应的产品对象
        // 优点：控制反转的思想，根据用户的需要创建对应对象，将对象的创建决定权转移到用户手中
        // 缺点：增加产品时需要修改工厂类，违反开闭原则
        product = Factory.getProduct("B");
        product.abstractMethod();
        product.publicMethod();
    }
}
