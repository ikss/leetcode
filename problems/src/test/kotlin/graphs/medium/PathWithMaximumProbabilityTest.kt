package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PathWithMaximumProbabilityTest {
    @Test
    fun test1() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2))
        val succProb = doubleArrayOf(0.5, 0.5, 0.2)
        val start = 0
        val end = 2
        val expected = 0.25000

        assertEquals(expected, PathWithMaximumProbability.maxProbability(n, edges, succProb, start, end), 0.00001)
    }

    @Test
    fun test2() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(0, 2))
        val succProb = doubleArrayOf(0.5, 0.5, 0.3)
        val start = 0
        val end = 2
        val expected = 0.30000

        assertEquals(expected, PathWithMaximumProbability.maxProbability(n, edges, succProb, start, end), 0.00001)
    }

    @Test
    fun test3() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1))
        val succProb = doubleArrayOf(0.5)
        val start = 0
        val end = 2
        val expected = 0.00000

        assertEquals(expected, PathWithMaximumProbability.maxProbability(n, edges, succProb, start, end), 0.00001)
    }
}