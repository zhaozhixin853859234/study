package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-09-06 19:44
 */
public class HW_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.nextLine().split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        double[][] res = new double[n][m];
        double[][] weight = new double[n][3*m];

        for (int i = 0; i <n ; i++) {
            String[] temp = sc.nextLine().split(" ");
            for (int j = 0; j < 3*m; j++) {
                weight[i][j] = Double.parseDouble(temp[j]);
            }
        }

        res[0][0] = 0;
        for (int i = 1; i < m; i++) {
            if (weight[0][1+3*(i-1)]!=0){
                res[0][i] = res[0][i-1]+(1/weight[0][1+3*(i-1)]);
            }
            else break;
        }

        for (int i = 1; i < n; i++) {
            if (weight[i-1][0]!=0)
                res[i][0] = res[i-1][0]+(1/weight[i-1][0]);
            else break;
        }


        for (int i = 1; i < n; i++) {
            for (int j = 1; j <m ; j++) {
                if (res[i-1][j]!=0 && weight[i-1][3*j]!=0){
                    res[i][j] = res[i][j] + res[i-1][j]+(1/weight[i-1][3*j]);
                }
                if (res[i][j-1]!=0 && weight[i][1+3*(j-1)]!=0)
                    res[i][j] = res[i][j] + res[i][j-1]+(1/weight[i][1+3*(j-1)]);

            }
        }
        System.out.println(res[n-1][m-1]);
    }
}
