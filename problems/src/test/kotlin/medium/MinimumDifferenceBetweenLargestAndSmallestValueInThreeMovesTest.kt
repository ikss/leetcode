package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumDifferenceBetweenLargestAndSmallestValueInThreeMovesTest {
    @Test
    fun test1() {
        val input = intArrayOf(5, 3, 2, 4)
        val expected = 0

        assertEquals(expected, MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves.minDifference(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(1, 5, 0, 10, 14)
        val expected = 1

        assertEquals(expected, MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves.minDifference(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(3, 100, 20)
        val expected = 0

        assertEquals(expected, MinimumDifferenceBetweenLargestAndSmallestValueInThreeMoves.minDifference(input))
    }
}