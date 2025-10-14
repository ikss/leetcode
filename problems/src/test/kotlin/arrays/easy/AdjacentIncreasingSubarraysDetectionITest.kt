package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AdjacentIncreasingSubarraysDetectionITest {
    @Test
    fun test1() {
        val nums = listOf(2, 5, 7, 8, 9, 2, 3, 4, 3, 1)
        val k = 3
        val expected = true

        assertEquals(expected, AdjacentIncreasingSubarraysDetectionI.hasIncreasingSubarrays(nums, k))
    }

    @Test
    fun test2() {
        val nums = listOf(1, 2, 3, 4, 4, 4, 4, 5, 6, 7)
        val k = 5
        val expected = false

        assertEquals(expected, AdjacentIncreasingSubarraysDetectionI.hasIncreasingSubarrays(nums, k))
    }

    @Test
    fun test3() {
        val nums = listOf(5, 8, -2, -1)
        val k = 2
        val expected = true

        assertEquals(expected, AdjacentIncreasingSubarraysDetectionI.hasIncreasingSubarrays(nums, k))
    }

    @Test
    fun test4() {
        val nums = listOf(-15, -13, 4, 7)
        val k = 2
        val expected = true

        assertEquals(expected, AdjacentIncreasingSubarraysDetectionI.hasIncreasingSubarrays(nums, k))
    }
}