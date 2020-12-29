package com.DesignPattern.DecoratorPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-29 10:24
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
        addMethod();
    }

    private void addMethod(){
        System.out.println("这是在类"+ConcreteDecorator.class+"中为对象新增的功能实现");
    }
}
