package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumDifferenceByRemappingDigitTest {
    @Test
    fun test1() {
        val num = 11891
        val expected = 99009

        assertEquals(expected, MaximumDifferenceByRemappingDigit.minMaxDifference(num))
    }

    @Test
    fun test2() {
        val num = 90
        val expected = 99

        assertEquals(expected, MaximumDifferenceByRemappingDigit.minMaxDifference(num))
    }
}