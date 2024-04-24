package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestNumberTest {
    @Test
    fun test1() {
        val input = intArrayOf(10, 2)
        val expected = "210"

        assertEquals(expected, LargestNumber.largestNumber(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(3, 30, 34, 5, 9)
        val expected = "9534330"

        assertEquals(expected, LargestNumber.largestNumber(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(0, 0)
        val expected = "0"

        assertEquals(expected, LargestNumber.largestNumber(input))
    }

    @Test
    fun test4() {
        val input = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
        val expected = "9876543210"

        assertEquals(expected, LargestNumber.largestNumber(input))
    }
}