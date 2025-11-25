package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddOneRowToTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(4, 2, 6, 3, 1, 5)
        val `val` = 1
        val depth = 2
        val expected = TreeBuilder.build(4, 1, 1, 2, null, null, 6, 3, 1, 5)

        assertEquals(expected, AddOneRowToTree.addOneRow(root, `val`, depth))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(4, 2, null, 3, 1)
        val `val` = 1
        val depth = 3
        val expected = TreeBuilder.build(4, 2, null, 1, 1, 3, null, null, 1)

        assertEquals(expected, AddOneRowToTree.addOneRow(root, `val`, depth))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(4)
        val `val` = 1
        val depth = 1
        val expected = TreeBuilder.build(1, 4)

        assertEquals(expected, AddOneRowToTree.addOneRow(root, `val`, depth))
    }
}