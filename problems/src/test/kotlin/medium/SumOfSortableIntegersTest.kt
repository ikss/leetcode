package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfSortableIntegersTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 1, 2)
        val expected = 3

        assertEquals(expected, SumOfSortableIntegers.sortableIntegers(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(7, 6, 5)
        val expected = 0

        assertEquals(expected, SumOfSortableIntegers.sortableIntegers(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(5, 8)
        val expected = 3

        assertEquals(expected, SumOfSortableIntegers.sortableIntegers(nums))
    }

    @Test
    fun test4() {
        val nums = intArrayOf(2, 3, 4, 1)
        val expected = 4

        assertEquals(expected, SumOfSortableIntegers.sortableIntegers(nums))
    }
}