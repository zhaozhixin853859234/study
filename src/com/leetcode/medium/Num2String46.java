package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-11 16:28
 */
public class Num2String46 {
    public int translateNum(int num) {
        String  s = String.valueOf(num);
        if (s.length()==2)
            return num>25?1:2;
        int dp_1 = 1;
        int dp_2 = 1;

        for (int i = 2; i < s.length(); i++) {
            int tmp;
            if (Integer.parseInt(String.valueOf(s.charAt(i-1))+String.valueOf(s.charAt(i)))<=25 &&
                    Integer.parseInt(String.valueOf(s.charAt(i-1))+String.valueOf(s.charAt(i)))>=10)
                tmp = dp_1 + dp_2;
            else
                tmp = dp_1;

            dp_2 = dp_1;
            dp_1 = tmp;
        }
        return dp_1;


    }
}
