package com.DesignPattern.BuilderPattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-22 16:03
 */
public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract void buildPartC();

    protected Product product = new Product();
    public Product getBuildResult(){
        return product;
    }
}
