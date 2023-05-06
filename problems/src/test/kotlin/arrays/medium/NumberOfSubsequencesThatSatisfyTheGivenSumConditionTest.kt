package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfSubsequencesThatSatisfyTheGivenSumConditionTest {
    @Test
    fun test1() {
        val nums = intArrayOf(3, 5, 6, 7)
        val target = 9
        val expected = 4

        assertEquals(expected, NumberOfSubsequencesThatSatisfyTheGivenSumCondition.numSubseq(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3, 3, 6, 8)
        val target = 10
        val expected = 6

        assertEquals(expected, NumberOfSubsequencesThatSatisfyTheGivenSumCondition.numSubseq(nums, target))
    }

    @Test
    fun test3() {
        val nums = intArrayOf(2, 3, 3, 4, 6, 7)
        val target = 12
        val expected = 61

        assertEquals(expected, NumberOfSubsequencesThatSatisfyTheGivenSumCondition.numSubseq(nums, target))
    }
}