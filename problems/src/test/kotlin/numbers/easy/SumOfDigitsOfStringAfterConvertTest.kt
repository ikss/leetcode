package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfDigitsOfStringAfterConvertTest {
    @Test
    fun test1() {
        val input = "iiii"
        val k = 1
        val expected = 36

        assertEquals(expected, SumOfDigitsOfStringAfterConvert.getLucky(input, k))
    }

    @Test
    fun test2() {
        val input = "leetcode"
        val k = 2
        val expected = 6

        assertEquals(expected, SumOfDigitsOfStringAfterConvert.getLucky(input, k))
    }

    @Test
    fun test3() {
        val input = "zbax"
        val k = 2
        val expected = 8

        assertEquals(expected, SumOfDigitsOfStringAfterConvert.getLucky(input, k))
    }
}