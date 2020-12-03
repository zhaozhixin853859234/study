package com.java.proxy.reflectTest;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-07 17:06
 */
// HaShiQi类的构造方法为private，外部类不能new对象，
// 用反射机制获取HaShiQi类的私有成员变量java.lang.Field、
// 私有成员方法java.lang.Method、私有构造方法java.lang.Constructor
public class HaShiQi implements Dog{
    // 私有属性
    private String name = "小明";
    private String color = "黑色";

    // 私有构造方法
    private HaShiQi(){};

    // 公共方法
    @Override
    public void eat() {
        System.out.println(name+"吃狗粮");
    }

    @Override
    public void run(String xiaoming) {
        System.out.println(name+xiaoming+"跑步");

    }

    // 私有方法
    private void say(){
        System.out.println(color+"的"+name+":汪汪汪！");
    }

    @Override
    public String toString() {
        return "名字："+name +";颜色："+color;
    }
}
