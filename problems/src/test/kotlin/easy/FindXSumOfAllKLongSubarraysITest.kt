package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindXSumOfAllKLongSubarraysITest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 1, 2, 2, 3, 4, 2, 3)
        val k = 6
        val x = 2
        val expected = intArrayOf(6, 10, 12)
        assertArrayEquals(expected, FindXSumOfAllKLongSubarraysI.findXSum(nums, k, x))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 8, 7, 8, 7, 5)
        val k = 2
        val x = 2
        val expected = intArrayOf(11, 15, 15, 15, 12)
        assertArrayEquals(expected, FindXSumOfAllKLongSubarraysI.findXSum(nums, k, x))
    }
}