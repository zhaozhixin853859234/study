package com.java.proxy.proxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-07 15:27
 */
public class MyInvocationHandler implements InvocationHandler {
    // 对象的作用
    private Object object;

    public MyInvocationHandler(Object o){
        this.object = o;
    }

    @Override
    /*
        proxy:　　指代我们所代理的那个真实对象
        method:　　指代的是我们所要调用真实对象的某个方法的Method对象
        args:　　指代的是调用真实对象某个方法时接受的参数
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("代理对象："+proxy.getClass().getName());

        System.out.println("代理真实对象前业务");
        for (Object arg:args) {
            System.out.println("传入参数"+arg);
        }

        method.invoke(object,args);
        System.out.println("代理真实对象后业务");

        return null;
    }
}
