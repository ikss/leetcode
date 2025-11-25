package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SubstringWithLargestVarianceTest {
    @Test
    fun test1() {
        val s = "aababbb"
        val expected = 3

        assertEquals(expected, SubstringWithLargestVariance.largestVariance(s))
    }

    @Test
    fun test2() {
        val s = "abcde"
        val expected = 0

        assertEquals(expected, SubstringWithLargestVariance.largestVariance(s))
    }
}