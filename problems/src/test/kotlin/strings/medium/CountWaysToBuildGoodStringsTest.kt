package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountWaysToBuildGoodStringsTest {

    @Test
    fun test1() {
        val low = 3
        val high = 3
        val zero = 1
        val one = 1
        val expected = 8

        assertEquals(expected, CountWaysToBuildGoodStrings.countGoodStrings(low, high, zero, one))
    }

    @Test
    fun test2() {
        val low = 2
        val high = 3
        val zero = 1
        val one = 2
        val expected = 5

        assertEquals(expected, CountWaysToBuildGoodStrings.countGoodStrings(low, high, zero, one))
    }
}