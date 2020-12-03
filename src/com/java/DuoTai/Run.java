package com.java.DuoTai;

public class Run{
    public static void main(String[] args) {
        People s = new Teacher("zhang",1);
        s.eat();
        System.out.println(s.getName());
        People s2 = new Student();
        s2.eat();

    }
}
class People {
    private int age;
    private String name;
    People(){}
    public People(String name,int age){
        this.age=age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void eat(){
        System.out.println("People is eating.");
    }

}
class Teacher extends People{
    private int age;
    private String name;
    public Teacher(){}
    public Teacher(String name,int age){
        this.age=age;
        this.name = name;
    }
    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("teacher is eating.");
    }
}
class Student extends People{
    public Student(){}

    @Override
    public void eat() {
        System.out.println("student is eating.");
    }
}