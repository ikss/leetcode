package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LeastNumberOfUniqueIntegersAfterKRemovalsTest {
    @Test
    fun test1() {
        val arr = intArrayOf(5, 5, 4)
        val k = 1
        val expected = 1

        assertEquals(expected, LeastNumberOfUniqueIntegersAfterKRemovals.findLeastNumOfUniqueInts(arr, k))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(4, 3, 1, 1, 3, 3, 2)
        val k = 3
        val expected = 2

        assertEquals(expected, LeastNumberOfUniqueIntegersAfterKRemovals.findLeastNumOfUniqueInts(arr, k))
    }
}