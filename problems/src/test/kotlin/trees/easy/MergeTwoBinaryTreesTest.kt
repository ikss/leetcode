package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MergeTwoBinaryTreesTest {

    @Test
    fun test1() {
        val root1 = TreeBuilder.build(1, 3, 2, 5)
        val root2 = TreeBuilder.build(2, 1, 3, null, 4, null, 7)
        val expected = TreeBuilder.build(3, 4, 5, 5, 4, null, 7)

        assertEquals(expected, MergeTwoBinaryTrees.mergeTrees(root1, root2))
    }

    @Test
    fun test2() {
        val root1 = TreeBuilder.build(1)
        val root2 = TreeBuilder.build(1, 2)
        val expected = TreeBuilder.build(2, 2)

        assertEquals(expected, MergeTwoBinaryTrees.mergeTrees(root1, root2))
    }
}
