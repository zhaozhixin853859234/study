package com.leetcode.medium;


/**
 * <h3>study</h3>
 * 输入一个非负整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 * @author : zhao
 * @version :
 * @date : 2020-06-11 09:40
 */
public class MinNum45 {

    public static void main(String[] args) {
        int[] input = {0,1,2,3,4,5,6,7,8,9};
        System.out.println(minNumber(input));
        //System.out.println(compareNum(2,1));

    }
    public static String minNumber(int[] nums) {
        int len  = nums.length;
        if (len==1)
            return String.valueOf(nums[0]);

        for (int i = 0; i < len-1; i++) {
            for (int j = i+1; j < len; j++) {
                if (compareNum(nums[i],nums[j])){
                        int tmp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = tmp;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int num:nums) {
            sb.append(num);
        }
        return sb.toString();

    }

    private static boolean compareNum(int a,int b){
        String a_b = String.valueOf(a)+ String.valueOf(b);
        String b_a = String.valueOf(b)+ String.valueOf(a);

        for (int i = 0; i < a_b.length(); i++) {
            if (a_b.charAt(i)>b_a.charAt(i))
                return true;
            if (a_b.charAt(i)<b_a.charAt(i))
                return false;
        }

        return false;

//        List<Integer> list_a = new ArrayList<>();
//        List<Integer> list_b = new ArrayList<>();
//
//        if (a==0)
//            list_a.add(a);
//        else {
//            while(a!=0){
//                list_a.add(0,a%10);
//                a = a/10;
//            }
//        }
//
//        if (b==0)
//            list_b.add(b);
//        else {
//            while (b!=0){
//                list_b.add(0,b%10);
//                b = b/10;
//            }
//        }
//
//        int len_a = list_a.size();
//        int len_b = list_b.size();
//
//        // 补齐
//        if (len_a>len_b){
//            for (int i = 0; i < len_a-len_b ; i++) {
//                list_b.add(1);
//            }
//
//        }
//        else if (len_a<len_b){
//            for (int i = 0; i < len_b-len_a ; i++) {
//                list_a.add(1);
//            }
//        }
//
//
//
////        for (int i = 0; i <list_a.size(); i++) {
////            System.out.print(list_a.get(i)+" ");
////        }
////        System.out.println();
////        for (int i = 0; i < list_b.size(); i++) {
////            System.out.print(list_b.get(i)+" ");
////        }
//
//        for (int i = 0; i < list_a.size(); i++) {
//            if (list_a.get(i)>list_b.get(i))
//                return true;
//            else if (list_a.get(i)<list_b.get(i))
//                return false;
//        }
//        // 完全相等
//        return !(len_a - len_b>0);

    }

}
