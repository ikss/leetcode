package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class BuildArrayFromPermutationTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 2, 1, 5, 3, 4)
        val expected = intArrayOf(0, 1, 2, 4, 5, 3)

        assertArrayEquals(expected, BuildArrayFromPermutation.buildArray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 0, 1, 2, 3, 4)
        val expected = intArrayOf(4, 5, 0, 1, 2, 3)

        assertArrayEquals(expected, BuildArrayFromPermutation.buildArray(nums))
    }
}
