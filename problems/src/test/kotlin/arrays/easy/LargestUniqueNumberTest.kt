package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LargestUniqueNumberTest {
    @Test
    fun test1Map() {
        val input = intArrayOf(5, 7, 3, 9, 4, 9, 8, 3, 1)
        val expected = 8

        assertEquals(expected, LargestUniqueNumber.largestUniqueNumberMap(input))
    }

    @Test
    fun test2Map() {
        val input = intArrayOf(9, 9, 8, 8)
        val expected = -1

        assertEquals(expected, LargestUniqueNumber.largestUniqueNumberMap(input))
    }

    @Test
    fun test1Array() {
        val input = intArrayOf(5, 7, 3, 9, 4, 9, 8, 3, 1)
        val expected = 8

        assertEquals(expected, LargestUniqueNumber.largestUniqueNumberArray(input))
    }

    @Test
    fun test2Array() {
        val input = intArrayOf(9, 9, 8, 8)
        val expected = -1

        assertEquals(expected, LargestUniqueNumber.largestUniqueNumberArray(input))
    }
}