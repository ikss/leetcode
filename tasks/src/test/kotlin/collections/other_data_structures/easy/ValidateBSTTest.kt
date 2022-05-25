package collections.other_data_structures.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Test
import kotlin.test.assertFalse
import kotlin.test.assertTrue

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
