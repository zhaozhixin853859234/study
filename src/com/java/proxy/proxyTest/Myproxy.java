package com.java.proxy.proxyTest;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-07 16:03
 */
public class Myproxy {

    public static void main(String[] args) {
        // 目标对象
        Wang wang = new Wang();
        // 实例化调用业务处理类
        MyInvocationHandler handler = new MyInvocationHandler(wang);

        // 类加载器
        ClassLoader loader = Myproxy.class.getClassLoader();

        //获取目标对象的接口类对象数组
        Class<?>[] interfaces = wang.getClass().getInterfaces();

        // 创建代理
        /*
            public static Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler h)
                throws IllegalArgumentException
            loader:　　一个ClassLoader对象，定义了由哪个ClassLoader对象来对生成的代理对象进行加载
            interfaces:　　一个Interface对象的数组，表示的是我将要给我需要代理的对象提供一组什么接口，如果我提供了一组接口给它，
                   那么这个代理对象就宣称实现了该接口(多态)，这样我就能调用这组接口中的方法了
            h:　　一个InvocationHandler对象，表示的是当我这个动态代理对象在调用方法的时候，会关联到哪一个InvocationHandler对象上
         */
        Singer proxy = (Singer) Proxy.newProxyInstance(loader,interfaces,handler);

        System.out.println(proxy.getClass().getName());
        // 代理通知代理对象执行相关操作
        proxy.orderSong("aa");
        proxy.orderSong("bb");
        proxy.sayGoodBye("观众");
    }
}
