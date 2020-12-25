package com.DesignPattern.AdapterPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-25 15:41
 */
public abstract class TargetCar {
    public void targetMove(){
        System.out.println("目标适配者移动");
    }

    public abstract void targetSound();
    public abstract void targetLight();
}
