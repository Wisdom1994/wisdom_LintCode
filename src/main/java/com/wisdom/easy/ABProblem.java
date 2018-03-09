package com.wisdom.easy;

/**
 * LintCode 1 题，A+B 问题 easy
 * 描述：给出两个整数 a 和 b，求他们的和，但不能使用 + 运算符
 * 即，需要使用位运算
 */
public class ABProblem {
    /**
     * @param a: An integer
     * @param b: An integer
     * @return: The sum of a and b
     * 分析：假设 a = 5, b = 7;
     *      1，先考虑整数计算 5 + 7 = 12;
     *      2，二进制：101 + 111 = 1100
     *      3，当我们不考虑进位时的计算 101 + 111 = 010 明显的异或运算
     *      4，当我们只考虑进位时的计算 101 + 111 = 101 明显的与运算
     *      5，求和的时候，就相当于异或运算之后加上 进位之后的与运算（因为进位了） 010 + 1010 = 1100
     *      6, 但是010 + 1010 也有进位的需求，所以我们要对 3，4 进行循环
     *      7，直到无需进位时，循环结束，所以我们对与运算进行判断就可以，结果为0就可以停止循环了
     */
    public int aplusb(int a, int b) {
        // write your code here
        // return a+b;
        int sum;
        int flag;
        do {
            // 按位异或
            sum = a ^ b;

            // 按位与运算，并进位
            flag = (a & b) << 1;

            a = sum;
            b = flag;
        } while(flag != 0);
        return sum;
    }
}
