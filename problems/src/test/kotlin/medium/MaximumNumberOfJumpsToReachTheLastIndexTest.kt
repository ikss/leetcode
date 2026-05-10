package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfJumpsToReachTheLastIndexTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 6, 4, 1, 2)
        val target = 2
        val expected = 3

        assertEquals(expected, medium.MaximumNumberOfJumpsToReachTheLastIndex.maximumJumps(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 3, 6, 4, 1, 2)
        val target = 3
        val expected = 5

        assertEquals(expected, medium.MaximumNumberOfJumpsToReachTheLastIndex.maximumJumps(nums, target))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 3, 6, 4, 1, 2)
        val target = 0
        val expected = -1

        assertEquals(expected, medium.MaximumNumberOfJumpsToReachTheLastIndex.maximumJumps(nums, target))
    }
}