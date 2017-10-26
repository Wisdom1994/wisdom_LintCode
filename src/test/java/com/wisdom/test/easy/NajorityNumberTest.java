package com.wisdom.test.easy;

import com.wisdom.easy.NajorityNumber;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

public class NajorityNumberTest {

    @Test
    public void najorityTest() {
        NajorityNumber najorityNumber = new NajorityNumber();
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        Assert.assertEquals(najorityNumber.majorityNumber(arrayList), 1);
    }
}
