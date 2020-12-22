package com.DesignPattern.AbstractFactoryPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 14:57
 */
public class Client {
    public static void main(String[] args) {
        SpringFactory springFactory = new SpringFactory();
        Button button = springFactory.createButton();
        button.display();
        TextField textField = springFactory.createTextField();
        textField.display();

        SummerFactory summerFactory = new SummerFactory();
        Button button1 = summerFactory.createButton();
        button1.display();
        TextField textField1 = summerFactory.createTextField();
        textField1.display();
    }
}
