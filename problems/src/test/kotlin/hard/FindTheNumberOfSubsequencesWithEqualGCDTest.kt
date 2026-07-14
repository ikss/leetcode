package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheNumberOfSubsequencesWithEqualGCDTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = 10

        assertEquals(expected, FindTheNumberOfSubsequencesWithEqualGCD.subsequencePairCount(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(10, 20, 30)
        val expected = 2

        assertEquals(expected, FindTheNumberOfSubsequencesWithEqualGCD.subsequencePairCount(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 1, 1)
        val expected = 50

        assertEquals(expected, FindTheNumberOfSubsequencesWithEqualGCD.subsequencePairCount(nums))
    }
}