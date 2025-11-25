package hard

import data_structures.NaryTreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EncodeNaryTreeToBinaryTreeTest {
    @Test
    fun test1() {
        val root = NaryTreeBuilder.build(1, null, 3, 2, 4, null, 5, 6)
        val encoded = EncodeNaryTreeToBinaryTree.encode(root)
        val decoded = EncodeNaryTreeToBinaryTree.decode(encoded)

        assertEquals(root, decoded)
    }

    @Test
    fun test2() {
        val root = NaryTreeBuilder.build(1, null, 2, 3, 4, 5, null, null, 6, 7, null, 8, null, 9, 10, null, null, 11, null, 12, null, 13, null, null, 14)
        val encoded = EncodeNaryTreeToBinaryTree.encode(root)
        val decoded = EncodeNaryTreeToBinaryTree.decode(encoded)

        assertEquals(root, decoded)
    }
}