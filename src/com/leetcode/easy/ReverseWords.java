package com.leetcode.easy;

public class ReverseWords {
    public static String reverseWords(String s) {
        // 删除首尾空格
        s = s.trim();
        String[] sArray = s.split(" ");

        StringBuilder stringBuffer= new StringBuilder();

        for (int i = sArray.length-1; i >=0 ; i--) {
            if (!sArray[i].equals("")){
                stringBuffer.append(sArray[i]+" ");
            }
        }

        return stringBuffer.toString().trim();

    }

    public static void main(String[] args) {
        String s = "   fsdad     das da!    ";
        String res= reverseWords(s);
        System.out.println(res+",");

//
//        char[] chars = s.toCharArray();
//        String[] ss = s.split("\\s+");
//        for (char i:chars) {
//            System.out.print(i+",");
//        }
//
//        System.out.println();
//
//        for (String i: ss) {
//            System.out.println(i+",");
//        }
    }

}
