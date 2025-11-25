package hard

import data_structures.TreeNode
import java.util.*

/**
 * Given the root of a binary tree, calculate the vertical order traversal of the binary tree.
 *
 * For each node at position (row, col), its left and right children will be
 * at positions (row + 1, col - 1) and (row + 1, col + 1) respectively. The root of the tree is at (0, 0).
 *
 * The vertical order traversal of a binary tree is a list of top-to-bottom orderings for each column index
 * starting from the leftmost column and ending on the rightmost column. There may be multiple nodes in the same row
 * and same column. In such a case, sort these nodes by their values.
 *
 * Return the vertical order traversal of the binary tree.
 *
 * [URL](https://leetcode.com/problems/reaching-points/)
 */
object VerticalOrderTraversalOfBinaryTree {
    fun verticalTraversal(root: TreeNode?): List<List<Int>> {
        val result = TreeMap<Int, MutableList<Triple<Int, Int, Int>>>()
        traverse(root, 0, 0, result)

        val comparator = Comparator<Triple<Int, Int, Int>> { n1, n2 ->
            var res = n1.first.compareTo(n2.first)
            if (res != 0) return@Comparator res
            res = n1.second.compareTo(n2.second)
            if (res != 0) return@Comparator res
            n1.third.compareTo(n2.third)
        }
        return result.values.map { list -> list.sortedWith(comparator).map { it.third } }
    }

    private fun traverse(
        root: TreeNode?,
        row: Int,
        col: Int,
        result: MutableMap<Int, MutableList<Triple<Int, Int, Int>>>,
    ) {
        if (root == null) return
        result.getOrPut(col) { mutableListOf() }.add(Triple(col, row, root.`val`))

        traverse(root.left, row + 1, col - 1, result)
        traverse(root.right, row + 1, col + 1, result)
    }

}
