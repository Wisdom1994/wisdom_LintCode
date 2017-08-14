package com.wisdom.easy;

import java.util.ArrayList;

/**
 * 主元素  http://www.lintcode.com/zh-cn/problem/majority-number/
 * 给定一个整型数组，找出主元素，它在数组中的出现次数严格大于数组元素个数的二分之一。
 *    样例
        给出数组[1,1,1,1,2,2,2]，返回 1
 */
public class NajorityNumber {

    public static void main(String[] args) {
        NajorityNumber najorityNumber = new NajorityNumber();
        ArrayList<Integer> nums = new ArrayList<>();
        najorityNumber.majorityNumber(nums);
    }
    public int majorityNumber(ArrayList<Integer> nums) {
        // write your code
        int i = 0;
        int temp = nums.get(0);
        for (Integer n : nums) {
            if (n.equals(temp)) {
                i++;
            }
            if (!n.equals(temp)) {
                i--;
            }
            if (i < 0) {
                temp = n;
                i = 0;
            }
        }
        return temp;
    }
}
