package com.wisdom.test.easy;

import com.wisdom.easy.PalindromeNumber;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeNumberTest {

    @Test
    public void palindromeTest() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        int integer_1 = 123414321;
        int integer_2 = 12233211;
        Assert.assertEquals(palindromeNumber.palindromeNumber(integer_1), true);
        Assert.assertEquals(palindromeNumber.palindromeNumber(integer_2), false);
    }
}
