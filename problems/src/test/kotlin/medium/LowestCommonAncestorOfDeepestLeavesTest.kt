package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class LowestCommonAncestorOfDeepestLeavesTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4)
        val expected = TreeBuilder.build(2, 7, 4)

        assertEquals(expected, LowestCommonAncestorOfDeepestLeaves.lcaDeepestLeaves(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1)
        val expected = TreeBuilder.build(1)

        assertEquals(expected, LowestCommonAncestorOfDeepestLeaves.lcaDeepestLeaves(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(0, 1, 3, null, 2)
        val expected = TreeBuilder.build(2)

        assertEquals(expected, LowestCommonAncestorOfDeepestLeaves.lcaDeepestLeaves(root))
    }
}
