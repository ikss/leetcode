package medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EvenOddTreeTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 10, 4, 3, null, 7, 9, 12, 8, 6, null, null, 2)!!
        val expected = true

        assertEquals(expected, EvenOddTree.isEvenOddTree(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(5, 4, 2, 3, 3, 7)!!
        val expected = false

        assertEquals(expected, EvenOddTree.isEvenOddTree(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(5, 9, 1, 3, 5, 7)!!
        val expected = false

        assertEquals(expected, EvenOddTree.isEvenOddTree(root))
    }
}