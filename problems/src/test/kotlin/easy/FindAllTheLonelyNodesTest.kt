package easy

import data_structures.TreeBuilder
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindAllTheLonelyNodesTest {
    @Test
    fun test1() {
        val root = TreeBuilder.build(1, 2, 3, null, 4)
        val expected = listOf(4)

        assertEquals(expected, FindAllTheLonelyNodes.getLonelyNodes(root))
    }

    @Test
    fun test2() {
        val root = TreeBuilder.build(7, 1, 4, null, 6, 5, 3, null, null, null, null, 2)
        val expected = listOf(6, 2)

        assertEquals(expected, FindAllTheLonelyNodes.getLonelyNodes(root))
    }

    @Test
    fun test3() {
        val root = TreeBuilder.build(11, 99, 88, 77, null, null, 66, 55, null, null, 44, 33, null, null, 22)
        val expected = listOf(77, 66, 55, 44, 33, 22)

        assertEquals(expected, FindAllTheLonelyNodes.getLonelyNodes(root))
    }
}