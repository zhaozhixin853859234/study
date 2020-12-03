package com.leetcode.easy;

public class Repalce {
    public static String replaceSpace(String s) {
        if (s.length()==0)
            return s;
        else {
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i <s.length() ; i++) {
                if (s.charAt(i)==' '){
                    stringBuffer.append("%20");
                }else {
                stringBuffer.append(s.charAt(i));
                }
            }
            return stringBuffer.toString();
        }
    }

    public static void main(String[] args) {
        String s ="We are happy.";
        String res = replaceSpace(s);
        System.out.println(res);
    }
}
