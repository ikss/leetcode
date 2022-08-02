package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KthSmallestElementInSortedMatrixTest {
    @Test
    fun test1() {
        val matrix = arrayOf(intArrayOf(1, 5, 9), intArrayOf(10, 11, 13), intArrayOf(12, 13, 15))
        val k = 8
        val expected = 13

        assertEquals(expected, KthSmallestElementInSortedMatrix.kthSmallest(matrix, k))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(intArrayOf(-5))
        val k = 1
        val expected = -5

        assertEquals(expected, KthSmallestElementInSortedMatrix.kthSmallest(matrix, k))
    }

}
