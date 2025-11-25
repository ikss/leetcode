package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfDistinctElementsAfterOperationsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 2, 3, 3, 4)
        val k = 2
        val expected = 6

        assertEquals(expected, MaximumNumberOfDistinctElementsAfterOperations.maxDistinctElements(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 4, 4, 4)
        val k = 1
        val expected = 3

        assertEquals(expected, MaximumNumberOfDistinctElementsAfterOperations.maxDistinctElements(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(8, 8, 10, 9, 9)
        val k = 1
        val expected = 5

        assertEquals(expected, MaximumNumberOfDistinctElementsAfterOperations.maxDistinctElements(nums, k))
    }
}