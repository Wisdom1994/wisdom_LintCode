package com.wisdom.test.easy;

import com.wisdom.easy.HashFunction;
import org.junit.Assert;
import org.junit.Test;

public class HashFunctionTest {

    @Test
    public void hashCodeTest() {
        HashFunction hashFunction = new HashFunction();
        char[] ch = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g' };
        int hashcode = 2607;
        Assert.assertEquals(hashFunction.hashCode(ch, hashcode), 1225);
    }
}
