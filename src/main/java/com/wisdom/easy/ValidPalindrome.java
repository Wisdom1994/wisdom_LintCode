package com.wisdom.easy;

/**
 * 415-有效回文串
 * 给定一个字符串，判断其是否为一个回文串。只包含字母和数字，忽略大小写。
 * "A man, a plan, a canal: Panama" 是一个回文。
 * "race a car" 不是一个回文。
 */
public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "ahdpgaghapsdguaweytpoaudifanvlkczxhjiougpq paoidugpawet pa";
        boolean b = validPalindrome.isPalindrome(s);
        System.out.println(b);
    }
    private boolean isPalindrome(String s) {
        if (0 == s.length()) {
            return true;
        }
        String str = s.replace("[^\\w]", "").replace("-", "");
        char[] ch = str.toCharArray();
        boolean b = false;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != ch[ch.length - 1 - i]){
                b = false;
                break;
            } else {
                b = true;
            }
        }
        return b;
    }
}
