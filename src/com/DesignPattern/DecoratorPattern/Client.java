package com.DesignPattern.DecoratorPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-29 10:28
 */
public class Client {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        concreteComponent.operation();
        ConcreteDecorator concreteDecorator = new ConcreteDecorator(concreteComponent);
        concreteDecorator.operation();
    }
}
