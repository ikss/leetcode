package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumValueAtGivenIndexInBoundedArrayTest {
    @Test
    fun test1() {
        val n = 4
        val index = 2
        val maxSum = 6
        val expected = 2

        assertEquals(expected, MaximumValueAtGivenIndexInBoundedArray.maxValue(n, index, maxSum))
    }

    @Test
    fun test2() {
        val n = 6
        val index = 1
        val maxSum = 10
        val expected = 3

        assertEquals(expected, MaximumValueAtGivenIndexInBoundedArray.maxValue(n, index, maxSum))
    }
}