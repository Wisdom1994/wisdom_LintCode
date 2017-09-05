package com.wisdom.easy;

/**
 * 关于这。。。我已经不想说什么，我已经懒到直接使用Java.lang.String 中这个固定的方法了 强大的indexOf（）
 * @createDate 2017-9-5 今天，我就是来凑个数github提交数的，要不然空荡荡的多难看~
 */
public class Strstr {
    public static void main(String[] args) {
        Strstr strstr = new Strstr();
        String source = "";
        String target = "";
        System.out.println(strstr.strStr(source, target));
    }
    private int strStr(String source, String target) {
        // write your code here
        if (null == source || null == target) {
            return -1;
        } else if (source.equals(target)) {
            return 0;
        } else if (source.length() < target.length() || !source.contains(target)) {
            return -1;
        } else {
            //这句向上，都不是重点，下面这句才是关键
            return source.indexOf(target);
        }
    }
}
