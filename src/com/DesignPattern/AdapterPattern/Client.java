package com.DesignPattern.AdapterPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-25 15:48
 */
public class Client {
    // 将TargetCar中的targetLight()方法和targetSound()方法分别适配到
    // Adaptee1的adapteeSound()方法和Adaptee2的adapteeLight()方法
    // 前提条件是不能改变目标适配类或接口和被适配类的源码（方法名）
    // 客户端只会调用目标适配类中方法
    public static void main(String[] args) {
        TargetCar targetCar = new Adapter();
        targetCar.targetLight();
        targetCar.targetMove();
        targetCar.targetSound();
    }
}
