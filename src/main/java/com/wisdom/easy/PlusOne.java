package com.wisdom.easy;

/**
 * 加一  （简单）
 * 给定一个非负数，表示一个数字数组，在该数的基础上+1，返回一个新的数组。
    样例：
    给定 [1,2,3] 表示 123, 返回 [1,2,4].
    给定 [9,9,9] 表示 999, 返回 [1,0,0,0].
 */
public class PlusOne {
    /*
        把数组变成长整形数字，加一后转为字符串，再转为int数组。
     */
    public int[] plusOne(int[] digits) {
        StringBuilder stringBuilder = new StringBuilder();

        if (0 == digits[0]) {
            return new int[]{1};
        }
        for (int digit : digits) {
            stringBuilder.append(digit).append("");
        }
        Long x = Long.parseLong(stringBuilder.toString());
        char[] z = (x + 1 + "").toCharArray();
        int [] s = new int[z.length];
        for (int j = 0; j < z.length; j++) {
            s[j] = Integer.parseInt(z[j] + "");
        }
        return s;
    }

}
