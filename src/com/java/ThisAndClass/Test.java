package com.java.ThisAndClass;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-25 10:35
 */
public class Test {
    private String name;
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, NoSuchMethodException, NoSuchFieldException {
        Test test = new Test();
        System.out.println("this对象和Test.class对象比较："+test.isEqualInstance());
        System.out.println(test.isEqualClassName());
    }

    public Boolean isEqualInstance() throws IllegalAccessException, InstantiationException {
        return this==Test.class.newInstance();
    }

    public Boolean isEqualClassName() throws IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        Test test = Test.class.newInstance();
        Method isEqualInstance = Test.class.getMethod("isEqualInstance");
        Constructor<?>[] constructors = Test.class.getConstructors();
        Field field = Test.class.getDeclaredField("name");
        System.out.println(this.getClass());
        System.out.println(Test.class);
        return this.getClass().equals(Test.class);
    }


}
