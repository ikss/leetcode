package arrays.easy

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

internal class SquaresOfASortedArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(-4, -1, 0, 3, 10)
        val expected = intArrayOf(0, 1, 9, 16, 100)
        val result = SquaresOfSortedArray.sortedSquares(nums)

        assertTrue(expected.contentEquals(result))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-7, -3, 2, 3, 11)
        val expected = intArrayOf(4, 9, 9, 49, 121)
        val result = SquaresOfSortedArray.sortedSquares(nums)

        assertTrue(expected.contentEquals(result))
    }
}
