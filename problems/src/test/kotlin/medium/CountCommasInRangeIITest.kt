package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountCommasInRangeIITest {
    @Test
    fun test1() {
        val n = 1002L
        val expected = 3L

        assertEquals(expected, CountCommasInRangeII.countCommas(n))
    }

    @Test
    fun test2() {
        val n = 998L
        val expected = 0L

        assertEquals(expected, CountCommasInRangeII.countCommas(n))
    }
}