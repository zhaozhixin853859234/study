package com.DesignPattern.BridgePattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-28 09:50
 */
public abstract class Pen {
    protected Color color;
    protected Price price;
    public void setColor(Color color){
        this.color = color;
    }

    public void setPrice(Price price){
        this.price=price;
    }
    public abstract void pain();
}
