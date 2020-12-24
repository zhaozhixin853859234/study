package com.DesignPattern.PrototypePattern;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-23 11:04
 */
public class PersonShallowClone implements Cloneable {
    private String name;
    private int age;
    private boolean gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    private Address address;


    @Override
    protected PersonShallowClone clone() throws CloneNotSupportedException {
        Object object = null;
        object = super.clone();
        return (PersonShallowClone)object;
    }

    @Override
    public String toString() {
        return "PersonShallowClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }
}
