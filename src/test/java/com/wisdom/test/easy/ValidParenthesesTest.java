package com.wisdom.test.easy;

import com.wisdom.easy.ValidParentheses;
import org.junit.Assert;
import org.junit.Test;

public class ValidParenthesesTest {

    @Test
    public void isValidTest() {
        ValidParentheses validParentheses = new ValidParentheses();
        String valids_1 = "[][]{}{}";
        String valids_2 = "[{({})([]{})}]";
        String valids_3 = "[]{}{(}){}][";
        Assert.assertEquals(validParentheses.isValidParentheses(valids_1), true);
        Assert.assertEquals(validParentheses.isValidParentheses(valids_2), true);
        Assert.assertEquals(validParentheses.isValidParentheses(valids_3), false);
    }
}
