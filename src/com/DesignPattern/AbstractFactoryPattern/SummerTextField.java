package com.DesignPattern.AbstractFactoryPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 14:54
 */
public class SummerTextField implements TextField {
    @Override
    public void display() {
        System.out.println("Summer风格文本框");
    }
}
