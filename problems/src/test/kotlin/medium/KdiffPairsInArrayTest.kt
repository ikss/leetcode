package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KdiffPairsInArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 1, 4, 1, 5)
        val k = 2
        val expected = 2

        assertEquals(expected, KdiffPairsInArray.findPairs(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val k = 1
        val expected = 4

        assertEquals(expected, KdiffPairsInArray.findPairs(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 3, 1, 5, 4)
        val k = 0
        val expected = 1

        assertEquals(expected, KdiffPairsInArray.findPairs(nums, k))
    }
}