package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximizeSpanningTreeStabilityWithUpgradesTest {
    @Test
    fun test1() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1, 2, 1), intArrayOf(1, 2, 3, 0))
        val k = 1
        val expected = 2

        assertEquals(expected, MaximizeSpanningTreeStabilityWithUpgrades.maxStability(n, edges, k))
    }

    @Test
    fun test2() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1, 4, 0), intArrayOf(1, 2, 3, 0), intArrayOf(0, 2, 1, 0))
        val k = 2
        val expected = 6

        assertEquals(expected, MaximizeSpanningTreeStabilityWithUpgrades.maxStability(n, edges, k))
    }

    @Test
    fun test3() {
        val n = 3
        val edges = arrayOf(intArrayOf(0, 1, 1, 1), intArrayOf(1, 2, 1, 1), intArrayOf(2, 0, 1, 1))
        val k = 0

        val expected = -1

        assertEquals(expected, MaximizeSpanningTreeStabilityWithUpgrades.maxStability(n, edges, k))
    }

    @Test
    fun test4() {
        val n = 5
        val edges = arrayOf(
            intArrayOf(2, 0, 68643, 1),
            intArrayOf(1, 0, 31681, 1),
            intArrayOf(4, 2, 44760, 1),
            intArrayOf(3, 4, 19034, 1),
            intArrayOf(1, 4, 24247, 0),
        )
        val k = 2

        val expected = 19034

        assertEquals(expected, MaximizeSpanningTreeStabilityWithUpgrades.maxStability(n, edges, k))
    }
}