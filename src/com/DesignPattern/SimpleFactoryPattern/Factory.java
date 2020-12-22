package com.DesignPattern.SimpleFactoryPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 10:54
 */
public class Factory {
    public static Product getProduct(String productName){
        Product product = null;
        if (productName.equalsIgnoreCase("A"))
            product = new ProductA();
        else  if (productName.equalsIgnoreCase("B"))
            product =new ProductB();
        return product;
    }
}
