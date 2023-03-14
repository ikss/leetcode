package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SymmetricTreeTest {

    @Test
    fun test1queue() {
        val root = TreeBuilder.build(1, 2, 2, 3, 4, 4, 3)

        assertTrue(SymmetricTree.isSymmetricQueue(root))
    }

    @Test
    fun test2queue() {
        val root = TreeBuilder.build(1, 2, 2, null, 3, null, 3)

        assertFalse(SymmetricTree.isSymmetricQueue(root))
    }

    @Test
    fun test1recursive() {
        val root = TreeBuilder.build(1, 2, 2, 3, 4, 4, 3)

        assertTrue(SymmetricTree.isSymmetricRecursive(root))
    }

    @Test
    fun test2recursive() {
        val root = TreeBuilder.build(1, 2, 2, null, 3, null, 3)

        assertFalse(SymmetricTree.isSymmetricRecursive(root))
    }
}
