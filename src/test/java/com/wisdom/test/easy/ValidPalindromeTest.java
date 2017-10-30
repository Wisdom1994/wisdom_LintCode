package com.wisdom.test.easy;

import com.wisdom.easy.ValidPalindrome;
import org.junit.Assert;
import org.junit.Test;

public class ValidPalindromeTest {

    @Test
    public void isPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String s = "ahdpgaghapsdguaweytpoaudifanvlkczxhjiougpq paoidugpawet pa";
        Assert.assertEquals(validPalindrome.isPalindrome(s), false);
    }
}
