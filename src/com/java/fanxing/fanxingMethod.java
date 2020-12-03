package com.java.fanxing;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-30 15:52
 */
public class fanxingMethod {

    public <A,B,C> void f(A a,B b,C c){
        System.out.println(a.getClass().getName());
        System.out.println(b.getClass().getName());
        System.out.println(c.getClass().getName());
    }

    public static void main(String[] args) {
        fanxingMethod o = new fanxingMethod();
        o.f(1,2,3);
        o.f(1,"sad",1.22);
        o.f('s',o,1);
    }
}
