package com.wisdom.test.easy;

import com.wisdom.easy.Median;
import org.junit.Assert;
import org.junit.Test;

public class MedianTest {

    @Test
    public void medianTest() {
        Median median = new Median();
        int[] nums = new int[]{3,6,1,2,5};
        Assert.assertEquals(median.median_1(nums),3);
    }
}
