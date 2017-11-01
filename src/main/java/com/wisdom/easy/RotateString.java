package com.wisdom.easy;

/**
 *  http://www.lintcode.com/zh-cn/problem/rotate-string/
 *  给定一个字符串和一个偏移量，根据偏移量旋转字符串(从左向右旋转)
 *
 *    样例
 * 对于字符串 "abcdefg".
 * offset=0 => "abcdefg"
 * offset=1 => "gabcdef"
 * offset=2 => "fgabcde"
 * offset=3 => "efgabcd"
 */
public class RotateString {

    /**
     * @param str 被旋转的字符串数组
     * @param offset 偏移量
     * 要考虑到的问题
     *  1.str 长度为 0
     *  2.偏移量为 0
     *  3.偏移量远超数组长度
     *
     *   思路：每次都把字符串旋转一次，偏移量为几就旋转几次
     */
    public void rotateString(char[] str, int offset) {
        // write you code here;
        // 如果数组长度为0
        if (str.length == 0) {
            return;
        }
        // 如果偏移量为 0
        if (offset == 0) {
            return;
        }
        // 考虑偏移量远超数组长度的问题：
        // 偏移量 == 数组长度时，不偏移。 所以最后的偏移量为 offset % str.length
        int len = str.length;
        char temp;
        for (int i = 1; i <= offset % len; i++) {
            //旋转一次
            temp = str[len - 1];
            int j = len - 2;
            while (j >= 0) {
                str[j + 1] = str[j];
                j--;
            }
            str[0] = temp;
        }
    }
}
