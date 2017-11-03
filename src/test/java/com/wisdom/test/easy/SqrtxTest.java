package com.wisdom.test.easy;

import com.wisdom.easy.Sqrtx;
import org.junit.Assert;
import org.junit.Test;

public class SqrtxTest {
    @Test
    public void sqrtxTest() {
        Sqrtx sqrtx = new Sqrtx();
        int x1 = 100;
        int x2 = 10000;
        Assert.assertEquals(sqrtx.sqrtDemo(x1), 10);
        Assert.assertEquals(sqrtx.sqrt(x2), 100);
    }
}
