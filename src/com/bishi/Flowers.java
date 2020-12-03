package com.bishi;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-08 15:47
 */
public class Flowers {
    public static void main(String[] args) {
        int[] a = {1,0,0,0,1,0,0};
        System.out.println(canPlaceFlowers(a,2));

    }
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n==0)
            return true;
        if (flowerbed.length==1 && n<=1)
            return flowerbed[0]==0;

        int count = 0;
        int len = flowerbed.length;
        int firstOne = -1;
        int endOne = len;
        int countZero = 0;

        // 找到第一个1的位置，考察1前面0的个数，看是否可以栽花
        for (int i = 0; i < len; i++) {
            if (flowerbed[i]==1){
                firstOne = i;
                if (firstOne>=2){
                    count += firstOne/2;
                    break;
                }
                else break;
            }
        }

        if (firstOne==-1)
            return (len+1)/2-n>=0;

        // 至少有一个1
        // 找到最后一个1，考察1之后可以栽多少花
        for (int i = (len-1); i >=firstOne; i--) {
            if (flowerbed[i]==1){
                endOne = i;
                if ((len-endOne-1)>=2){
                    count += (len-endOne-1)/2;
                    break;
                }
                else break;
            }
        }

        if (firstOne == endOne){
            return count-n >= 0;
        }

        // 至少有两个1，考察二者之间可以栽花情况
        for (int i = firstOne; i < endOne; i++) {
            if (flowerbed[i+1]==1){
                count += (countZero-1) / 2;
                countZero=0;
            }
            else {
                countZero++;
            }
        }
        return (count-n) >= 0;

    }

}
