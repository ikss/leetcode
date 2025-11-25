package hard

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class RecoverTreeFromPreorderTraversalTest {
    @Test
    fun test1() {
        val traversal = "1-2--3--4-5--6--7"
        val expected = TreeBuilder.build(1, 2, 5, 3, 4, 6, 7)

        assertEquals(expected, RecoverTreeFromPreorderTraversal.recoverFromPreorder(traversal))
    }

    @Test
    fun test2() {
        val traversal = "1-2--3---4-5--6---7"
        val expected = TreeBuilder.build(1, 2, 5, 3, null, 6, null, 4, null, 7)

        assertEquals(expected, RecoverTreeFromPreorderTraversal.recoverFromPreorder(traversal))
    }
}