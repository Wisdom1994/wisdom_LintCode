package com.wisdom.test.easy;

import com.wisdom.easy.PlusOne;
import org.junit.Assert;
import org.junit.Test;

public class PlusOneTest {

    @Test
    public void plusOneTest() {
        PlusOne plusOne = new PlusOne();
        int[] example = new int[]{1,2,3};
        int[] result = new int[]{1,2,4};
        Assert.assertArrayEquals(plusOne.plusOne(example),result);
    }
}
