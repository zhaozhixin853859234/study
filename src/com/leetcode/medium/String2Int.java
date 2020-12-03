package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-15 20:02
 */
public class String2Int {

    public static void main(String[] args) {
        String s = "3.1415";
        //System.out.println(Integer.parseInt(s));
        System.out.println(strToInt(s));
    }
    public static int strToInt(String str) {
        String s = str.trim();
        if (s.length()==0)
            return 0;

        if (s.length()==1){
            if ((s.charAt(0)-'0')>=0 && (s.charAt(0)-'0')<=9)
                return Integer.parseInt(String.valueOf(s.charAt(0)));
            else
                return 0;
        }
        if (s.charAt(0)=='-'){
            int i = 1;
            int res;
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(0));
            while (i<s.length() && (s.charAt(i)-'0')>=0 & (s.charAt(i)-'0')<=9){
                sb.append(s.charAt(i));
                i++;
            }
            if (sb.length()==1)
                return 0;

            try{
                res = Integer.parseInt(sb.toString());
            }catch (Exception e){
                return Integer.MIN_VALUE;
            }

            return res;
        }

        else if (s.charAt(0)=='+'){
            int i = 1;
            int res;
            StringBuilder sb = new StringBuilder();
            while (i<s.length() && (s.charAt(i)-'0')>=0 & (s.charAt(i)-'0')<=9){
                sb.append(s.charAt(i));
                i++;
            }

            if (sb.length()==1)
                return 0;

            try{
                res = Integer.parseInt(sb.toString());
            }catch (Exception e){
                return Integer.MAX_VALUE;
            }
            return res;
        }

        else if ((s.charAt(0)-'0')>=0 && (s.charAt(0)-'0')<=9 ){
            int res;
            int i = 0;
            StringBuilder sb = new StringBuilder();
            while (i<s.length() && (s.charAt(i)-'0')>=0 & (s.charAt(i)-'0')<=9 ){
                sb.append(s.charAt(i));
                i++;
            }

            try{
                res = Integer.parseInt(sb.toString());
            }catch (Exception e){
                return Integer.MAX_VALUE;
            }

            return res;
        }

        else
            return 0;


    }

}
