package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-16 15:54
 */
public class LC_1 {
    public static void main(String[] args) {
        int max = 0;
        int label = 0;
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = sc.nextInt();
        }
        int[] dp = new int[n+1];
        dp[0] =0 ;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int a = i;
                if(r[j]-r[a]==1||r[j]-r[a]==0){
                    dp[j] = dp[a]+1;
                    if (max<dp[j])
                        max=dp[j];
                    a =j;
                }
            }
        }
        System.out.println(n-max-1);
    }
}
