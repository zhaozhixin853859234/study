package com.DesignPattern.BuilderPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 16:11
 */
public class Client {
    public static void main(String[] args) {
        // 用不同的建造者类为Product初始化不同的值
        ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
        Product constructRes1 = Director.construct(concreteBuilder1);
        System.out.println(constructRes1.toString());

        ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();
        Product constructRes2 = Director.construct(concreteBuilder2);
        System.out.println(constructRes2.toString());

        Builder concreteBuilder11 = new ConcreteBuilder2();
        Product construct = Director.construct(concreteBuilder11);
        System.out.println(construct.toString());

    }
}
