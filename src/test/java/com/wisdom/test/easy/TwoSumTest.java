package com.wisdom.test.easy;

import com.wisdom.easy.TwoSum;
import org.junit.Assert;
import org.junit.Test;

public class TwoSumTest {

    @Test
    public void twoSumTest() {
        TwoSum twoSum = new TwoSum();
        int[] numbers = new int[]{2, 7, 8, 11};
        int target = 9;
        int[] result = new int[]{1, 2};
        Assert.assertArrayEquals(twoSum.twoSum(numbers, target), result);
    }
}
