package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TwoSumIVInputIsBSTTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(5, 3, 6, 2, 4, null, 7)
        val k = 9
        val expected = true

        assertEquals(expected, TwoSumIVInputIsBST.findTarget(root, k))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(5, 3, 6, 2, 4, null, 7)
        val k = 28
        val expected = false

        assertEquals(expected, TwoSumIVInputIsBST.findTarget(root, k))
    }
}