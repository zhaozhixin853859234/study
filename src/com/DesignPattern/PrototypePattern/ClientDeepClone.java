package com.DesignPattern.PrototypePattern;

import java.io.IOException;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-23 14:57
 */
public class ClientDeepClone {
    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        Address address = new Address("China","HeNan","XinYang");
        PersonDeepClone personDeepClone = new PersonDeepClone();
        personDeepClone.setName("zzx");
        personDeepClone.setAge(24);
        personDeepClone.setGender(true);
        personDeepClone.setAddress(address);

        PersonDeepClone clone = personDeepClone.deepClone();
        System.out.println("修改address对象前，原型对象值"+personDeepClone.toString());
        System.out.println("修改address对象前，克隆对象值"+clone.toString());
        address.setCountry("USA");
        System.out.println("修改address对象后，原型对象值"+personDeepClone.toString());
        System.out.println("修改address对象后，克隆对象值"+clone.toString());
        System.out.println("克隆对象的address和原型对象的address比较："+(clone.getAddress() == personDeepClone.getAddress()));

        clone.getAddress().setCountry("England");
        System.out.println(""+clone.toString());
    }
}
