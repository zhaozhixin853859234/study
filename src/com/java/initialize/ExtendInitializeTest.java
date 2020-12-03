package com.java.initialize;

/**
 * <h3>study</h3>
 * <p>Extend Constructor</p>
 *
 * @param :
 * @author : zhao
 * @version :
 * @return :
 * @date : 2020-05-26 20:56
 */
public class ExtendInitializeTest {

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    private int a;
    public ExtendInitializeTest(){
        System.out.println("父类无参构造方法");
    }
    public ExtendInitializeTest(int a){
        this.a = a;
        System.out.println("父类有参构造方法");
    }

    public void m1(){
        System.out.println("调用方法m1");
    }

    public void m2(){
        System.out.println("调用方法m2");
    }


}
class zi extends ExtendInitializeTest{
    private String s;
    public zi(){
        System.out.println("调用zi类构造方法");
    }

    public void m1(){
        System.out.println("调用方法m1");
    }


}
class zizi extends zi{
    private zizi(){
        System.out.println("调用zizi类构造方法");
    }
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException {
        ExtendInitializeTest e = new ExtendInitializeTest();
        zi zz = new zi();
        zizi z = new zizi();
        Class rrr = Class.forName("com.java.initialize.ExtendInitializeTest");
        ExtendInitializeTest obj = (ExtendInitializeTest) rrr.newInstance();
        obj.m1();
        obj.m2();
        obj.setA(1);
        System.out.println(obj.getA());

    }
}
