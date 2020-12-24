package com.DesignPattern.PrototypePattern;

import java.io.*;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-12-23 11:06
 */
public class PersonDeepClone implements Serializable {
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
    public String toString() {
        return "PersonDeepClone{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", address=" + address +
                '}';
    }

    public PersonDeepClone deepClone() throws IOException, ClassNotFoundException {
        // 将当前PersonDeepClone对象写入输出流
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(baos);
        oos.writeObject(this);

        // 从输出流中读取对象
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(baos.toByteArray());
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        return  (PersonDeepClone)objectInputStream.readObject();


    }
}
