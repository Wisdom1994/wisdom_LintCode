package com.wisdom.test.easy;

import com.wisdom.easy.LengthOfLastWord;
import org.junit.Assert;
import org.junit.Test;

public class LengthOfLastWordTest {

    @Test
    public void lengthOfLastWordTest() {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        String example = "Hello World";
        Assert.assertEquals(lengthOfLastWord.lengthOfLastWord(example), 5);
    }
}
