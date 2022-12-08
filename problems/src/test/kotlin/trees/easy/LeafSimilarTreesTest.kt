package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LeafSimilarTreesTest {

    @Test
    fun test1() {
        val root1 = TreeBuilder.build(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4)
        val root2 = TreeBuilder.build(3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8)
        val expected = true

        assertEquals(expected, LeafSimilarTrees.leafSimilar(root1, root2))
    }

    @Test
    fun test2() {
        val root1 = TreeBuilder.build(1, 2, 3)
        val root2 = TreeBuilder.build(1, 3, 2)
        val expected = false

        assertEquals(expected, LeafSimilarTrees.leafSimilar(root1, root2))
    }
}