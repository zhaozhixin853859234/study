package com.leetcode.medium;

import java.util.HashMap;
import java.util.Map;


// hashMap键值对记录出现次数，空间复杂度为O（n），时间复杂度为O（n），不是最优解。
public class SingleNumber56 {
    public static int singleNumber(int[] nums) {
        Map<Integer,Boolean> map = new HashMap<>();

        for (int i:nums) {
            if (!map.containsKey(i))
                map.put(i,true);
            else
                map.put(i,false);
        }
        int result=0;
        for (Map.Entry<Integer,Boolean> entry:map.entrySet()){
            if (entry.getValue()){
                result = entry.getKey();
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1,1,1,2,3,3,3};
        System.out.println(singleNumber(a));
    }
}
