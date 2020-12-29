package com.DesignPattern.BridgePattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-28 09:57
 */
public class Green implements Color {
    @Override
    public void selectColor() {
        System.out.println("选择绿色着色");
    }
}
