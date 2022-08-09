package data_structures.other_data_structures.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreeWithFactorsTest {

    @Test
    fun test1() {
        val arr = intArrayOf(2, 4)
        val expected = 3

        assertEquals(expected, BinaryTreeWithFactors.numFactoredBinaryTrees(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(2, 4, 5, 10)
        val expected = 7

        assertEquals(expected, BinaryTreeWithFactors.numFactoredBinaryTrees(arr))
    }
}
