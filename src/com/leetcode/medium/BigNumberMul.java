package com.leetcode.medium;

/**
 * <h3>study</h3>
 * 计算大整数的阶乘，主要实现两个大整数相乘，让
 * 个位数与另⼀一个数的其他数相乘，然后让十位数与另⼀一个的其他数相乘，最后在把他们行行相加
 * @author : zhao
 * @version :
 * @date : 2020-05-28 14:45
 */

public class BigNumberMul {

    public static void main(String[] args) {
        //String res = mul2Num("12390867568585685689","12367");
        System.out.println(jiecheng(5));
        //System.out.println(mul2Num("6","5"));
    }

    private static String jiecheng(int N){
        String res = "1";
        Integer t = null;
        for (int i = 2; i <=N; i++) {
            t = i;
            res = mul2Num(res, t.toString());
        }
        return res;
    }

    private static String mul2Num(String s1,String s2){
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        int len = c1.length + c2.length;

        char[] mulRes = new char[len];
        for (int i = c1.length-1; i >=0 ; i--) {
            // 计算index位置相乘
            int index= len-1;
            // 保存index位置的进位情况
            int res = 0;
            for (int j = c2.length-1; j >=0 ; j--) {
                int tmp = (c1[i]-'0')*(c2[j]-'0') + mulRes[index] + res;
                res = tmp/10;
                mulRes[index--] = (char)(tmp%10);
            }

            // 每趟乘下来的进位要进⾏行行保存,index值已经前进一位，把进位信息放入前一位。
            mulRes[index] = (char)res;
            len--;
        }

        // 最后把c中的字符加上 '0'
        for (int i = 0; i < mulRes.length; i++) {
            mulRes[i] += '0';
        }

        String s = new String(mulRes);

        if (mulRes[0]=='0')
            // 从第1位到最后
            // n位数乘以m位数得到积位 (m+n)位数或者(n+m-1)位数
            // 我们只需要判断c[0]是否为0，为0则把它舍弃
            return s.substring(1);
        else
            return s;
    }
}
