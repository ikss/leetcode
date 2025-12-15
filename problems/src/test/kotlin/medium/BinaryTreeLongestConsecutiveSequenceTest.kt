package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BinaryTreeLongestConsecutiveSequenceTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, null, 3, 2, 4, null, null, null, 5)
        val expected = 3

        assertEquals(expected, BinaryTreeLongestConsecutiveSequence.longestConsecutive(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(2, null, 3, 2, null, 1)
        val expected = 2

        assertEquals(expected, BinaryTreeLongestConsecutiveSequence.longestConsecutive(root))
    }
}