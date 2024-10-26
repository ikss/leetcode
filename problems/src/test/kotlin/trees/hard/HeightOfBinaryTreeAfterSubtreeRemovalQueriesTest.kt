package trees.hard

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class HeightOfBinaryTreeAfterSubtreeRemovalQueriesTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 3, 4, 2, null, 6, 5, null, null, null, null, null, 7)
        val queries = intArrayOf(4)
        val expected = intArrayOf(2)

        assertArrayEquals(expected, HeightOfBinaryTreeAfterSubtreeRemovalQueries.treeQueries(root, queries))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(5, 8, 9, 2, 1, 3, 7, 4, 6)
        val queries = intArrayOf(3, 2, 4, 8)
        val expected = intArrayOf(3, 2, 3, 2)

        assertArrayEquals(expected, HeightOfBinaryTreeAfterSubtreeRemovalQueries.treeQueries(root, queries))
    }
}