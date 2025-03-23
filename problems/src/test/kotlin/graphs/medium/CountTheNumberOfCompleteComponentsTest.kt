package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountTheNumberOfCompleteComponentsTest {
    @Test
    fun test1() {
        val n = 6
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 2), intArrayOf(3, 4))
        val expected = 3

        assertEquals(expected, CountTheNumberOfCompleteComponents.countCompleteComponents(n, edges))
    }

    @Test
    fun test2() {
        val n = 6
        val edges = arrayOf(intArrayOf(0, 1), intArrayOf(0, 2), intArrayOf(1, 2), intArrayOf(3, 4), intArrayOf(3, 5))
        val expected = 1

        assertEquals(expected, CountTheNumberOfCompleteComponents.countCompleteComponents(n, edges))
    }
}