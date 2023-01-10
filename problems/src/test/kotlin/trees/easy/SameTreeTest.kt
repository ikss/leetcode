package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SameTreeTest {

    @Test
    fun test1() {
        val root1 = TreeBuilder.build(1, 2, 3)
        val root2 = TreeBuilder.build(1, 2, 3)
        val expected = true

        assertEquals(expected, SameTree.isSameTree(root1, root2))
    }

    @Test
    fun test2() {
        val root1 = TreeBuilder.build(1, 2)
        val root2 = TreeBuilder.build(1, null, 2)
        val expected = false

        assertEquals(expected, SameTree.isSameTree(root1, root2))
    }

    @Test
    fun test3() {
        val root1 = TreeBuilder.build(1, 2, 1)
        val root2 = TreeBuilder.build(1, 1, 2)
        val expected = false

        assertEquals(expected, SameTree.isSameTree(root1, root2))
    }
}