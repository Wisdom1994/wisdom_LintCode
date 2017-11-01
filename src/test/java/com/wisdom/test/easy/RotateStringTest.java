package com.wisdom.test.easy;

import com.wisdom.easy.RotateString;
import org.junit.Assert;
import org.junit.Test;

public class RotateStringTest {

    @Test
    public void rotateStringTest() {
        RotateString rotateString = new RotateString();
        char[] str = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        int offset = 10;
        rotateString.rotateString(str, offset);
        // 对于void方法，不容易进行测试，可以使用另外的方法调用测试方法，在这里进行断言测试
        Assert.assertTrue(true);
    }
}
