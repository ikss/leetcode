package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumAreaPieceOfCakeTest {
    @Test
    fun test1() {
        val horizontalCuts = intArrayOf(3, 1)
        val verticalCuts = intArrayOf(1)
        val expected = 6

        assertEquals(expected, MaximumAreaPieceOfCake.maxArea(5, 4, horizontalCuts, verticalCuts))
    }

    @Test
    fun test2() {
        val horizontalCuts = intArrayOf(1, 2, 4)
        val verticalCuts = intArrayOf(1, 3)
        val expected = 4

        assertEquals(expected, MaximumAreaPieceOfCake.maxArea(5, 4, horizontalCuts, verticalCuts))
    }

    @Test
    fun test3() {
        val horizontalCuts = intArrayOf(3)
        val verticalCuts = intArrayOf(3)
        val expected = 9

        assertEquals(expected, MaximumAreaPieceOfCake.maxArea(5, 4, horizontalCuts, verticalCuts))
    }
}
