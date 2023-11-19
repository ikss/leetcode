package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReductionOperationsToMakeTheArrayElementsEqualTest {
    @Test
    fun test1() {
        val nums = intArrayOf(5, 1, 3)
        val expected = 3

        assertEquals(expected, ReductionOperationsToMakeTheArrayElementsEqual.reductionOperations(nums))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(1, 1, 1)
        val expected = 0

        assertEquals(expected, ReductionOperationsToMakeTheArrayElementsEqual.reductionOperations(nums))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(1, 1, 2, 2, 3)
        val expected = 4

        assertEquals(expected, ReductionOperationsToMakeTheArrayElementsEqual.reductionOperations(nums))
    }
}