package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class KRadiusSubarrayAveragesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(7, 4, 3, 9, 1, 8, 5, 2, 6)
        val k = 3
        val expected = intArrayOf(-1, -1, -1, 5, 4, 4, -1, -1, -1)

        assertArrayEquals(expected, KRadiusSubarrayAverages.getAverages(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(100000)
        val k = 0
        val expected = intArrayOf(100000)

        assertArrayEquals(expected, KRadiusSubarrayAverages.getAverages(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(8)
        val k = 100000
        val expected = intArrayOf(-1)

        assertArrayEquals(expected, KRadiusSubarrayAverages.getAverages(nums, k))
    }
}