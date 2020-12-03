package com.leetcode.easy;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

public class ttt {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new LinkedList<>();

        Map<Integer,Integer> map1 = new HashMap<>();
        Map<Integer,Integer> map2 = new Hashtable<>();
        Map<Integer,Integer> map3 = new LinkedHashMap<>();

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new TreeSet<>();
        Set<Integer> set3 = new LinkedHashSet<>();

        Queue<Integer> q1 = new PriorityQueue<>();
        // 下面两个是concurrent包的实现
        Queue<Integer> q2 = new PriorityBlockingQueue<>();
        Queue<Integer> q3 = new LinkedBlockingQueue<>();
    }
}
