package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SmallestIndexWithEqualValueTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 2)
        val expected = 0

        assertEquals(expected, SmallestIndexWithEqualValue.smallestEqual(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(4, 3, 2, 1)
        val expected = 2

        assertEquals(expected, SmallestIndexWithEqualValue.smallestEqual(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(7, 8, 3, 5, 2, 6, 3, 1, 1, 4, 5, 4, 8, 7, 2, 0, 9, 9, 0, 5, 7, 1, 6)
        val expected = 21

        assertEquals(expected, SmallestIndexWithEqualValue.smallestEqual(nums))
    }

    @Test
    fun test1OneLine() {
        val nums = intArrayOf(0, 1, 2)
        val expected = 0

        assertEquals(expected, SmallestIndexWithEqualValue.smallestEqualOneLine(nums))
    }

    @Test
    fun test2OneLine() {
        val nums = intArrayOf(4, 3, 2, 1)
        val expected = 2

        assertEquals(expected, SmallestIndexWithEqualValue.smallestEqualOneLine(nums))
    }

    @Test
    fun test3OneLine() {
        val nums = intArrayOf(7, 8, 3, 5, 2, 6, 3, 1, 1, 4, 5, 4, 8, 7, 2, 0, 9, 9, 0, 5, 7, 1, 6)
        val expected = 21

        assertEquals(expected, SmallestIndexWithEqualValue.smallestEqualOneLine(nums))
    }
}