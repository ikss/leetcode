package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LeastNumberOfUniqueIntegersAfterKRemovalsTest {
    @Test
    fun test1sortValues() {
        val arr = intArrayOf(5, 5, 4)
        val k = 1
        val expected = 1

        assertEquals(expected, LeastNumberOfUniqueIntegersAfterKRemovals.findLeastNumOfUniqueIntsSortValues(arr, k))
    }

    @Test
    fun test2sortValues() {
        val arr = intArrayOf(4, 3, 1, 1, 3, 3, 2)
        val k = 3
        val expected = 2

        assertEquals(expected, LeastNumberOfUniqueIntegersAfterKRemovals.findLeastNumOfUniqueIntsSortValues(arr, k))
    }

    @Test
    fun test1sortCountSort() {
        val arr = intArrayOf(5, 5, 4)
        val k = 1
        val expected = 1

        assertEquals(expected, LeastNumberOfUniqueIntegersAfterKRemovals.findLeastNumOfUniqueIntsCountSort(arr, k))
    }

    @Test
    fun test2sortCountSort() {
        val arr = intArrayOf(4, 3, 1, 1, 3, 3, 2)
        val k = 3
        val expected = 2

        assertEquals(expected, LeastNumberOfUniqueIntegersAfterKRemovals.findLeastNumOfUniqueIntsCountSort(arr, k))
    }
}