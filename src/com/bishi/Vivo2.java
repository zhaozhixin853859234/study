package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-07 15:14
 */
public class Vivo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        System.out.println(broken(K,N));

    }
    private static int broken(int m,int n){
        int count = 0;
        if (m==1)
            return n;
        while(m>1){
            n = n/2+1;
            m-=1;
            count++;
        }
        return count+n-1;
    }
}
