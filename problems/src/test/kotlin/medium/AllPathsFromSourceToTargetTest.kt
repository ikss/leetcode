package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AllPathsFromSourceToTargetTest {

    @Test
    fun test1() {
        val graph = arrayOf(intArrayOf(1, 2), intArrayOf(3), intArrayOf(3), intArrayOf())
        val expected = listOf(listOf(0, 1, 3), listOf(0, 2, 3))

        assertEquals(expected, AllPathsFromSourceToTarget.allPathsSourceTarget(graph))
    }

    @Test
    fun test2() {
        val graph = arrayOf(intArrayOf(4, 3, 1), intArrayOf(3, 2, 4), intArrayOf(3), intArrayOf(4), intArrayOf())
        val expected = listOf(listOf(0, 4), listOf(0, 3, 4), listOf(0, 1, 3, 4), listOf(0, 1, 2, 3, 4), listOf(0, 1, 4))

        assertEquals(expected, AllPathsFromSourceToTarget.allPathsSourceTarget(graph))
    }
}