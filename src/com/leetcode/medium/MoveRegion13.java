package com.leetcode.medium;


/**
 * <h3>study</h3>
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，
 * 它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。
 * 例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，
 * 因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ji-qi-ren-de-yun-dong-fan-wei-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author : zhao
 * @version :
 * @date : 2020-05-28 19:59
 */
public class MoveRegion13 {
    public static void main(String[] args) {
        System.out.println(movingCount(16,8,4));
    }

    public static int movingCount(int m, int n, int k) {
        int res = 0;
        for (int i = 0; i <m ; i++) {
            for (int j = 0; j < n; j++) {
                int sumDigit_i = sumOfDigit(i);
                int sumDigit_j = sumOfDigit(j);
                if (sumDigit_i+sumDigit_j <= k)
                    res++;
                else
                    break;
            }
        }
        return res;
    }

    private static int sumOfDigit(int a){
        if (a ==100)
            return 1;
        else if (a<10)
            return a;
        else {
            int shiwei  = a%10;
            int gewei  = a-shiwei*10;
            return shiwei + gewei;
        }
    }
}
