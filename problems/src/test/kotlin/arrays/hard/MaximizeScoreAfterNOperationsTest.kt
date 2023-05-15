package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeScoreAfterNOperationsTest {

    @Test
    fun test1() {
        val nums = intArrayOf(1, 2)
        val expected = 1

        assertEquals(expected, MaximizeScoreAfterNOperations.maxScore(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 4, 6, 8)
        val expected = 11

        assertEquals(expected, MaximizeScoreAfterNOperations.maxScore(nums))
    }
}