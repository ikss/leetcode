package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheLargestAlmostMissingIntegerTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 9, 2, 1, 7)
        val k = 3
        val expected = 7

        assertEquals(expected, FindTheLargestAlmostMissingInteger.largestInteger(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 9, 7, 2, 1, 7)
        val k = 4
        val expected = 3

        assertEquals(expected, FindTheLargestAlmostMissingInteger.largestInteger(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(0, 0)
        val k = 1
        val expected = -1

        assertEquals(expected, FindTheLargestAlmostMissingInteger.largestInteger(nums, k))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(0, 0)
        val k = 2
        val expected = 0

        assertEquals(expected, FindTheLargestAlmostMissingInteger.largestInteger(nums, k))
    }


}