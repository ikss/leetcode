package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumKToSortAPermutationTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 3, 2, 1)
        val expected = 1

        assertEquals(expected, MaximumKToSortAPermutation.sortPermutation(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1, 3, 2)
        val expected = 2

        assertEquals(expected, MaximumKToSortAPermutation.sortPermutation(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(3, 2, 1, 0)
        val expected = 0

        assertEquals(expected, MaximumKToSortAPermutation.sortPermutation(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(0, 1, 2, 3)
        val expected = 0

        assertEquals(expected, MaximumKToSortAPermutation.sortPermutation(nums))
    }
}