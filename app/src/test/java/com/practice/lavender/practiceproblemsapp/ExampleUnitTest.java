package com.practice.lavender.practiceproblemsapp;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void isStringUniqueNaive() {
        assertTrue(MainActivity.stringHasAllUniqueChars("abcdef"));
        assertFalse(MainActivity.stringHasAllUniqueChars("abcdefa"));
    }

    @Test
    public void isStringUniqueOptimized() {
        assertTrue(MainActivity.stringHasAllUniqueCharsOptimized("abcdef"));
        assertFalse(MainActivity.stringHasAllUniqueCharsOptimized("abcdefa"));
    }

    @Test
    public void isPermutation() {
        String first = "aaabbb";
        String second = "bbbaaa";
        String third = " AbAbasbjd";
        String fourth ="AAABBB";
        assertTrue(MainActivity.isPermutation(first, second));
        assertTrue(MainActivity.isPermutation(second, first));
        assertFalse(MainActivity.isPermutation(first, third));
        assertFalse(MainActivity.isPermutation(first, fourth));
    }

    @Test
    public void isPermutationSinglePass() {
        String first = "aaabbb";
        String second = "bbbaaa";
        String third = " AbAbasbjd";
        String fourth ="AAABBB";
        assertTrue(MainActivity.isPermutationSinglePass(first, second));
        assertTrue(MainActivity.isPermutationSinglePass(second, first));
        assertFalse(MainActivity.isPermutationSinglePass(first, third));
        assertFalse(MainActivity.isPermutationSinglePass(first, fourth));
    }

//    @Test
//    public void URLifyCompressSpaces() {
//        assertEquals("test%20string", MainActivity.URLifyCompressSpaces("test string"));
//        assertEquals("a%20b%20c%20d",MainActivity.URLifyCompressSpaces("a b c d"));
//    }
}