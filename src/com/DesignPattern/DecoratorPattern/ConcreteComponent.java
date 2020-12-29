package com.DesignPattern.DecoratorPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-29 10:22
 */
public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("这是对象在类"+ConcreteComponent.class+"中的基本功能实现");
    }
}
