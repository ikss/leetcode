package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FlipEquivalentBinaryTreesTest {
    @Test
    fun test1() {
        val root1 = TreeBuilder.build(1, 2, 3, 4, 5, 6, null, null, null, 7, 8)
        val root2 = TreeBuilder.build(1, 3, 2, null, 6, 4, 5, null, null, null, null, 8, 7)
        val expected = true

        assertEquals(expected, FlipEquivalentBinaryTrees.flipEquiv(root1, root2))
    }

    @Test
    fun test2() {
        val root1 = TreeBuilder.build()
        val root2 = TreeBuilder.build()
        val expected = true

        assertEquals(expected, FlipEquivalentBinaryTrees.flipEquiv(root1, root2))
    }

    @Test
    fun test3() {
        val root1 = TreeBuilder.build()
        val root2 = TreeBuilder.build(1)
        val expected = false

        assertEquals(expected, FlipEquivalentBinaryTrees.flipEquiv(root1, root2))
    }
}