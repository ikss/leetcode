package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfIntegersToChooseFromRangeITest {
    @Test
    fun test1() {
        val banned = intArrayOf(1, 6, 5)
        val n = 5
        val maxSum = 6
        val expected = 2

        assertEquals(expected, MaximumNumberOfIntegersToChooseFromRangeI.maxCount(banned, n, maxSum))
    }

    @Test
    fun test2() {
        val banned = intArrayOf(1, 2, 3, 4, 5, 6, 7)
        val n = 8
        val maxSum = 1
        val expected = 0

        assertEquals(expected, MaximumNumberOfIntegersToChooseFromRangeI.maxCount(banned, n, maxSum))
    }

    @Test
    fun test3() {
        val banned = intArrayOf(11)
        val n = 7
        val maxSum = 50
        val expected = 7

        assertEquals(expected, MaximumNumberOfIntegersToChooseFromRangeI.maxCount(banned, n, maxSum))
    }
}