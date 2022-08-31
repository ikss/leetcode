package data_structures.other_data_structures.medium

/**
 * Given a n * n matrix grid of 0's and 1's only. We want to represent the grid with a Quad-Tree.
 *
 * Return the root of the Quad-Tree representing the grid.
 *
 * Notice that you can assign the value of a node to True or False when isLeaf is False,
 * and both are accepted in the answer.
 *
 * [URL](https://leetcode.com/problems/construct-quad-tree/)
 */
object ConstructQuadTree {
    data class Node(var `val`: Boolean, var isLeaf: Boolean) {
        var topLeft: Node? = null
        var topRight: Node? = null
        var bottomLeft: Node? = null
        var bottomRight: Node? = null
    }

    fun construct(grid: Array<IntArray>): Node {
        val n = grid.size
        if (n == 1) {
            return Node(grid[0][0] == 1, true)
        }

        return divide(grid, 0, 0, n)
    }

    private fun divide(grid: Array<IntArray>, starti: Int, startj: Int, size: Int): Node {
        val value = grid[starti][startj]
        var isLeaf = true
        loop@ for (i in starti until starti + size) {
            for (j in startj until startj + size) {
                if (grid[i][j] != value) {
                    isLeaf = false
                    break@loop
                }
            }
        }
        val center = Node(value == 1, isLeaf)
        if (!isLeaf) {
            val halfSize = size / 2
            center.topLeft = divide(grid, starti, startj, halfSize)
            center.topRight = divide(grid, starti, startj + halfSize, halfSize)
            center.bottomLeft = divide(grid, starti + halfSize, startj, halfSize)
            center.bottomRight = divide(grid, starti + halfSize, startj + halfSize, halfSize)
        }
        return center
    }
}
