package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTriangularSumOfAnArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4, 5)
        val expected = 8

        assertEquals(expected, FindTriangularSumOfAnArray.triangularSum(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5)
        val expected = 5

        assertEquals(expected, FindTriangularSumOfAnArray.triangularSum(nums))
    }
}