package com.DesignPattern.BridgePattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-28 09:55
 */
public class MiddlePen extends Pen{

    @Override
    public void pain() {
        System.out.print("使用中号笔,");
        price.selectPrice();
        color.selectColor();
    }
}
