package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ApplyOperationsOnArrayToMaximizeSumOfSquaresTest {
    @Test
    fun test1() {
        val nums = listOf(2, 6, 5, 8)
        val k = 2
        val expected = 261

        assertEquals(expected, ApplyOperationsOnArrayToMaximizeSumOfSquares.maxSum(nums, k))
    }

    @Test
    fun test2() {
        val nums = listOf(4, 5, 4, 7)
        val k = 3
        val expected = 90

        assertEquals(expected, ApplyOperationsOnArrayToMaximizeSumOfSquares.maxSum(nums, k))
    }
}