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
        // 根据不同的皮肤风格设置不同风格的按钮和文本框，
        // 用户可以自定义选择皮肤，不需要修改原码
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
