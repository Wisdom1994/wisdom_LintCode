package com.wisdom.test.rudiment;

import com.wisdom.rudiment.ReverseWordsInAString;
import org.junit.Assert;
import org.junit.Test;

public class ReverseWordsInAStringTest {

    @Test
    public void reverseWordsTest() {
        ReverseWordsInAString rwias = new ReverseWordsInAString();
        String s = "   public     static void       main ";
        Assert.assertEquals(rwias.reverseWords(s), "main void static public");
    }
}
