package com.DesignPattern.AbstractFactoryPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 14:52
 */
public class SpringButton implements Button {
    @Override
    public void display() {
        System.out.println("Spring风格按钮");
    }
}
