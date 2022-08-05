package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CombinationSumIV {
    @Test
    fun test1() {
        val nums = intArrayOf(1,2,3)
        val target = 4
        val expected = 7

        assertEquals(expected, CombinationsSumIV.combinationSum4(nums, target))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(3)
        val target = 9
        val expected = 3

        assertEquals(expected, CombinationsSumIV.combinationSum4(nums, target))
    }
}
