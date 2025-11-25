package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheClosestMarkedNodeTest {
    @Test
    fun test1() {
        val n = 4
        val edges = listOf(listOf(0, 1, 1), listOf(1, 2, 3), listOf(2, 3, 2), listOf(0, 3, 4))
        val s = 0
        val marked = intArrayOf(2, 3)
        val expected = 4

        assertEquals(expected, FindTheClosestMarkedNode.minimumDistance(n, edges, s, marked))
    }

    @Test
    fun test2() {
        val n = 5
        val edges = listOf(listOf(0, 1, 2), listOf(0, 2, 4), listOf(1, 3, 1), listOf(2, 3, 3), listOf(3, 4, 2))
        val s = 1
        val marked = intArrayOf(0, 4)
        val expected = 3

        assertEquals(expected, FindTheClosestMarkedNode.minimumDistance(n, edges, s, marked))
    }

    @Test
    fun test3() {
        val n = 4
        val edges = listOf(listOf(0, 1, 1), listOf(1, 2, 3), listOf(2, 3, 2))
        val s = 3
        val marked = intArrayOf(0, 1)
        val expected = -1

        assertEquals(expected, FindTheClosestMarkedNode.minimumDistance(n, edges, s, marked))
    }
}