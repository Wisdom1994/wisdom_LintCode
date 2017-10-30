package com.wisdom.easy;

/**
 * 两数之和
 * http://www.lintcode.com/zh-cn/problem/two-sum/
 * 描述：
 * 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
 * 你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是 1 到 n，不是以 0 开头。
 * 样例：
 * 给出 numbers = [2, 7, 11, 15], target = 9, 返回 [1, 2].
 */
public class TwoSum {
    /**
     * @param numbers 被计算的数组
     * @param target 和
     * @return numbers中符合条件的参数的下标组成的数组
     */
    public int[] twoSum(int[] numbers, int target) {
        // write your code here
        int i;
        int j = 0;
        flags:
        for (i = 0; i < numbers.length; i++) {
            for (j = i + 1; j < numbers.length; j++) {
                if (target == numbers[i] + numbers[j]) {
                    i += 1;
                    j += 1;
                    break flags;
                }
            }
        }
        return new int[]{i, j};
    }
}
