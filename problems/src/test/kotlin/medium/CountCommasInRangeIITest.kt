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

    @Test
    fun test3() {
        val n = 234567813423525L
        val expected = 937270252693104L

        assertEquals(expected, CountCommasInRangeII.countCommas(n))
    }
}