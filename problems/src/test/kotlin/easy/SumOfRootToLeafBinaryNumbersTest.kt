package easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumOfRootToLeafBinaryNumbersTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 0, 1, 0, 1, 0, 1)
        val expected = 22

        assertEquals(expected, SumOfRootToLeafBinaryNumbers.sumRootToLeaf(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(0)
        val expected = 0

        assertEquals(expected, SumOfRootToLeafBinaryNumbers.sumRootToLeaf(root))
    }
}