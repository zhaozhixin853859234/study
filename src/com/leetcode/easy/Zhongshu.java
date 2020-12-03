package com.leetcode.easy;

/**
 * <h3>study</h3>
 * 众数是指在⼀个元素个数为n的数组中，出现次数⼤于n/2 的数。比如：[3,2,3]，那么3就是众
 * 数；再比如：[2,2,1,1,1,2,2]，2就是众数。
 *
 * Boyer-Moore投票算法。这种投票算法利用到了这
 * 样的⼀个原理，因为众数是数组中占据绝大多数的数，所以如果把众数的个数加起来，减去
 * 所有非众数的个数，那么剩下的值肯定是⼤于0的（注意，是⼀定大于0，不是大于等于0）
 * @author : zhao
 * @version :
 * @date : 2020-05-29 09:59
 */
public class Zhongshu {
    public static void main(String[] args) {
        // 没有众数， 没有元素的个数大于n/2
        int[] a = {2,2,1,1,1,2,2,1,3,3,3,3,1};
        System.out.println(boyerMoore1(a));
    }

    public static int boyerMoore1(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int e : nums) {
            if (count == 0) {
                candidate = e;
            }
            count += (e == candidate) ? 1 : -1;
        }
        return candidate;
    }

    private static int boyerMoore(int[] nums){
        Integer candidate = null;
        int count = 0;
        for (int i = 0; i < nums.length ; i++) {
            if (count==0)
                candidate = nums[i];
            count += (nums[i]==candidate)?1:-1;
        }
        return candidate;
    }

}
