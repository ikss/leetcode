package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class SplitBSTTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(4, 2, 6, 1, 3, 5, 7)
        val target = 2
        val expected = arrayOf(
            TreeBuilder.build(2, 1),
            TreeBuilder.build(4, 3, 6, null, null, 5, 7),
        )

        assertArrayEquals(expected, SplitBST.splitBST(root, target))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1)
        val target = 2
        val expected = arrayOf(
            TreeBuilder.build(1),
            TreeBuilder.build(),
        )

        assertArrayEquals(expected, SplitBST.splitBST(root, target))
    }
}