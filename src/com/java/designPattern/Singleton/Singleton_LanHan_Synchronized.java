package com.java.designPattern.Singleton;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-08 16:29
 */
public class Singleton_LanHan_Synchronized {
    private static Singleton_LanHan_Synchronized instance =null;

    private Singleton_LanHan_Synchronized(){}

    public static synchronized Singleton_LanHan_Synchronized getInstance(){
        if (instance==null)
            instance=new Singleton_LanHan_Synchronized();
        return instance;
    }
}
