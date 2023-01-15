package trees.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfGoodPathsTest {

    @Test
    fun test1() {
        val vals = intArrayOf(1, 3, 2, 1, 3)
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(2, 3), intArrayOf(2, 4))
        val expected = 6

        assertEquals(expected, NumberOfGoodPaths.numberOfGoodPaths(vals, edges))
    }

    @Test
    fun test2() {
        val vals = intArrayOf(1, 1, 2, 2, 3)
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(1, 2), intArrayOf(2, 3), intArrayOf(2, 4))
        val expected = 7

        assertEquals(expected, NumberOfGoodPaths.numberOfGoodPaths(vals, edges))
    }

    @Test
    fun test3() {
        val vals = intArrayOf(1)
        val edges = arrayOf<IntArray>()
        val expected = 1

        assertEquals(expected, NumberOfGoodPaths.numberOfGoodPaths(vals, edges))
    }
}