package com.wisdom.easy;

/**
 * http://www.lintcode.com/zh-cn/problem/median/
 * ch:给定一个未排序的整数数组，找到其中位数。
 * 中位数是排序后数组的中间值，如果数组的个数是偶数个，则返回排序后数组的第N/2个数。
 *
 * en:Given a unsorted array with integers, find the median of it.
 * A median is the middle number of the array after it is sorted.
 * If there are even numbers in the array, return the N/2-th number after sorted.
 */
public class Median {
    public static void main(String[] args) {
        Median median = new Median();
        int[] nums = new int[]{};
        System.out.println(median.median_1(nums));
    }
    /**
     * 第一种采用时间复杂度较高的方法——冒泡排序
     * @param nums 寻找中位数的数组
     * @return median 中位数
     */
    private int median_1(int[] nums) {
        // write your code here
        //Bubble Sort
        for (int i = 0; i< nums.length; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
        return nums[(nums.length - 1) / 2];
    }
}
