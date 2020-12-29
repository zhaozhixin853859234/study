package com.DesignPattern.BridgePattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-28 10:19
 */
public class HighPrice implements Price{

    @Override
    public void selectPrice() {
        System.out.print("选择高价格,");
    }
}
