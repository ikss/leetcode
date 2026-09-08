package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountCommasInRangeTest {
    @Test
    fun test1() {
        val n = 1002
        val expected = 3

        assertEquals(expected, CountCommasInRange.countCommas(n))
    }

    @Test
    fun test2() {
        val n = 998
        val expected = 0

        assertEquals(expected, CountCommasInRange.countCommas(n))
    }
}