package com.wisdom.difficult;

/**
 * http://www.lintcode.com/zh-cn/problem/string-to-integer-ii/
 * 实现atoi这个函数，将一个字符串转换为整数。如果没有合法的整数，返回0。
 * 如果整数超出了32位整数的范围，返回INT_MAX(2147483647)如果是正整数，或者INT_MIN(-2147483648)如果是负整数。
 * @author jdz
 * @version 1.0
 * @createDate 2017-9-6
 */
public class StringToIntegerII {
    public static void main(String[] args) {
        StringToIntegerII stringToIntegerII = new StringToIntegerII();
        String str = "";
        System.out.println(stringToIntegerII.atoi(str));
    }

    /**
     * @param str 要进行转换的字符串
     * @return 转换后的正整数
     *
     * 思路：1.确定字符串不为null，不为空串
     * 2.确定字符串格式正确，符合数字要求——可以使用match（正则）进行匹配；
     * 3.确定字符整数位的数字长度，对过长者进行处理。去最大正值或者最小负值——判断其为11位十进制整数，使用Long进行存储
     * 4，对结果进行处理，正值向下取整，负值向上取整
     */
    private int atoi(String str) {
        return 0;
    }
}
