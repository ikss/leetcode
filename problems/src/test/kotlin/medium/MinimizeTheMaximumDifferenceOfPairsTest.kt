package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimizeTheMaximumDifferenceOfPairsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(10, 1, 2, 7, 1, 3)
        val p = 2
        val expected = 1

        assertEquals(expected, MinimizeTheMaximumDifferenceOfPairs.minimizeMax(nums, p))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(10, 1, 2, 7, 1, 3)
        val p = 1
        val expected = 0

        assertEquals(expected, MinimizeTheMaximumDifferenceOfPairs.minimizeMax(nums, p))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0, 5, 3, 4)
        val p = 0
        val expected = 0

        assertEquals(expected, MinimizeTheMaximumDifferenceOfPairs.minimizeMax(nums, p))
    }
}