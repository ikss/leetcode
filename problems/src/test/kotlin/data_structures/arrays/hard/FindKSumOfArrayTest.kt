package data_structures.arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindKSumOfArrayTest {

    @Test
    fun test1() {
        val nums = intArrayOf(2, 4, -2)
        val k = 5
        val expected = 2L

        assertEquals(expected, FindKSumOfArray.kSum(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, -2, 3, 4, -10, 12)
        val k = 16
        val expected = 10L

        assertEquals(expected, FindKSumOfArray.kSum(nums, k))
    }
}
