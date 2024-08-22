package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CheckIfEveryRowAndColumnContainsAllNumbersTest {
    @Test
    fun test1() {
        val input = arrayOf(
            intArrayOf(1, 2, 3),
            intArrayOf(3, 1, 2),
            intArrayOf(2, 3, 1),
        )
        val expected = true

        assertEquals(expected, CheckIfEveryRowAndColumnContainsAllNumbers.checkValid(input))
    }

    @Test
    fun test2() {
        val input = arrayOf(
            intArrayOf(1, 1, 1),
            intArrayOf(1, 2, 3),
            intArrayOf(1, 2, 3),
        )
        val expected = false

        assertEquals(expected, CheckIfEveryRowAndColumnContainsAllNumbers.checkValid(input))
    }
}