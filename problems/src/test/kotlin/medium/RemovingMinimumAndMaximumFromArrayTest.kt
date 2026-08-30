package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RemovingMinimumAndMaximumFromArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 10, 7, 5, 4, 1, 8, 6)
        val expected = 5

        assertEquals(expected, RemovingMinimumAndMaximumFromArray.minimumDeletions(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, -4, 19, 1, 8, -2, -3, 5)
        val expected = 3

        assertEquals(expected, RemovingMinimumAndMaximumFromArray.minimumDeletions(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(101)
        val expected = 1

        assertEquals(expected, RemovingMinimumAndMaximumFromArray.minimumDeletions(nums))
    }
}