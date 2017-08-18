package com.wisdom.easy;

/**
 * 给定一个字符串， 包含大小写字母、空格' '，请返回其最后一个单词的长度
 * 如果不存在最后一个单词，请返回 0
 *
 * 样例：
 * 给定 s = "Hello World"，返回 5
 *
 * 将字符串用“ ”进行分割，然后取字符数组的最后一个元素，返回其长度
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("Hello world"));
    }
    public int lengthOfLastWord(String s) {
        // write your code here
        if (0 == s.length()) {
            return 0;
        }
        String str = s.replaceAll(" +", " ");
        if (" ".equals(str)) {
            return 0;
        }
        String[] strs = str.split(" ");
        return strs[strs.length - 1].length();
    }
}
