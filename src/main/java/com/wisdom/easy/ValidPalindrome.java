package com.wisdom.easy;
/**
 * 415-有效回文串
 * 给定一个字符串，判断其是否为一个回文串。只包含字母和数字，忽略大小写。
 * "A man, a plan, a canal: Panama" 是一个回文。
 * "race a car" 不是一个回文。
 */
public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] ch = s.toCharArray();
        for(char c : ch) {
            if (Character.isLetterOrDigit(c)) {
                stringBuilder.append(c);
            }
        }
        if (0 == stringBuilder.length()) {
            return true;
        }
        char[] chars = stringBuilder.toString().toLowerCase().toCharArray();
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                return false;
            }
        }
        return true;
    }
}
