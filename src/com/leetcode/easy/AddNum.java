package com.leetcode.easy;

// 无进位和与异或运算规律相同，进位和与运算规律相同（并需左移一位）
public class AddNum {
    public static int add(int a, int b) {
        // 未进位时结果
        int res = a^b;
        // 进位标志，为1 的位置需要进位：<<1 即可
        int add = a&b;
        while(add!=0){
            add = add<<1;
            int tmp_res = res;
            int tmp_add = add;
            res = tmp_res^tmp_add;
            add = tmp_res&tmp_add;
        }
        return res;
    }
public static void main(String[] args) {
    System.out.println(add(9,11));
}
}
