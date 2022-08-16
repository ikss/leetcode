package data_structures.arrays.easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class BuildArrayFromPermutationTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 2, 1, 5, 3, 4)
        val expected = intArrayOf(0, 1, 2, 4, 5, 3)

        assertTrue(expected.contentEquals(BuildArrayFromPermutation.buildArray(nums)))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 0, 1, 2, 3, 4)
        val expected = intArrayOf(4, 5, 0, 1, 2, 3)

        assertTrue(expected.contentEquals(BuildArrayFromPermutation.buildArray(nums)))
    }
}
