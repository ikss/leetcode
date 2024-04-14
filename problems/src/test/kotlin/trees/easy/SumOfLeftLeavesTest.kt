package trees.easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfLeftLeavesTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(3, 9, 20, null, null, 15, 7)
        val expected = 24

        assertEquals(expected, SumOfLeftLeaves.sumOfLeftLeaves(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1)
        val expected = 0

        assertEquals(expected, SumOfLeftLeaves.sumOfLeftLeaves(root))
    }
}