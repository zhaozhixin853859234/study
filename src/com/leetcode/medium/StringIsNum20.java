package com.leetcode.medium;

/**
 * <h3>study</h3>
 * 请实现一个函数用来判断字符串是否表示数值（包括整数和小数）。
 * 例如，字符串"+100"、"5e2"、"-123"、"3.1416"、"0123"都表示数值，
 * 但"12e"、"1a3.14"、"1.2.3"、"+-5"、"-1E-16"及"12e+5.4"都不是
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/biao-shi-shu-zhi-de-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author : zhao
 * @version :
 * @date : 2020-05-30 15:32
 */
public class StringIsNum20 {

    public static void main(String[] args) {
        System.out.println(isNumber("12e+5.4"));
    }
    // 正则匹配的效率不高
    private static boolean isNumber(String s) {
        // 空格0次或多次( *) -> 正号或者负号0次或1次([+-]?) -> 正号或者负号后面要么是一个浮点数(\d+(\.\d*)?)或者小数（\.\d+）
        //  -> 科学计数法e之前需要有数字（[e]） -> e之后可以有正负号0次或1次（[+-]?）  -> e之后数字部分为整数（\d+)
        String m = " *[+-]?((\\d+(\\.\\d*)?)|\\.\\d+)([e][+-]?\\d+)? *$";
        return s.matches(m);
    }
}
