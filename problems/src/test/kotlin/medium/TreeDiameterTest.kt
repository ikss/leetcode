package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TreeDiameterTest {
    @Test
    fun test1() {
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2))
        val expected = 2

        assertEquals(expected, TreeDiameter.treeDiameterDfs(edges))
    }

    @Test
    fun test2() {
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(1, 4), intArrayOf(4, 5))
        val expected = 4

        assertEquals(expected, TreeDiameter.treeDiameterDfs(edges))
    }
}