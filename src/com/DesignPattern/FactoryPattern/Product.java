package com.DesignPattern.FactoryPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 11:02
 */
public abstract class Product {
    public void publicMethod(){
        System.out.println("抽象产品类的公共方法");
    }

    public abstract void abstractMethod();

}
