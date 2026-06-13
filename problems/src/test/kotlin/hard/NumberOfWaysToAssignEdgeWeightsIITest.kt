package hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class NumberOfWaysToAssignEdgeWeightsIITest {
    @Test
    fun test1() {
        val edges = arrayOf(intArrayOf(1, 2))
        val queries = arrayOf(intArrayOf(1, 1), intArrayOf(1, 2))
        val expected = intArrayOf(0, 1)

        assertArrayEquals(expected, NumberOfWaysToAssignEdgeWeightsII.assignEdgeWeights(edges, queries))
    }

    @Test
    fun test2() {
        val edges = arrayOf(
            intArrayOf(1, 2),
            intArrayOf(1, 3),
            intArrayOf(3, 4),
            intArrayOf(3, 5),
        )
        val queries = arrayOf(
            intArrayOf(1, 4),
            intArrayOf(3, 4),
            intArrayOf(2, 5),
        )
        val expected = intArrayOf(2, 1, 4)

        assertArrayEquals(expected, NumberOfWaysToAssignEdgeWeightsII.assignEdgeWeights(edges, queries))
    }
}