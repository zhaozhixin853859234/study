package com.leetcode.easy;

/**
 * <h3>study</h3>
 * <p>wq</p>
 *
 *
 * @author : zhao
 * @version :
 * @date : 2020-05-26 15:41
 */
public class T implements Cloneable{


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    public T(int age){
        this.age = age;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        T t1 = new T(11);
        T t2 = (T) t1.clone();
        System.out.println(t1==t2);
    }

}
