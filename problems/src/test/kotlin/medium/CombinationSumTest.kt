package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CombinationSumTest {
    @Test
    fun test1() {
        val candidates = intArrayOf(2, 3, 6, 7)
        val target = 7
        val expected = listOf(listOf(2, 2, 3), listOf(7))

        assertEquals(expected, CombinationSum.combinationSum(candidates, target))
    }

    @Test
    fun test2() {
        val candidates = intArrayOf(2, 3, 5)
        val target = 8
        val expected = listOf(listOf(2, 2, 2, 2), listOf(2, 3, 3), listOf(3, 5))

        assertEquals(expected, CombinationSum.combinationSum(candidates, target))
    }

    @Test
    fun test3() {
        val candidates = intArrayOf(2)
        val target = 1
        val expected = emptyList<Any>()

        assertEquals(expected, CombinationSum.combinationSum(candidates, target))
    }
}