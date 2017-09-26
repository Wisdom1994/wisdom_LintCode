package com.wisdom.easy;

/**
 * 212-空格替换
 * 设计一种方法，将一个字符串中的所有空格替换成 %20 。你可以假设该字符串有足够的空间来加入新的字符，且你得到的是“真实的”字符长度。
 * 你的程序还需要返回被替换后的字符串的长度。
 *
 * Example
 * 对于字符串"Mr John Smith", 长度为 13
 * 替换空格之后，参数中的字符串需要变为"Mr%20John%20Smith"，并且把新长度 17 作为结果返回。
 */
public class SpaceReplacement {
    public static void main(String[] args) {
        SpaceReplacement spaceReplacement = new SpaceReplacement();
        char[] string = new char[]{'h', 'e', ' ', 'l', 'l', ' ', 'o', ' ', ' '};
        int length = string.length;
        System.out.println(spaceReplacement.replaceBlank(string, length));
    }
    //write you code here

    /**
     * 思路：方法一：我可以先对字符数组进行处理，之后再计算数组的长度
     *       方法二：先计算长度，然后再获取处理之后的字符数组
     *   这里采用方法二，更为简洁易懂
     * @param string 字符数组
     * @param length 要被修改字符数组的长度
     * @return 新字符串的长度
     */
    private int replaceBlank(char[] string, int length) {
        int newLength = length;
        int space  = 0;

        //获取所需修改长度内数组中的空格数
        for (int i = 0; i < length; i++) {
            if (string[i] == ' ') {
                space++;
            }
        }
        newLength = newLength + space * 2;//计算新长度
        int index = newLength;

        //对字符数组进行处理，把空格变为02%：注意，这里要使用char来存储
        for (int i = length - 1; i >= 0; i--) {
            if (string[i] == ' ') {
                string[--index] = '0';
                string[--index] = '2';
                string[--index] = '%';
            } else {
                string[--index] = string[i];
            }
        }
        return newLength;
    }
}
