package com.wisdom.easy;

public class PalindromeNumber {

    /**
     * 遍历这个数组，分别从前往后对比，如果不同就返回一个 false
     * @param num 传入参数
     * @return boolean类型：是否为回文数
     */
    public boolean palindromeNumber(int num) {
        String s = num + "";
        char[] ch = s.toCharArray();
        Boolean flag = true;
        for (int i = 0; i < ch.length / 2; i++){
            if (ch[i] != ch[ch.length - 1 - i]){
                flag = false;
                break;
            }
        }
        return flag;
    }
}
