package trees.medium

import org.junit.jupiter.api.Assertions.assertTrue
import org.junit.jupiter.api.Test

class NumberOfNodesInTheSubTreeWithTheSameLabelTest {

    @Test
    fun test1() {
        val n = 7
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 4),
            intArrayOf(1, 5),
            intArrayOf(2, 3),
            intArrayOf(2, 6),
        )
        val labels = "abaedcd"
        val expected = intArrayOf(2, 1, 1, 1, 1, 1, 1)

        assertTrue(expected.contentEquals(NumberOfNodesInTheSubTreeWithTheSameLabel.countSubTrees(n, edges, labels)))
    }

    @Test
    fun test2() {
        val n = 4
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 2),
            intArrayOf(0, 3),
        )
        val labels = "bbbb"
        val expected = intArrayOf(4, 2, 1, 1)

        assertTrue(expected.contentEquals(NumberOfNodesInTheSubTreeWithTheSameLabel.countSubTrees(n, edges, labels)))
    }

    @Test
    fun test3() {
        val n = 5
        val edges = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(0, 2),
            intArrayOf(1, 3),
            intArrayOf(0, 4),
        )
        val labels = "aabab"
        val expected = intArrayOf(3, 2, 1, 1, 1)

        assertTrue(expected.contentEquals(NumberOfNodesInTheSubTreeWithTheSameLabel.countSubTrees(n, edges, labels)))
    }
}