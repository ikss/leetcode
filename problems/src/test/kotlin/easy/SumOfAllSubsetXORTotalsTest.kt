package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfAllSubsetXORTotalsTest {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 3)
        val expected = 6

        assertEquals(expected, SumOfAllSubsetXORTotals.subsetXORSum(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(5, 1, 6)
        val expected = 28

        assertEquals(expected, SumOfAllSubsetXORTotals.subsetXORSum(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(3, 4, 5, 6, 7, 8)
        val expected = 480

        assertEquals(expected, SumOfAllSubsetXORTotals.subsetXORSum(nums))
    }
}