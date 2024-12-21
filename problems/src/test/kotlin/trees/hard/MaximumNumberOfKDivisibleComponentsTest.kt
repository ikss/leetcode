package trees.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfKDivisibleComponentsTest {
    @Test
    fun test1() {
        val n = 5
        val edges = arrayOf(intArrayOf(0, 2), intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 4))
        val values = intArrayOf(1, 8, 1, 4, 4)
        val k = 6
        val expected = 2

        assertEquals(expected, MaximumNumberOfKDivisibleComponents.maxKDivisibleComponents(n, edges, values, k))
    }

    @Test
    fun test2() {
        val n = 7
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 3),
            intArrayOf(1, 4),
            intArrayOf(2, 5),
            intArrayOf(2, 6),
        )
        val values = intArrayOf(3, 0, 6, 1, 5, 2, 1)
        val k = 3
        val expected = 3

        assertEquals(expected, MaximumNumberOfKDivisibleComponents.maxKDivisibleComponents(n, edges, values, k))
    }
}