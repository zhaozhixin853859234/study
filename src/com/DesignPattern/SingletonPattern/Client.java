package com.DesignPattern.SingletonPattern;

import com.sun.org.apache.bcel.internal.generic.InstructionConstants;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-24 09:45
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(EagerSingleton.getInstance() == EagerSingleton.getInstance());
        System.out.println(LazySingleton.getInstance() == LazySingleton.getInstance());
        System.out.println(DoubleVerifyLockSingleton.getInstance()==DoubleVerifyLockSingleton.getInstance());
//        Client client = new Client();
//        System.out.println(client.test());
    }
    //
//    private Boolean test(){
//        this.test();
//        Client.class.
//        return this.getClass()==Client.class;
//    }
}
