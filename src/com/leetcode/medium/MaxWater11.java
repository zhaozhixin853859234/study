package com.leetcode.medium;

/**
 * <h3>study</h3>
 *
 * @author : zhao
 * @version :
 * @date : 2020-07-19 14:59
 */
public class MaxWater11 {
    public static void main(String[] args) {
        int[] input = {2,3,4,5,18,17,6};
        //System.out.println(maxArea(input));
        String s = "gsgsf";
        System.out.println(s.substring(0,5));
    }


    public static int maxArea(int[] height) {
        // 双指针
        int start=0;
        int end =height.length-1;
        int area =Math.min(height[start],height[end])*(end-start);
        while(start<end){
            if(height[end]>height[start]){
                start++;
                area = Math.max(area,Math.min(height[start],height[end])*(end-start));
            }
            else{
                end--;
                area = Math.max(area,Math.min(height[start],height[end])*(end-start));
            }
        }
        return area;


    }
}
