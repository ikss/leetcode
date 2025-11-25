package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindIfArrayCanBeSortedTest {
    @Test
    fun test1() {
        val input = intArrayOf(1, 2, 3, 4, 5)
        val output = true

        assertEquals(output, FindIfArrayCanBeSorted.canSortArray(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(3,16,8,4,2)
        val output = false

        assertEquals(output, FindIfArrayCanBeSorted.canSortArray(input))
    }
}