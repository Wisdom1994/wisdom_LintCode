package com.wisdom.easy;

public class PalindromeNumber {

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int s = 1234554321;
        int s1 = 12314155;
        boolean a = palindromeNumber.palindromeNumber(s);
        boolean b = palindromeNumber.palindromeNumber(s1);
        System.out.println(a);
        System.out.println(b);
    }

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
