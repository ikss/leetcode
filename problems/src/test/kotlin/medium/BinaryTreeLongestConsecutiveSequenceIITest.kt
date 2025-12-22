package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreeLongestConsecutiveSequenceIITest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3)
        val expected = 2

        assertEquals(expected, BinaryTreeLongestConsecutiveSequenceII.longestConsecutive(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(2, 1, 3)
        val expected = 3

        assertEquals(expected, BinaryTreeLongestConsecutiveSequenceII.longestConsecutive(root))
    }
}