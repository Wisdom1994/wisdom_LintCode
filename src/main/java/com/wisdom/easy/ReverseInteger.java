package com.wisdom.easy;

/**
 * LintCode 413 反转整数
 * http://www.lintcode.com/zh-cn/problem/reverse-integer/
 */
public class ReverseInteger {
    /**
     *
     * @param n 需要被反转的整数
     * @return 反转后的参数
     */
    public int reverseInteger(int n) {
        int flag = 1;
        char[] ch = (n + "").toCharArray();
        if (ch[0] == '-') {
            flag = -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int x = ch.length - 1; x >= 0; x--) {
            if (ch[x] >= '0' && ch[x] <= '9') {
                sb.append(ch[x]);
            }
        }
        Long aLong = Long.parseLong(sb.toString()) * flag;
        if (aLong > Integer.MAX_VALUE || aLong < Integer.MIN_VALUE) {
            return 0;
        } else {
            return Integer.parseInt(sb.toString()) * flag;
        }
    }
}
