package com.DesignPattern.BridgePattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-28 09:54
 */
public class Red implements Color {
    @Override
    public void selectColor() {
        System.out.println("选择红色着色");
    }
}
