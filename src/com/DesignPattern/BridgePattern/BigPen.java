package com.DesignPattern.BridgePattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-28 09:56
 */
public class BigPen extends Pen {
    @Override
    public void setColor(Color color) {
        super.setColor(color);
    }

    @Override
    public void pain() {
        System.out.print("使用大号笔,");
        price.selectPrice();
        color.selectColor();
    }
}
