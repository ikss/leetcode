package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TwoSumBSTsTest {
    @Test
    fun test1() {
        val root1 = TreeBuilder.build(2, 1, 4)
        val root2 = TreeBuilder.build(1, 0, 3)
        val target = 5
        val expected = true

        assertEquals(expected, TwoSumBSTs.twoSumBSTs(root1, root2, target))
    }

    @Test
    fun test2() {
        val root1 = TreeBuilder.build(0, -10, 10)
        val root2 = TreeBuilder.build(5, 1, 7, 0, 2)
        val target = 18
        val expected = false

        assertEquals(expected, TwoSumBSTs.twoSumBSTs(root1, root2, target))
    }
}