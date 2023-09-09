package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CombinationSumTestIV {
    @Test
    fun test1dp() {
        val nums = intArrayOf(1, 2, 3)
        val target = 4
        val expected = 7

        assertEquals(expected, CombinationsSumIV.combinationSum4dp(nums, target))
    }

    @Test
    fun test2dp() {
        val nums = intArrayOf(9)
        val target = 3
        val expected = 0

        assertEquals(expected, CombinationsSumIV.combinationSum4dp(nums, target))
    }

    @Test
    fun test1backtrack() {
        val nums = intArrayOf(1, 2, 3)
        val target = 4
        val expected = 7

        assertEquals(expected, CombinationsSumIV.combinationSum4recursive(nums, target))
    }

    @Test
    fun test2backtrack() {
        val nums = intArrayOf(9)
        val target = 3
        val expected = 0

        assertEquals(expected, CombinationsSumIV.combinationSum4recursive(nums, target))
    }
}
