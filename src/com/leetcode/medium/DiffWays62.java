package com.leetcode.medium;

/**
 * <h3>study</h3>
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角（在下图中标记为“Finish”）。
 * 问总共有多少条不同的路径？
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/unique-paths
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author : zhao
 * @version :
 * @date : 2020-05-28 10:09
 */
public class DiffWays62 {
    public static void main(String[] args) {
        System.out.println(uniquePaths(3,2));
    }
    public static int uniquePaths(int m, int n) {
        if (m==0||n==0)
            return 0;
        if (m==1||n==1)
            return 1;

        int[][] tmp = new int[m][n];

        // 初始化，先解决初始问题，tmp数组中第0行和第0列都为1
        for (int i = 0; i <m ; i++) {
            tmp[i][0]=1;
        }

        for (int i = 0; i < n; i++) {
            tmp[0][i]=1;
        }

        for (int i =1 ; i <m ; i++) {
            for (int j = 1; j <n ; j++) {
                tmp[i][j] = tmp[i-1][j]+tmp[i][j-1];
            }
        }

        return tmp[m-1][n-1];
    }

}
