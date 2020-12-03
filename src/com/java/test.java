package com.java;

//import java.util.LinkedList;
//import java.util.List;
import java.util.*;
//import java.util.concurrent.LinkedBlockingQueue;

/**
 * <h3>study</h3>
 * hr@dtwave-inc.com
 * @author : zhao
 * @version :
 * @date : 2020-08-10 15:01
 */
public class test {
    public volatile boolean a = false;
    public static void main(String[] args) {
        char c = '\u0097';
        byte b = (byte) c;
        System.out.println(c);
        List<Integer> llis = new LinkedList<>();
        Scanner sc =  new Scanner(System.in);

        Map<Integer,Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        String s = "sca";

        byte b1 = -106;
        char c1 = (char) b1;
        System.out.println(b);
        System.out.println(c1);


        int ss = 1024*32;
        short nn = (short) ss;
        System.out.println(nn);


    }
}
