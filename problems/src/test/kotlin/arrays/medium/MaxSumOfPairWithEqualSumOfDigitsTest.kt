package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaxSumOfPairWithEqualSumOfDigitsTest {
    @Test
    fun test1() {
        val input = intArrayOf(18, 43, 36, 13, 7)
        val expected = 54

        assertEquals(expected, MaxSumOfPairWithEqualSumOfDigits.maximumSum(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(10, 12, 19, 14)
        val expected = -1

        assertEquals(expected, MaxSumOfPairWithEqualSumOfDigits.maximumSum(input))
    }
}