package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BitwiseAndOfNumbersRangeTest {
    @Test
    fun test1() {
        val left = 5
        val right = 7
        val expected = 4

        assertEquals(expected, BitwiseAndOfNumbersRange.rangeBitwiseAnd(left, right))
    }

    @Test
    fun test2() {
        val left = 0
        val right = 1
        val expected = 0

        assertEquals(expected, BitwiseAndOfNumbersRange.rangeBitwiseAnd(left, right))
    }

    @Test
    fun test3() {
        val left = 1
        val right = 2147483647
        val expected = 0

        assertEquals(expected, BitwiseAndOfNumbersRange.rangeBitwiseAnd(left, right))
    }
}