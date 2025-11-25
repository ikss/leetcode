package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountPrefixAndSuffixPairsITest {
    @Test
    fun test1() {
        val words = arrayOf("a", "aba", "ababa", "aa")
        val expected = 4

        assertEquals(expected, CountPrefixAndSuffixPairsI.countPrefixSuffixPairs(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("pa", "papa", "ma", "mama")
        val expected = 2

        assertEquals(expected, CountPrefixAndSuffixPairsI.countPrefixSuffixPairs(words))
    }

    @Test
    fun test3() {
        val words = arrayOf("abab", "ab")
        val expected = 0

        assertEquals(expected, CountPrefixAndSuffixPairsI.countPrefixSuffixPairs(words))
    }
}