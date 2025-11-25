package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ApplyOperationsToMaximizeScoreTest {
    @Test
    fun test1() {
        val nums = listOf(8, 3, 9, 3, 8)
        val k = 2
        val expected = 81

        assertEquals(expected, ApplyOperationsToMaximizeScore.maximumScore(nums, k))
    }

    @Test
    fun test2() {
        val nums = listOf(19, 12, 14, 6, 10, 18)
        val k = 3
        val expected = 4788

        assertEquals(expected, ApplyOperationsToMaximizeScore.maximumScore(nums, k))
    }
}