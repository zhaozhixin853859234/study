package com.java.DuoTai;

public class DuoTai {
    public static void main(String[] args) {
        Animal a1 = new Cow();
        Animal a2 = new Tiger();
        System.out.println(a1.name);
        a1.eat();
        // 不能直接使用子类特有功能，需要向下转型
        Cow a11 = (Cow) a1;
        a11.cry();
        System.out.println(a2.name);
        a2.eat();
        //a2.cry();
    }

}

class Animal{
    String name = "animal";
    public void eat(){}
    //public void cry(){}
}
class Cow extends Animal{
    String name = "Cow";

    @Override
    public void eat() {
        System.out.println("Eating glass");
    }

    public void cry(){
        System.out.println("c c c");
    }
}
class Tiger extends Animal{
    String name = "Tiger";

    // 父类共有方法
    @Override
    public void eat() {
        System.out.println("Eating meat");
    }

    // 子类特有方法
    public void cry(){
        System.out.println("t t t");
    }
}