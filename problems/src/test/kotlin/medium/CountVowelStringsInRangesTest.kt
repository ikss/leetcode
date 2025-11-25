package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CountVowelStringsInRangesTest {
    @Test
    fun test1() {
        val words = arrayOf("aba", "bcb", "ece", "aa", "e")
        val queries = arrayOf(intArrayOf(0, 2), intArrayOf(1, 4), intArrayOf(1, 1))
        val expected = intArrayOf(2, 3, 0)

        assertArrayEquals(expected, CountVowelStringsInRanges.vowelStrings(words, queries))
    }

    @Test
    fun test2() {
        val words = arrayOf("a", "e", "i")
        val queries = arrayOf(intArrayOf(0, 2), intArrayOf(0, 1), intArrayOf(2, 2))
        val expected = intArrayOf(3, 2, 1)

        assertArrayEquals(expected, CountVowelStringsInRanges.vowelStrings(words, queries))
    }
}