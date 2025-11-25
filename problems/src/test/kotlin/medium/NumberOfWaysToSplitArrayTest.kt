package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfWaysToSplitArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(10, 4, -8, 7)
        val expected = 2

        assertEquals(expected, NumberOfWaysToSplitArray.waysToSplitArray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 3, 1, 0)
        val expected = 2

        assertEquals(expected, NumberOfWaysToSplitArray.waysToSplitArray(nums))
    }
}