package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CombinationSumIITest {
    @Test
    fun test1TreeMap() {
        val candidates = intArrayOf(10, 1, 2, 7, 6, 1, 5)
        val target = 8
        val expected = listOf(
            listOf(1, 1, 6),
            listOf(1, 2, 5),
            listOf(1, 7),
            listOf(2, 6)
        )

        assertEquals(expected, CombinationSumII.combinationSum2TreeMap(candidates, target))
    }

    @Test
    fun test2TreeMap() {
        val candidates = intArrayOf(2, 5, 2, 1, 2)
        val target = 5
        val expected = listOf(
            listOf(1, 2, 2),
            listOf(5)
        )

        assertEquals(expected, CombinationSumII.combinationSum2TreeMap(candidates, target))
    }

    @Test
    fun test1ArrayList() {
        val candidates = intArrayOf(10, 1, 2, 7, 6, 1, 5)
        val target = 8
        val expected = listOf(
            listOf(1, 1, 6),
            listOf(1, 2, 5),
            listOf(1, 7),
            listOf(2, 6)
        )

        assertEquals(expected, CombinationSumII.combinationSum2ArrayList(candidates, target))
    }

    @Test
    fun test2ArrayList() {
        val candidates = intArrayOf(2, 5, 2, 1, 2)
        val target = 5
        val expected = listOf(
            listOf(1, 2, 2),
            listOf(5)
        )

        assertEquals(expected, CombinationSumII.combinationSum2ArrayList(candidates, target))
    }
}