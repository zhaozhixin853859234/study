package com.DesignPattern.BuilderPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 16:10
 */
public class Director {
    // 控制对象成员变量的构造顺序
    public static Product construct(Builder builder){
        builder.buildPartC();
        builder.buildPartA();
        builder.buildPartB();
        return builder.getBuildResult();
    }

    public static Product construct(ConcreteBuilder1 builder){
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
        System.out.println("ConcreteBuilder1构建对象完成！");
        return builder.getBuildResult();
    }

    public static Product construct(ConcreteBuilder2 builder){
        builder.buildPartA();
        builder.buildPartC();
        builder.buildPartB();
        System.out.println("ConcreteBuilder2构建对象完成！");
        return builder.getBuildResult();
    }
}
