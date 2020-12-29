package com.DesignPattern.BridgePattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-28 09:51
 */
public class SmallPen extends Pen {


    @Override
    public void pain() {
        System.out.print("使用小号笔,");
        price.selectPrice();
        color.selectColor();
    }
}
