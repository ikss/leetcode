package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ArithmeticSlicesIISubsequenceTest {

    @Test
    fun test1() {
        val nums = intArrayOf(2, 4, 6, 8, 10)
        val expected = 7

        assertEquals(expected, ArithmeticSlicesIISubsequence.numberOfArithmeticSlices(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(7, 7, 7, 7, 7)
        val expected = 16

        assertEquals(expected, ArithmeticSlicesIISubsequence.numberOfArithmeticSlices(nums))
    }
}