package com.DesignPattern.SimpleFactoryPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 10:53
 */
public class ProductA extends Product {
    @Override
    public void abstractMethod() {
        System.out.println("产品A的抽象方法实现");
    }
}
