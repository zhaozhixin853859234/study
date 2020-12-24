package com.DesignPattern.PrototypePattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-23 11:09
 */
public class ClientShallowClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("China","HeNan","XinYang");
        PersonShallowClone personShallowClone =new PersonShallowClone();
        personShallowClone.setName("zzx");
        personShallowClone.setAge(24);
        personShallowClone.setGender(true);
        personShallowClone.setAddress(address);

        PersonShallowClone clone = personShallowClone.clone();
        System.out.println("修改克隆对象前，原型对象值"+personShallowClone.toString());
        System.out.println("修改克隆对象前，克隆对象值"+clone.toString());
        address.setCountry("USA");
        System.out.println("修改克隆对象后，原型对象值"+personShallowClone.toString());
        System.out.println("修改克隆对象后，克隆对象值"+clone.toString());
        System.out.println("克隆对象的address和原型对象的address比较："+(clone.getAddress() == personShallowClone.getAddress()));
    }
}
