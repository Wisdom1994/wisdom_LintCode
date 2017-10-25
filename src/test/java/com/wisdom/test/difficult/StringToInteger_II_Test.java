package com.wisdom.test.difficult;

import com.wisdom.difficult.StringToIntegerII;
import org.junit.Assert;
import org.junit.Test;

public class StringToInteger_II_Test {
    @Test
    public void stringToIntger_2_Test() {
        StringToIntegerII stringToIntegerII = new StringToIntegerII();
        String str_1 = "10";
        String str_2 = "-19878helkjaoidu zzz";
        Assert.assertEquals(stringToIntegerII.atoi(str_1), 10);
        Assert.assertEquals(stringToIntegerII.atoi(str_2), -19878);
    }
}
