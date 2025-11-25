package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReorderRoutesToMakeAllPathsLeadToTheCityZeroTest {
    @Test
    fun test1() {
        val n = 6
        val connections = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 3),
            intArrayOf(2, 3),
            intArrayOf(4, 0),
            intArrayOf(4, 5),
        )
        val expected = 3

        assertEquals(expected, ReorderRoutesToMakeAllPathsLeadToTheCityZero.minReorder(n, connections))
    }

    @Test
    fun test2() {
        val n = 5
        val connections = arrayOf(
            intArrayOf(1, 0),
            intArrayOf(1, 2),
            intArrayOf(3, 2),
            intArrayOf(3, 4),
        )
        val expected = 2

        assertEquals(expected, ReorderRoutesToMakeAllPathsLeadToTheCityZero.minReorder(n, connections))
    }

    @Test
    fun test3() {
        val n = 5
        val connections = arrayOf(intArrayOf(1, 0), intArrayOf(2, 0))
        val expected = 0

        assertEquals(expected, ReorderRoutesToMakeAllPathsLeadToTheCityZero.minReorder(n, connections))
    }
}