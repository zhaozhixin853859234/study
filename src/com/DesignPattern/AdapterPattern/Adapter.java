package com.DesignPattern.AdapterPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-25 15:46
 */
public class Adapter extends TargetCar {
    private Adaptee1 adaptee1;
    private Adaptee2 adaptee2;
    public Adapter() {
        // 关联调用
        adaptee1 = new Adaptee1();
        adaptee2 = new Adaptee2();
    }

    @Override
    public void targetSound() {
        adaptee1.adapteeSound();
    }

    @Override
    public void targetLight() {
        adaptee2.adapteeLight();
    }
}
