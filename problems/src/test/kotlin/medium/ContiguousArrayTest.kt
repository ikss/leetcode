package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ContiguousArrayTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1)
        val expected = 2

        assertEquals(expected, ContiguousArray.findMaxLength(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0, 1, 0)
        val expected = 2

        assertEquals(expected, ContiguousArray.findMaxLength(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 1, 1, 1, 1)
        val expected = 0

        assertEquals(expected, ContiguousArray.findMaxLength(nums))
    }
}