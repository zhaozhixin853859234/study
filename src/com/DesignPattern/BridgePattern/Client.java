package com.DesignPattern.BridgePattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-28 09:58
 */

// 需求：用不同型号的笔画出不同颜色，
// 对象：笔
// 对象的两个变化维度：笔有小号、中号、大号；笔的颜色有黑色、红色、绿色
// 采用桥接模式，笔的型号和颜色可以动态变化而不用修改原码，
// 这部分很重要：设计型号为笔的抽象部分，颜色为笔的具体实现部分
// 因为型号是笔的固有属性，而笔和颜色之间是“设置”关系
// 注意：为笔新增一个维度，例如价格时，需要修改原码，不符合开闭原则，
// 所以在设计就要考虑好对象的多个维度，避免设计完成后增加对象的维度
public class Client {
    public static void main(String[] args) {
        Color green = new Green();
        BigPen bigPen = new BigPen();
        HighPrice highPrice = new HighPrice();
        bigPen.setPrice(highPrice);
        bigPen.setColor(green);
        bigPen.pain();

        Black black = new Black();
        bigPen.setColor(black);
        bigPen.pain();

        Red red = new Red();
        bigPen.setColor(red);
        bigPen.pain();

        SmallPen smallPen = new SmallPen();
        LowPrice lowPrice = new LowPrice();
        smallPen.setPrice(lowPrice);
        smallPen.setColor(black);
        smallPen.pain();

        smallPen.setColor(green);
        smallPen.pain();

    }
}
