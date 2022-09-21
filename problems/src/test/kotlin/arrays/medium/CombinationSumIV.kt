package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CombinationSumIV {
    @Test
    fun test1() {
        val nums = intArrayOf(1, 2, 3)
        val target = 4
        val expected = 7

        assertEquals(expected, CombinationsSumIV.combinationSum4(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(9)
        val target = 3
        val expected = 0

        assertEquals(expected, CombinationsSumIV.combinationSum4(nums, target))
    }
}
