package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfSquareNumbersTest {
    @Test
    fun test1() {
        val c = 5
        val expected = true

        assertEquals(expected, SumOfSquareNumbers.judgeSquareSum(c))
    }

    @Test
    fun test2() {
        val c = 3
        val expected = false

        assertEquals(expected, SumOfSquareNumbers.judgeSquareSum(c))
    }

    @Test
    fun test3() {
        val c = 4
        val expected = true

        assertEquals(expected, SumOfSquareNumbers.judgeSquareSum(c))
    }

    @Test
    fun test4() {
        val c = 2
        val expected = true

        assertEquals(expected, SumOfSquareNumbers.judgeSquareSum(c))
    }
}