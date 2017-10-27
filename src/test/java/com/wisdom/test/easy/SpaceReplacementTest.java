package com.wisdom.test.easy;

import com.wisdom.easy.SpaceReplacement;
import org.junit.Assert;
import org.junit.Test;

public class SpaceReplacementTest {

    @Test
    public void replaceBlankTest() {
        SpaceReplacement spaceReplacement = new SpaceReplacement();
        char[] string = new char[]{'h', 'e', ' ', 'l', 'l', ' ', 'o', ' ', ' '};
        int length = 3;
        Assert.assertEquals(spaceReplacement.replaceBlank(string, length), 5);
    }
}
