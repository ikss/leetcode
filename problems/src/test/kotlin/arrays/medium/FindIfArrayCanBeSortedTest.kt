package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindIfArrayCanBeSortedTest {
    @Test
    fun test1() {
        val input = intArrayOf(2, 1)
        val output = false

        assertEquals(output, FindIfArrayCanBeSorted.canSortArray(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(3, 4, 2, 3)
        val output = false

        assertEquals(output, FindIfArrayCanBeSorted.canSortArray(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(4, 2, 3)
        val output = true

        assertEquals(output, FindIfArrayCanBeSorted.canSortArray(input))
    }
}