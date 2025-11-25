package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SumRootToLeafNumbersTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3)
        val expected = 25

        assertEquals(expected, SumRootToLeafNumbers.sumNumbers(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(4, 9, 0, 5, 1)
        val expected = 1026

        assertEquals(expected, SumRootToLeafNumbers.sumNumbers(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(49)
        val expected = 49

        assertEquals(expected, SumRootToLeafNumbers.sumNumbers(root))
    }
}