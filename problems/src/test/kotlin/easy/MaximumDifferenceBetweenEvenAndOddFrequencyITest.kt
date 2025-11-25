package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumDifferenceBetweenEvenAndOddFrequencyITest {
    @Test
    fun test1() {
        val s = "aaaaabbc"
        val expected = 3

        assertEquals(expected, MaximumDifferenceBetweenEvenAndOddFrequencyI.maxDifference(s))
    }

    @Test
    fun test2() {
        val s = "abcabcab"
        val expected = 1

        assertEquals(expected, MaximumDifferenceBetweenEvenAndOddFrequencyI.maxDifference(s))
    }
}