package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class UniqueSubstringsWithEqualDigitFrequencyTest {
    @Test
    fun test1() {
        val input = "1212"
        val expected = 5

        assertEquals(expected, UniqueSubstringsWithEqualDigitFrequency.equalDigitFrequency(input))
    }

    @Test
    fun test2() {
        val input = "12321"
        val expected = 9

        assertEquals(expected, UniqueSubstringsWithEqualDigitFrequency.equalDigitFrequency(input))
    }
}