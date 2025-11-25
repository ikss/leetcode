package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MissingRangesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(0, 1, 3, 50, 75)
        val lower = 0
        val upper = 99
        val expected = listOf(listOf(2, 2), listOf(4, 49), listOf(51, 74), listOf(76, 99))

        assertEquals(expected, MissingRanges.findMissingRanges(nums, lower, upper))
    }
    
    @Test
    fun test2() {
        val nums = intArrayOf(-1)
        val lower = -1
        val upper = -1
        val expected = emptyList<List<Int>>()

        assertEquals(expected, MissingRanges.findMissingRanges(nums, lower, upper))
    }
}