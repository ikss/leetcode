package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumDifferenceBetweenIncreasingElementsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(7, 1, 5, 4)
        val expected = 4

        assertEquals(expected, MaximumDifferenceBetweenIncreasingElements.maximumDifference(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(9, 4, 3, 2)
        val expected = -1

        assertEquals(expected, MaximumDifferenceBetweenIncreasingElements.maximumDifference(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 5, 2, 10)
        val expected = 9

        assertEquals(expected, MaximumDifferenceBetweenIncreasingElements.maximumDifference(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(1, 1, 1, 1)
        val expected = -1

        assertEquals(expected, MaximumDifferenceBetweenIncreasingElements.maximumDifference(nums))
    }
}