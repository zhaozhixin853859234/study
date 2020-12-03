package com.bishi;

import java.util.Scanner;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-08-29 19:15
 */

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num  = scanner.nextInt();
        PrimeSplit(num, 2);
    }

    public static void PrimeSplit(int num,int count){
        while( count < num && num % count != 0 ){
            count ++;
        }
        if(count < num){
            System.out.print(count + "*");
            PrimeSplit(num/count, 2);
        }else{
            System.out.println(count );
        }
    }
}

