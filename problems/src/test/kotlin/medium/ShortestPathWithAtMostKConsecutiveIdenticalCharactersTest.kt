package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ShortestPathWithAtMostKConsecutiveIdenticalCharactersTest {
    @Test
    fun test1() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1, 1), intArrayOf(1, 2, 1), intArrayOf(0, 2, 3))
        val labels = "aab"
        val k = 1
        val expected = 3

        assertEquals(expected, ShortestPathWithAtMostKConsecutiveIdenticalCharacters.shortestPath(n, edges, labels, k))
    }

    @Test
    fun test2() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1, 1), intArrayOf(1, 2, 1), intArrayOf(0, 2, 3))
        val labels = "aab"
        val k = 2
        val expected = 2

        assertEquals(expected, ShortestPathWithAtMostKConsecutiveIdenticalCharacters.shortestPath(n, edges, labels, k))
    }

    @Test
    fun test3() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1, 1), intArrayOf(1, 2, 1))
        val labels = "aaa"
        val k = 2
        val expected = -1

        assertEquals(expected, ShortestPathWithAtMostKConsecutiveIdenticalCharacters.shortestPath(n, edges, labels, k))
    }
}