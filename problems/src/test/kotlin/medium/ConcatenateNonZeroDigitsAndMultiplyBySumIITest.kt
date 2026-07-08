package medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ConcatenateNonZeroDigitsAndMultiplyBySumIITest {
    @Test
    fun test1() {
        val s = "10203004"
        val queries = arrayOf(intArrayOf(0, 7), intArrayOf(1, 3), intArrayOf(4, 6))
        val expected = intArrayOf(12340, 4, 9)

        assertArrayEquals(expected, ConcatenateNonZeroDigitsAndMultiplyBySumII.sumAndMultiply(s, queries))
    }

    @Test
    fun test2() {
        val s = "1000"
        val queries = arrayOf(intArrayOf(0, 3), intArrayOf(1, 1))
        val expected = intArrayOf(1, 0)

        assertArrayEquals(expected, ConcatenateNonZeroDigitsAndMultiplyBySumII.sumAndMultiply(s, queries))
    }

    @Test
    fun test3() {
        val s = "9876543210"
        val queries = arrayOf(intArrayOf(0, 9))
        val expected = intArrayOf(444444137)

        assertArrayEquals(expected, ConcatenateNonZeroDigitsAndMultiplyBySumII.sumAndMultiply(s, queries))
    }


}