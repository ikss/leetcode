package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstrainedSubsequenceSumTest {
    @Test
    fun test1() {
        val nums = intArrayOf(10, 2, -10, 5, 20)
        val k = 2
        val expected = 37

        assertEquals(expected, ConstrainedSubsequenceSum.constrainedSubsetSum(nums, k))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(-1, -2, -3)
        val k = 1
        val expected = -1

        assertEquals(expected, ConstrainedSubsequenceSum.constrainedSubsetSum(nums, k))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(10, -2, -10, -5, 20)
        val k = 2
        val expected = 23

        assertEquals(expected, ConstrainedSubsequenceSum.constrainedSubsetSum(nums, k))
    }
}