package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindThePowerOfKSizeSubarraysITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4, 3, 2, 5)
        val k = 3
        val expected = intArrayOf(3, 4, -1, -1, -1)

        assertArrayEquals(expected, FindThePowerOfKSizeSubarraysI.resultsArray(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 2, 2, 2, 2)
        val k = 4
        val expected = intArrayOf(-1, -1)

        assertArrayEquals(expected, FindThePowerOfKSizeSubarraysI.resultsArray(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(3, 2, 3, 2, 3, 2)
        val k = 2
        val expected = intArrayOf(-1, 3, -1, 3, -1)

        assertArrayEquals(expected, FindThePowerOfKSizeSubarraysI.resultsArray(nums, k))
    }
}