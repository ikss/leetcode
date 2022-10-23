package arrays.easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class RunningSumOf1dArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = intArrayOf(1, 3, 6, 10)

        assertTrue(expected.contentEquals(RunningSumOf1dArray.runningSum(nums)))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1, 1, 1)
        val expected = intArrayOf(1, 2, 3, 4, 5)

        assertTrue(expected.contentEquals(RunningSumOf1dArray.runningSum(nums)))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(3, 1, 2, 10, 1)
        val expected = intArrayOf(3, 4, 6, 16, 17)

        assertTrue(expected.contentEquals(RunningSumOf1dArray.runningSum(nums)))
    }
}
