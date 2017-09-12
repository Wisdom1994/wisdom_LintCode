package com.wisdom.easy;

/**
 * LintCode 413 反转函数
 * http://www.lintcode.com/zh-cn/problem/reverse-integer/
 */
public class ReverseInteger {
    public int reverseInteger(int n) {
        if (n == 0) {
            return 0;
        }
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
        Integer inte = Integer.parseInt(sb.toString());
        return inte * flag;
    }
}
