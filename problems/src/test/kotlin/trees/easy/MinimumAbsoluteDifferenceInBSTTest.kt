package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MinimumAbsoluteDifferenceInBSTTest {

    @Test
    fun test1() {
        val root = TreeBuilder.build(4, 2, 6, 1, 3)
        val expected = 1

        assertEquals(expected, MinimumAbsoluteDifferenceInBST.getMinimumDifference(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 0, 48, null, null, 12, 49)
        val expected = 1

        assertEquals(expected, MinimumAbsoluteDifferenceInBST.getMinimumDifference(root))
    }
}