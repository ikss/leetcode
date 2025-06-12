package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumDifferenceBetweenAdjacentElementsInCircularArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 4)
        val expected = 3

        assertEquals(expected, MaximumDifferenceBetweenAdjacentElementsInCircularArray.maxAdjacentDistance(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-5, -10, -5)
        val expected = 5

        assertEquals(expected, MaximumDifferenceBetweenAdjacentElementsInCircularArray.maxAdjacentDistance(nums))
    }
}