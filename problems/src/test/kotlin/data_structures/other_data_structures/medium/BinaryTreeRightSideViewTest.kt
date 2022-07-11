package data_structures.other_data_structures.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreeRightSideViewTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(listOf(1, 2, 3, null, 5, null, 4))
        val expected = listOf(1, 3, 4)

        assertEquals(expected, BinaryTreeRightSideView.rightSideView(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(listOf(1, null, 3))
        val expected = listOf(1, 3)

        assertEquals(expected, BinaryTreeRightSideView.rightSideView((root)))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(emptyList())
        val expected = emptyList<Int>()

        assertEquals(expected, BinaryTreeRightSideView.rightSideView((root)))
    }
}
