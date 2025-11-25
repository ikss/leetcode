package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountNicePairsInArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(42, 11, 1, 97)
        val expected = 2

        assertEquals(expected, CountNicePairsInArray.countNicePairs(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(13, 10, 35, 24, 76)
        val expected = 4

        assertEquals(expected, CountNicePairsInArray.countNicePairs(nums))
    }
}