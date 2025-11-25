package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DivideNodesIntoTheMaximumNumberOfGroupsTest {
    @Test
    fun test1() {
        val n = 6
        val edges = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
            intArrayOf(2, 6),
            intArrayOf(2, 3),
            intArrayOf(4, 6),
        )
        val expected = 4

        assertEquals(expected, DivideNodesIntoTheMaximumNumberOfGroups.magnificentSets(n, edges))
    }

    @Test
    fun test2() {
        val n = 3
        val edges = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(2, 3),
            intArrayOf(3, 1),
        )
        val expected = -1

        assertEquals(expected, DivideNodesIntoTheMaximumNumberOfGroups.magnificentSets(n, edges))
    }
}