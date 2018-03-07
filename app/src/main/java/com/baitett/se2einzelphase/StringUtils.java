package com.baitett.se2einzelphase;

/**
 * Created by marcpichler on 06.03.2018.
 */

public final class StringUtils {
    /**
     * Checks string for palindrome.
     * @param string the string to check for palindrome
     * @return true if string is palindrome
     */
    public static boolean isPalindrome(String string)	{
        return string.equals(new StringBuilder(string).reverse().toString());
    }
}
