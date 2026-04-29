package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AllPathsFromSourceLeadToDestinationTest {
    @Test
    fun test1() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2))
        val source = 0
        val destination = 2
        val expected = false

        assertEquals(expected, AllPathsFromSourceLeadToDestination.leadsToDestination(n, edges, source, destination))
    }

    @Test
    fun test2() {
        val n = 4
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 3), intArrayOf(1, 2), intArrayOf(2, 1))
        val source = 0
        val destination = 3
        val expected = false

        assertEquals(expected, AllPathsFromSourceLeadToDestination.leadsToDestination(n, edges, source, destination))
    }

    @Test
    fun test3() {
        val n = 4
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 3), intArrayOf(2, 3))
        val source = 0
        val destination = 3
        val expected = true

        assertEquals(expected, AllPathsFromSourceLeadToDestination.leadsToDestination(n, edges, source, destination))
    }

    @Test
    fun test4() {
        val n = 2
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 1))
        val source = 0
        val destination = 1
        val expected = false

        assertEquals(expected, AllPathsFromSourceLeadToDestination.leadsToDestination(n, edges, source, destination))
    }
}