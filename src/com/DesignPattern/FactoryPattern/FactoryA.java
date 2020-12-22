package com.DesignPattern.FactoryPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 11:04
 */
public class FactoryA extends Factory {
    @Override
    public Product getProduct() {
        return new ProductA();
    }
}
