package com.wisdom.easy;

/**
 * 二分查找：1 ：找出target在数组中第一次出现的位置
 * @url http://www.lintcode.com/en/problem/first-position-of-target/
 * @Description For a given sorted array (ascending order) and a target number,
 * find the first index of this number in O(log n) time complexity.
 * If the target number does not exist in the array, return -1.
 *
 * @Description 给定一个排序的整数数组（升序）和一个要查找的整数target，
 * 用O(logn)的时间查找到target第一次出现的下标（从0开始），
 * 如果target不存在于数组中，返回-1。
 */
public class BinarySearch_1 {
    /**
     * @param nums 一个包含整数的数组
     * @param target 目标值
     * @return 第一次在数组中出现的位置
     *
     * 需要注意的是，当找到一个数和target相等时，要把end指针，即右指针指向target，并继续循环搜索，
     * 直到整个区间的长度<=2，这个时候就跳出循环，看看这最后两个数哪个是第一个就返回它。
     */
    public int binarySearch(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int start = 0;
        int end = nums.length - 1;
        while (start + 1 < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] >= target) {
                end = mid;
            } else {
                start = mid;
            }
        }
        if (nums[start] == target) {
            return start;
        }
        if (nums[end] == target) {
            return end;
        }
        return -1;
    }
}
