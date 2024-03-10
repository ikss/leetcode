package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NextPermutationTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val expected = intArrayOf(1, 3, 2)

        NextPermutation.nextPermutation(nums)

        assertArrayEquals(expected, nums)
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 2, 1)
        val expected = intArrayOf(1, 2, 3)

        NextPermutation.nextPermutation(nums)

        assertArrayEquals(expected, nums)
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 5)
        val expected = intArrayOf(1, 5, 1)

        NextPermutation.nextPermutation(nums)

        assertArrayEquals(expected, nums)
    }
}