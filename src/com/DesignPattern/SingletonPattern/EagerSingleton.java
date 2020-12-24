package com.DesignPattern.SingletonPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-24 09:35
 */
public class EagerSingleton {
    private static final EagerSingleton eagerSingleton= new EagerSingleton();
    // 重要步骤：私有化构造函数，使得其他类不能new该类的对象
    private EagerSingleton(){

    }
    public static EagerSingleton getInstance(){
        return eagerSingleton;

    }
}
