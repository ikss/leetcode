package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DistributeElementsIntoTwoArraysITest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 1, 3)
        val expected = intArrayOf(2, 3, 1)

        assertEquals(expected, DistributeElementsIntoTwoArraysI.resultArray(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 4, 3, 8)
        val expected = intArrayOf(5, 3, 4, 8)

        assertEquals(expected, DistributeElementsIntoTwoArraysI.resultArray(nums))
    }
}