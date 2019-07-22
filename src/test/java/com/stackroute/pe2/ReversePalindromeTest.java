package com.stackroute.pe2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReversePalindromeTest {

    private ReversePalindrome reversePalindrome;

    @Before
    public void setUp()  {
        reversePalindrome = new ReversePalindrome();
    }

    @After
    public void tearDown()  {
        reversePalindrome = null;
    }

    @Test
    public void inputStringChecksForPalindrome() {

        assertEquals("palindrome",reversePalindrome.palindromeCheck("asdsa"));
    }

    @Test
    public void inputStringChecksForPalindromeGivesNotPalindrome() {

        assertEquals("not palindrome",reversePalindrome.palindromeCheck("qwerty"));
    }

    @Test
    public void inputStringChecksForNull() {

        assertNull(reversePalindrome.palindromeCheck(null));
    }

    @Test
    public void inputStringChecksForNotNull() {

        assertNotNull(reversePalindrome.palindromeCheck("adaaaa"));
    }

    @Test
    public void inputStringChecksForPalindromeGivesNotEqual() {

        assertNotEquals("not palindrome",reversePalindrome.palindromeCheck("zxcvcxz"));
    }
}