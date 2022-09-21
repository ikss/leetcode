package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KthSmallestElementInSortedMatrixTest {
    @Test
    fun test1binarySearch() {
        val matrix = arrayOf(intArrayOf(1, 5, 9), intArrayOf(10, 11, 13), intArrayOf(12, 13, 15))
        val k = 8
        val expected = 13

        assertEquals(expected, KthSmallestElementInSortedMatrix.kthSmallestBinarySearch(matrix, k))
    }

    @Test
    fun test2binarySearch() {
        val matrix = arrayOf(intArrayOf(-5))
        val k = 1
        val expected = -5

        assertEquals(expected, KthSmallestElementInSortedMatrix.kthSmallestBinarySearch(matrix, k))
    }

    @Test
    fun test1priorityQueue() {
        val matrix = arrayOf(intArrayOf(1, 5, 9), intArrayOf(10, 11, 13), intArrayOf(12, 13, 15))
        val k = 8
        val expected = 13

        assertEquals(expected, KthSmallestElementInSortedMatrix.kthSmallestPriorityQueue(matrix, k))
    }

    @Test
    fun test2priorityQueue() {
        val matrix = arrayOf(intArrayOf(-5))
        val k = 1
        val expected = -5

        assertEquals(expected, KthSmallestElementInSortedMatrix.kthSmallestPriorityQueue(matrix, k))
    }
}
