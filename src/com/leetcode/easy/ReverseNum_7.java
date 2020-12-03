package com.leetcode.easy;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-07 10:04
 */

// 字符串转换 + 强制类型转换异常判断的效率较低
public class ReverseNum_7 {
    public static void main(String[] args) {
        int res = reverse(-798989898);
        System.out.println(res);
    }
    public static int reverse(int x) {
        String str = Integer.toString(x);
        char[] chars = str.toCharArray();
        int start;
        if (chars[0]=='-')
            start = 1;
        else start = 0;
        for (int i = start; i < (chars.length+start)/2; i++) {
            char tmp = chars[i];
            chars[i] = chars[chars.length + start - i-1];
            chars[chars.length + start - i-1] = tmp;
        }

        StringBuilder sb = new StringBuilder();
        for (char num:chars) {
            sb.append(num);
        }
        int res;
        try {
            res = Integer.parseInt(sb.toString());
        }
        catch (Exception e){
            return 0;
        }
        return res;
    }


}
