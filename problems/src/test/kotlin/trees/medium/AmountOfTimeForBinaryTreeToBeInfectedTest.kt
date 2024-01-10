package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AmountOfTimeForBinaryTreeToBeInfectedTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 5, 3, null, 4, 10, 6, 9, 2)
        val start = 3
        val expected = 4

        assertEquals(expected, AmountOfTimeForBinaryTreeToBeInfected.amountOfTime(root, start))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1)
        val start = 1
        val expected = 0

        assertEquals(expected, AmountOfTimeForBinaryTreeToBeInfected.amountOfTime(root, start))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(1, 2, null, 3, null, 4, null, 5)
        val start = 2
        val expected = 3

        assertEquals(expected, AmountOfTimeForBinaryTreeToBeInfected.amountOfTime(root, start))
    }
}