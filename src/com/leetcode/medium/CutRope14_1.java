package com.leetcode.medium;

/**
 * <h3>study</h3>
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），
 * 每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？
 * 例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jian-sheng-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author : zhao
 * @version :
 * @date : 2020-05-29 20:29
 */
// 不对
public class CutRope14_1 {
    public static void main(String[] args) {
        System.out.println(cuttingRope(10));
    }
    public static int cuttingRope(int n) {
        if (n<=3)
            return n-1;
        int end  = n/2;
        int maxMul = 0;
        // 分成两段到end段
        for (int i = 2; i < end + 1; i++) {
            int len = n/i;
            int theLastNum = n- (i-1)*len;

            int res = (int) (Math.pow(len,(i-1))*theLastNum);
            System.out.println(res);
            if (res> maxMul)
                maxMul = res;
        }
        return maxMul;
    }
}
