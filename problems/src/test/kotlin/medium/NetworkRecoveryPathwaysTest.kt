package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NetworkRecoveryPathwaysTest {
    @Test
    fun test1() {
        val edges = arrayOf(
            intArrayOf(0, 1, 5),
            intArrayOf(1, 3, 10),
            intArrayOf(0, 2, 3),
            intArrayOf(2, 3, 4),
        )
        val online = booleanArrayOf(true, true, true, true)
        val k = 10L
        val expected = 3

        assertEquals(expected, NetworkRecoveryPathways.findMaxPathScore(edges, online, k))
    }

    @Test
    fun test2() {
        val edges = arrayOf(
            intArrayOf(0, 1, 7),
            intArrayOf(1, 4, 5),
            intArrayOf(0, 2, 6),
            intArrayOf(2, 3, 6),
            intArrayOf(3, 4, 2),
            intArrayOf(2, 4, 6),
        )
        val online = booleanArrayOf(true, true, true, false, true)
        val k = 12L
        val expected = 6

        assertEquals(expected, NetworkRecoveryPathways.findMaxPathScore(edges, online, k))
    }

}