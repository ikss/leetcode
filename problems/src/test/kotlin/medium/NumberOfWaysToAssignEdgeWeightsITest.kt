package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfWaysToAssignEdgeWeightsITest {
    @Test
    fun test1() {
        val edges = arrayOf(intArrayOf(1, 2))
        val expected = 1

        assertEquals(expected, NumberOfWaysToAssignEdgeWeightsI.assignEdgeWeights(edges))
    }

    @Test
    fun test2() {
        val edges = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(3, 4),
            intArrayOf(3, 5),
        )
        val expected = 2

        assertEquals(expected, NumberOfWaysToAssignEdgeWeightsI.assignEdgeWeights(edges))
    }
}