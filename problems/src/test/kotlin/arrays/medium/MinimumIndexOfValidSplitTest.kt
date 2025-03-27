package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumIndexOfValidSplitTest {
    @Test
    fun test1() {
        val nums = listOf(1, 2, 2, 2)
        val expected = 2

        assertEquals(expected, MinimumIndexOfValidSplit.minimumIndex(nums))
    }

    @Test
    fun test2() {
        val nums = listOf(2, 1, 3, 1, 1, 1, 7, 1, 2, 1)
        val expected = 4

        assertEquals(expected, MinimumIndexOfValidSplit.minimumIndex(nums))
    }

    @Test
    fun test3() {
        val nums = listOf(3, 3, 3, 3, 7, 2, 2)
        val expected = -1

        assertEquals(expected, MinimumIndexOfValidSplit.minimumIndex(nums))
    }

    @Test
    fun test4() {
        val nums = listOf(1, 1)
        val expected = 0

        assertEquals(expected, MinimumIndexOfValidSplit.minimumIndex(nums))
    }
}