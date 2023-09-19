package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheDuplicateNumberTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3, 4, 2, 2)
        val expected = 2

        assertEquals(expected, FindTheDuplicateNumber.findDuplicate(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 1, 3, 4, 2)
        val expected = 3

        assertEquals(expected, FindTheDuplicateNumber.findDuplicate(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 2, 2, 2, 2)
        val expected = 2

        assertEquals(expected, FindTheDuplicateNumber.findDuplicate(nums))
    }
}