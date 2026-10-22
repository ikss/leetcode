package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumOperationsToSortAPermutationTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 2, 1)
        val expected = 2

        assertEquals(expected, MinimumOperationsToSortAPermutation.minOperations(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 0, 2)
        val expected = 2

        assertEquals(expected, MinimumOperationsToSortAPermutation.minOperations(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 0, 1, 3)
        val expected = -1

        assertEquals(expected, MinimumOperationsToSortAPermutation.minOperations(nums))
    }
}