package com.leetcode.medium;

/**
 * <h3>study</h3>
 * 输入一个整数 n ，求1～n这n个整数的十进制表示中1出现的次数。
 * 例如，输入12，1～12这些整数中包含1 的数字有1、10、11和12，1一共出现了5次。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/1nzheng-shu-zhong-1chu-xian-de-ci-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author : zhao
 * @version :
 * @date : 2020-05-31 14:16
 */
public class NumOfOne43 {
    public static void main(String[] args) {
        System.out.println(countDigitOne(12));
    }
    private static int countDigitOne(int n) {
        if (n==0)
            return 0;
        String sNum = String.valueOf(n);

        // 最高位元素值
        int high = sNum.charAt(0)-'0';
        // 最高位数量级
        int pow = (int)Math.pow(10,sNum.length()-1);
        // 除去最高位后，剩下元素
        int last = n - high*pow;

        if (high==1)
            // 最高位是1，如1234, 此时pow = 1000,那么结果由以下三部分构成：
            // (1) dfs(pow - 1)代表[0,999]中1的个数;
            // (2) dfs(last)代表234中1出现的个数;
            // (3) last+1代表固定高位1有多少种情况。
            return countDigitOne(pow-1) + countDigitOne(last) + last+1;
        else
            // 最高位不为1，如2234，那么结果也分成以下三部分构成：
            // (1) high * dfs(pow - 1)代表999以内和1999以内低三位1出现的个数,
            // eg:2234：0~999，1000~1999；3234：0~999，1000~1999，2000~2999;
            // (2) dfs(last)同上。
            // (3) pow代表固定高位1，有多少种情况,个数与数量级相同;
            return high*countDigitOne(pow-1) + countDigitOne(last) + pow;
    }

}
