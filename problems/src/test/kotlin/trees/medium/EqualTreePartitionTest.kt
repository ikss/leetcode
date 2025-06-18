package trees.medium

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EqualTreePartitionTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(5, 10, 10, null, null, 2, 3)
        val expected = true

        assertEquals(expected, EqualTreePartition.checkEqualTree(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(1, 2, 10, null, null, 2, 20)
        val expected = false

        assertEquals(expected, EqualTreePartition.checkEqualTree(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(0, -1, 1)
        val expected = false

        assertEquals(expected, EqualTreePartition.checkEqualTree(root))
    }

    @Test
    fun test4() {
        val root = TreeBuilder.build(1, -1)
        val expected = false

        assertEquals(expected, EqualTreePartition.checkEqualTree(root))
    }

}