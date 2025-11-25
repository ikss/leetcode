package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CousinsInBinaryTreeIITest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(5, 4, 9, 1, 10, null, 7)
        val expected = TreeBuilder.build(0, 0, 0, 7, 7, null, 11)

        assertEquals(expected, CousinsInBinaryTreeII.replaceValueInTree(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(3, 1, 2)
        val expected = TreeBuilder.build(0, 0, 0)

        assertEquals(expected, CousinsInBinaryTreeII.replaceValueInTree(root))
    }
}