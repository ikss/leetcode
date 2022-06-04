package collections.other_data_structures.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class SymmetricTreeTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(listOf(1, 2, 2, 3, 4, 4, 3))

        assertTrue(SymmetricTree.isSymmetric(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(listOf(1, 2, 2, null, 3, null, 3))

        assertFalse(SymmetricTree.isSymmetric(root))
    }
}
