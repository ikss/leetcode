package arrays.hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindXSumOfAllKLongSubarraysIITest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 2, 2, 3, 4, 2, 3)
        val k = 6
        val x = 2
        val expected = longArrayOf(6, 10, 12)
        assertArrayEquals(expected, FindXSumOfAllKLongSubarraysII.findXSum(nums, k, x))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 8, 7, 8, 7, 5)
        val k = 2
        val x = 2
        val expected = longArrayOf(11, 15, 15, 15, 12)
        assertArrayEquals(expected, FindXSumOfAllKLongSubarraysII.findXSum(nums, k, x))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1000000000, 1000000000, 1000000000, 1000000000, 1000000000, 1000000000)
        val k = 6
        val x = 2
        val expected = longArrayOf(6000000000)
        assertArrayEquals(expected, FindXSumOfAllKLongSubarraysII.findXSum(nums, k, x))
    }
}