package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxSumOfRectangleNoLargerKTest {

    @Test
    fun test1() {
        val matrix = arrayOf(intArrayOf(1, 0, 1), intArrayOf(0, -2, 3))
        val k = 2
        val expected = 2

        assertEquals(expected, MaxSumOfRectangleNoLargerK.maxSumSubmatrix(matrix, k))
    }

    @Test
    fun test2() {
        val matrix = arrayOf(intArrayOf(2, 2, -1))
        val k = 3
        val expected = 3

        assertEquals(expected, MaxSumOfRectangleNoLargerK.maxSumSubmatrix(matrix, k))
    }

}
