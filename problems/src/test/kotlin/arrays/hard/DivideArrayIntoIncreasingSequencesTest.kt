package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DivideArrayIntoIncreasingSequencesTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 2, 3, 3, 4, 4)
        val k = 3
        val expected = true

        assertEquals(expected, DivideArrayIntoIncreasingSequences.canDivideIntoSubsequences(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 6, 6, 7, 8)
        val k = 3
        val expected = false

        assertEquals(expected, DivideArrayIntoIncreasingSequences.canDivideIntoSubsequences(nums, k))
    }
}