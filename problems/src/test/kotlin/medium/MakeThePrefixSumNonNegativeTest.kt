package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MakeThePrefixSumNonNegativeTest {
    @Test
    fun test1() {
        val input = intArrayOf(2, 3, -5, 4)
        val expected = 0

        assertEquals(expected, MakeThePrefixSumNonNegative.makePrefSumNonNegative(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(3, -5, -2, 6)
        val expected = 1

        assertEquals(expected, MakeThePrefixSumNonNegative.makePrefSumNonNegative(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(6, -6, -3, 3, 1, 5, -4, -3, -2, -3, 4, -1, 4, 4, -2, 6, 0)
        val expected = 1

        assertEquals(expected, MakeThePrefixSumNonNegative.makePrefSumNonNegative(input))
    }
}