package com.java.proxy.reflectTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-07 19:39
 */
public class LookDog {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        // 获取类对象
        Class lookDog = HaShiQi.class;

        // 查看所有成员变量，私有和公共
        Field[] fields = lookDog.getDeclaredFields();
        for (Field field:fields) {
            field.setAccessible(true);
            System.out.println(field);
        }

        // 查看所有成员方法，私有、重写、公共
        Method[] methods = lookDog.getDeclaredMethods();
        for (Method m:methods) {
            m.setAccessible(true);
            System.out.println(m);
        }

        // 查看所有构造方法
        Constructor[] constructors = lookDog.getDeclaredConstructors();
        for (Constructor c: constructors) {
            c.setAccessible(true);
            System.out.println(c);
        }

        // 获取HaShiQi类的对象（实例）
        Constructor cons = lookDog.getDeclaredConstructor();
        cons.setAccessible(true);
        HaShiQi haShiQi = (HaShiQi) cons.newInstance();

        // 修改私有成员变量
        Field field = lookDog.getDeclaredField("color");
        System.out.println("没有修改前对象:"+haShiQi.toString());
        field.setAccessible(true);
        field.set(haShiQi,"红色");
        System.out.println("修改颜色后对象:"+ haShiQi.toString());

        // 调用私有成员方法
        Method method = lookDog.getDeclaredMethod("say");
        method.setAccessible(true);
        method.invoke(haShiQi,null);
    }
}
