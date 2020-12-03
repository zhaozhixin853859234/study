package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-06-10 09:31
 */
public class UglyNumber49 {
    public static void main(String[] args) {
        System.out.println(nthUglyNumber(11));
    }

    public static int nthUglyNumber(int n) {
        int count = 1;
        int curUglyNum = 1;
        int tmp = 2;
        int tmp_1;
        while (count<n){

            tmp_1 = tmp;

            // 找出所有因子5
            while (tmp_1%5==0){
                System.out.println(tmp_1+"被5整除了");
                if (tmp_1/5==1){
                    count++;
                    curUglyNum = tmp;
                    break;
                }
                else
                    tmp_1 = tmp_1/5;
            }

            // 找出所有因子3
            while (tmp_1%3==0){
                System.out.println(tmp_1+"被3整除了");
                if (tmp_1/3==1){
                    count++;
                    curUglyNum = tmp;
                    break;
                }
                else
                    tmp_1 = tmp_1/3;
            }

            // 找出所有因子2
            while(tmp_1%2==0){
                System.out.println(tmp_1+"被4整除了");
                if (tmp_1/2==1){
                    count++;
                    curUglyNum = tmp;
                    break;
                }
                else
                    tmp_1 = tmp_1/2;
            }

            tmp++;
        }

        return curUglyNum;

    }

}
