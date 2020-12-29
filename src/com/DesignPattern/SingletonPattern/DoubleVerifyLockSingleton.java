package com.DesignPattern.SingletonPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-25 10:23
 */
public class DoubleVerifyLockSingleton {

    // volatile关键字屏蔽了JVM的代码优化，不是最优选择
    private volatile static DoubleVerifyLockSingleton instance = null;

    private DoubleVerifyLockSingleton(){}

    public static DoubleVerifyLockSingleton getInstance(){
        if (instance==null){
            synchronized (DoubleVerifyLockSingleton.class){
                if (instance==null)
                    instance = new DoubleVerifyLockSingleton();
            }
        }
        return instance;

    }
}
