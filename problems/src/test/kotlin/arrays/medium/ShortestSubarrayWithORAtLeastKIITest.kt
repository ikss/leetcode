package arrays.medium

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class ShortestSubarrayWithORAtLeastKIITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val k = 2
        val expected = 1

        assertEquals(expected, ShortestSubarrayWithORAtLeastKII.minimumSubarrayLength(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 1, 8)
        val k = 10
        val expected = 3

        assertEquals(expected, ShortestSubarrayWithORAtLeastKII.minimumSubarrayLength(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 2)
        val k = 0
        val expected = 1

        assertEquals(expected, ShortestSubarrayWithORAtLeastKII.minimumSubarrayLength(nums, k))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(2, 1, 9, 12)
        val k = 21
        val expected = -1

        assertEquals(expected, ShortestSubarrayWithORAtLeastKII.minimumSubarrayLength(nums, k))
    }
}