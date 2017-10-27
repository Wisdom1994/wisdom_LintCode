package com.wisdom.test.easy;

import com.wisdom.easy.ReverseInteger;
import org.junit.Assert;
import org.junit.Test;

public class ReverseIntegerTest {
    @Test
    public void reverseTest() {
        ReverseInteger reverseInteger = new ReverseInteger();
        int n = 11626126;
        Assert.assertEquals(reverseInteger.reverseInteger(n),62162611);
    }
}
