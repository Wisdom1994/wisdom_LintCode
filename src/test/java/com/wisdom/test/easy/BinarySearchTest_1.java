package com.wisdom.test.easy;

import com.wisdom.easy.BinarySearch_1;
import org.junit.Assert;

/**
 * LintCode 14 二分查找_1 Test
 */
public class BinarySearchTest_1 {
    @org.junit.Test
    public void binarySearchTest() {
        int[] nums = new int[]{1, 3, 5, 5, 5, 5, 9, 11, 13, 14, 21};
        int target = 5;
        BinarySearch_1 binarySearch = new BinarySearch_1();
        Assert.assertEquals(binarySearch.binarySearch(nums, target), 2);
    }
}
