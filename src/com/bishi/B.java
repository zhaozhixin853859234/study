package com.bishi;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-11 20:48
 */
public class B {
    public static void main(String[] args) {
        User u = new User("g");
        u.show();
    }

}

class User extends B{

    private String name = "z";

    User(String name){

        name = name;
    }
    User(){}

    public void show(){
        System.out.println(name);
    }
}
