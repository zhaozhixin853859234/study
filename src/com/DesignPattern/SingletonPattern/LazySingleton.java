package com.DesignPattern.SingletonPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-24 09:48
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){}

    // 多线程下会出现不同线程同时调用该方法，
    // 并同时通过if条件判断，各自生成了不同对象，
    // 使用双重校验，声明volatile类型的单例对象
    public static LazySingleton getInstance(){
        if (lazySingleton==null)
            lazySingleton = new LazySingleton();
        return lazySingleton;
    }

}
