package com.DesignPattern.AbstractFactoryPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 14:53
 */
public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("Spring风格文本框");
    }
}
