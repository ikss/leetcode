package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfGCDOfFormedPairsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(2, 4, 6)
        val expected = 2L

        assertEquals(expected, SumOfGCDOfFormedPairs.gcdSum(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 6, 8, 2)
        val expected = 5L

        assertEquals(expected, SumOfGCDOfFormedPairs.gcdSum(nums))
    }
}