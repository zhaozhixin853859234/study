package com.java.fanxing;

import java.util.LinkedList;
import java.util.List;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-30 10:45
 */
public class Container<T> {
    private T content;

    public T getContent() {
        return this.content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public Container(T content){
        this.content = content;
    }

    public static void main(String[] args) {
        Container<String> c1 = new Container<>("a");
        String a = c1.getContent();
        System.out.println(a);

        Container<Integer> c2 = new Container<>(1);
        Integer one = c2.getContent();
        System.out.println(one);

        List<Integer> lists = new LinkedList<>();
        lists.add(2);
        lists.add(3);
        lists.add(4);
        Container<List<Integer>> c3 = new Container<>(lists);
        for (Integer num:c3.getContent()) {
            System.out.print(num+" ");
        }

        // 类型擦除,共享同一个运行时类，都输出true
        System.out.println(c1.getClass()==c2.getClass());
        System.out.println(c2.getClass()==c3.getClass());
        System.out.println(c1.getClass()==c3.getClass());
     }
}
