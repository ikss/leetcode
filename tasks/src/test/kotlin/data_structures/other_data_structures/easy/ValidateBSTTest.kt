package data_structures.other_data_structures.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertFalse
import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class ValidateBSTTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(listOf(2, 1, 3))

        assertTrue(ValidateBST.isValidBST(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(listOf(1, 1, 1))

        assertFalse(ValidateBST.isValidBST(root))
    }
}
