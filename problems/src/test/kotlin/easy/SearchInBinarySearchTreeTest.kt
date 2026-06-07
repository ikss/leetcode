package easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SearchInBinarySearchTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(4, 2, 7, 1, 3)
        val expected = TreeBuilder.build(2, 1, 3)

        assertEquals(expected, SearchInBinarySearchTree.searchBST(root, 2))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(4, 2, 7, 1, 3)

        assertEquals(null, SearchInBinarySearchTree.searchBST(root, 5))
    }
}
