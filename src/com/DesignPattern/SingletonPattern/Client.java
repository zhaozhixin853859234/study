package com.DesignPattern.SingletonPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-24 09:45
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(EagerSingleton.getInstance()==EagerSingleton.getInstance());
        System.out.println(LazySingleton.getInstance()==LazySingleton.getInstance());
    }
}
