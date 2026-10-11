package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfSquaresOfSpecialElementsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3, 4)
        val expected = 21

        assertEquals(expected, SumOfSquaresOfSpecialElements.sumOfSquares(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(2, 7, 1, 19, 18, 3)
        val expected = 63

        assertEquals(expected, SumOfSquaresOfSpecialElements.sumOfSquares(nums))
    }
}