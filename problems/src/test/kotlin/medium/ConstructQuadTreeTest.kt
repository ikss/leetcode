package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ConstructQuadTreeTest {

    @Test
    fun test1() {
        val grid = arrayOf(
            intArrayOf(0, 1),
            intArrayOf(1, 0),
        )
        val expected = ConstructQuadTree.Node(`val` = false, isLeaf = false).apply {
            topLeft = ConstructQuadTree.Node(`val` = false, isLeaf = true)
            topRight = ConstructQuadTree.Node(`val` = true, isLeaf = true)
            bottomLeft = ConstructQuadTree.Node(`val` = true, isLeaf = true)
            bottomRight = ConstructQuadTree.Node(`val` = false, isLeaf = true)
        }

        assertEquals(expected, ConstructQuadTree.construct(grid))
    }

    @Test
    fun test2() {
        val grid = arrayOf(
            intArrayOf(1),
        )
        val expected = ConstructQuadTree.Node(`val` = true, isLeaf = true)

        assertEquals(expected, ConstructQuadTree.construct(grid))
    }
}
