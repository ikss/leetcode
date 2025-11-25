package hard

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreeMaximumPathSumTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3)
        val expected = 6

        assertEquals(expected, BinaryTreeMaximumPathSum.maxPathSum(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(-10, 9, 20, null, null, 15, 7)
        val expected = 42

        assertEquals(expected, BinaryTreeMaximumPathSum.maxPathSum(root))
    }
}