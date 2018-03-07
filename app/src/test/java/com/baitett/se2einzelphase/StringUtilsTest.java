package com.baitett.se2einzelphase;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    @Test
    public void testPalindromeTrue(){
        Assert.assertTrue(StringUtils.isPalindrome("tacocat"));
    }
    public void testPalindromeFalse(){
        Assert.assertFalse(StringUtils.isPalindrome("notacocat"));
    }
}