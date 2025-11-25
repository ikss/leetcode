package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DotProductOfTwoSparseVectorsTest {
    @Test
    fun test1() {
        val v1 = DotProductOfTwoSparseVectors.SparseVector(intArrayOf(1, 0, 0, 2, 3))
        val v2 = DotProductOfTwoSparseVectors.SparseVector(intArrayOf(0, 3, 0, 4, 0))
        val expected = 8

        assertEquals(expected, v1.dotProduct(v2))
    }

    @Test
    fun test2() {
        val v1 = DotProductOfTwoSparseVectors.SparseVector(intArrayOf(0, 0, 3, 0, 0, 0, 1, 0, 0, 3, 0, 0, 0, 5))
        val v2 = DotProductOfTwoSparseVectors.SparseVector(intArrayOf(0, 5, 0, 2, 5, 4, 0, 0, 0, 0, 3, 0, 0, 0))
        val expected = 0

        assertEquals(expected, v1.dotProduct(v2))
    }
}