package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestSubarrayToBeRemovedToMakeArraySortedTest {
    @Test
    fun test1() {
        val arr = intArrayOf(1, 2, 3, 10, 4, 2, 3, 5)
        val expected = 3

        assertEquals(expected, ShortestSubarrayToBeRemovedToMakeArraySorted.findLengthOfShortestSubarray(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(5, 4, 3, 2, 1)
        val expected = 4

        assertEquals(expected, ShortestSubarrayToBeRemovedToMakeArraySorted.findLengthOfShortestSubarray(arr))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(1, 2, 3)
        val expected = 0

        assertEquals(expected, ShortestSubarrayToBeRemovedToMakeArraySorted.findLengthOfShortestSubarray(arr))
    }

    @Test
    fun test4() {
        val arr = intArrayOf(2, 2, 2, 1, 1, 1)
        val expected = 3

        assertEquals(expected, ShortestSubarrayToBeRemovedToMakeArraySorted.findLengthOfShortestSubarray(arr))
    }

}