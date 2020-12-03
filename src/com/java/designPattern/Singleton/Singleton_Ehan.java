package com.java.designPattern.Singleton;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-08 16:25
 */
public class Singleton_Ehan {
    private Singleton_Ehan(){}
    private static final Singleton_Ehan singletonInstance = new Singleton_Ehan();
    public static Singleton_Ehan getInstance(){
        return singletonInstance;
    }
}
