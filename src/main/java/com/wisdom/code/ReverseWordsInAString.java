package com.wisdom.code;
/**
 *  翻转字符串
 *  给定一个字符串，逐个翻转字符串中的每个单词的每个字母。
 *
 *  单词的构成：无空格字母构成一个单词
 *  输入字符串是否包括前导或者尾随空格？可以包括，但是反转后的字符不能包括
 *  如何处理两个单词间的多个空格？在反转字符串中间空格减少到只含一个
 *
 */
public class ReverseWordsInAString {

    public static void main(String[] args) {
        ReverseWordsInAString rw = new ReverseWordsInAString();
        String s = "   public     static void       main ";
        String str = rw.reverseWords(s);
        System.out.println(str);
    }
/**
 *  思路：先整体调换位置，然后将调换完位置的字符串按“ ”进行拆分，再把拆分后的字符串调换位置
 */
    /*
    public String reverseWords(String s) {
        if (s.equals(" ")) {
            return " ";
        }
        if (null == s) {
            return null;
        } else {
            //将字符串变成字符数组，再将字符调换位置
            char[] ch = s.toCharArray();
            char[] ch2 = new char[ch.length];
            for (int x = 0; x < ch.length; x ++) {
                ch2[x] = ch[ch.length - 1 - x];
            }
            //将字符串中单个单词转换位置
            String[] str = new String(ch2).replaceAll(" +"," ").split(" ");
            StringBuffer sb = new StringBuffer();
            for (int y = 0; y < str.length; y ++) {
                if (y < str.length - 2) {
                    sb.append(str[str.length - 1 - y]+" ");
                } else {
                    sb.append(str[str.length - 1 - y]);
                }
            }
            return sb.toString();
        }
    }*/

    /**
     * 喵了个咪的，我想多了，我以为是单独调换每个单词中字母的位置~
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        if (s.equals(" ")) {
            return " ";
        }
        if (s.isEmpty()) {
            return "";
        } else {
            String[] str = s.replaceAll(" +", " ").split(" ");
            StringBuffer stringBuffer = new StringBuffer();
            for (int y = 0; y < str.length; y++) {
                if (y == str.length - 1) {
                    stringBuffer.append(str[str.length - 1 - y]);
                } else {
                    stringBuffer.append(str[str.length - 1 - y] + " ");
                }
            }
            return stringBuffer.toString();
        }
    }
}
