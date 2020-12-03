package com.java.designPattern.Singleton;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-08 16:27
 */
public class Singleton_LanHan {

    private static Singleton_LanHan singleInstance=null;

    private Singleton_LanHan(){}

    public static Singleton_LanHan getInstance(){
        if (singleInstance==null)
            singleInstance = new Singleton_LanHan();
        return singleInstance;
    }
}
