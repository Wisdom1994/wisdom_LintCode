package com.wisdom.test.easy;

import com.wisdom.easy.Strstr;
import org.junit.Assert;
import org.junit.Test;

public class StrstrTest {

    @Test
    public void strStrTest() {
        Strstr strstr = new Strstr();
        String source = "avcetesd";
        String target = "vce";
        Assert.assertEquals(strstr.strStr(source, target), 1);
    }
}
