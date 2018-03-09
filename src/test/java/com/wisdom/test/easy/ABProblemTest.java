package com.wisdom.test.easy;

import com.wisdom.easy.ABProblem;
import org.junit.Assert;
import org.junit.Test;

public class ABProblemTest {

    @Test
    public void aplusbTest(){
        ABProblem abProblem = new ABProblem();
        int a = 5;
        int b = 7;
        int result = abProblem.aplusb(a, b);
        Assert.assertEquals(12, result);
    }
}
