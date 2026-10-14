package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeSumOfSquaresOfDigitsTest {
    @Test
    fun test1() {
        val num = 2
        val sum = 3
        val expected = "30"

        assertEquals(expected, MaximizeSumOfSquaresOfDigits.maxSumOfSquares(num, sum))
    }

    @Test
    fun test2() {
        val num = 2
        val sum = 17
        val expected = "98"

        assertEquals(expected, MaximizeSumOfSquaresOfDigits.maxSumOfSquares(num, sum))
    }

    @Test
    fun test3() {
        val num = 1
        val sum = 10
        val expected = ""

        assertEquals(expected, MaximizeSumOfSquaresOfDigits.maxSumOfSquares(num, sum))
    }
}