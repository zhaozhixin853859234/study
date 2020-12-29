package com.DesignPattern.BridgePattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-28 10:18
 */
public class LowPrice implements Price{
    @Override
    public void selectPrice() {
        System.out.print("选择低价格,");
    }
}
