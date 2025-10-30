package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumNumberOfIncrementsOnSubarraysToFormTargetArrayTest {
    @Test
    fun test1() {
        val target = intArrayOf(1, 2, 3, 2, 1)
        val expected = 3

        assertEquals(expected, MinimumNumberOfIncrementsOnSubarraysToFormTargetArray.minNumberOperations(target))
    }

    @Test
    fun test2() {
        val target = intArrayOf(3, 1, 1, 2)
        val expected = 4

        assertEquals(expected, MinimumNumberOfIncrementsOnSubarraysToFormTargetArray.minNumberOperations(target))
    }

    @Test
    fun test3() {
        val target = intArrayOf(3, 1, 5, 4, 2)
        val expected = 7

        assertEquals(expected, MinimumNumberOfIncrementsOnSubarraysToFormTargetArray.minNumberOperations(target))
    }
}