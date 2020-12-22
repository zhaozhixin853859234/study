package com.DesignPattern.SimpleFactoryPattern;

public abstract class Product {
    public void publicMethod(){
        System.out.println("抽象产品类的公共方法");
    }

    public abstract void abstractMethod();

}
