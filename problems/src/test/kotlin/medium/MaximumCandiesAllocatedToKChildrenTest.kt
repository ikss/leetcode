package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumCandiesAllocatedToKChildrenTest {
    @Test
    fun test1() {
        val candies = intArrayOf(5, 8, 6)
        val k = 3L
        val expected = 5

        assertEquals(expected, MaximumCandiesAllocatedToKChildren.maximumCandies(candies, k))
    }

    @Test
    fun test2() {
        val candies = intArrayOf(2, 5)
        val k = 11L
        val expected = 0

        assertEquals(expected, MaximumCandiesAllocatedToKChildren.maximumCandies(candies, k))
    }
}