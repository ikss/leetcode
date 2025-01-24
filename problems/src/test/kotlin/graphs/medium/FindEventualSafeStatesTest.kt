package graphs.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindEventualSafeStatesTest {

    @Test
    fun test1() {
        val graph = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(5),
            intArrayOf(0),
            intArrayOf(5),
            intArrayOf(),
            intArrayOf(),
        )
        val expected = listOf(2, 4, 5, 6)

        assertEquals(expected, FindEventualSafeStates.eventualSafeNodes(graph))
    }

    @Test
    fun test2() {
        val graph = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(1, 2),
            intArrayOf(3, 4),
            intArrayOf(0, 4),
            intArrayOf(),
        )
        val expected = listOf(4)

        assertEquals(expected, FindEventualSafeStates.eventualSafeNodes(graph))
    }
}