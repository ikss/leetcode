package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumAveragePassRatioTest {
    @Test
    fun test1() {
        val classes = arrayOf(intArrayOf(1, 2), intArrayOf(3, 5), intArrayOf(2, 2))
        val extraStudents = 2
        val expected = 0.78333

        assertEquals(expected, MaximumAveragePassRatio.maxAverageRatio(classes, extraStudents), 0.00001)
    }

    @Test
    fun test2() {
        val classes = arrayOf(intArrayOf(2, 4), intArrayOf(3, 9), intArrayOf(4, 5), intArrayOf(2, 10))
        val extraStudents = 4
        val expected = 0.53485

        assertEquals(expected, MaximumAveragePassRatio.maxAverageRatio(classes, extraStudents), 0.00001)
    }
}