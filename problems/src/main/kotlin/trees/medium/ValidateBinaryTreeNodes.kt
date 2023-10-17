package trees.medium

/**
 * You have n binary tree nodes numbered from 0 to n - 1 where node i has two children `leftChild[i]` and
 * `rightChild[i]`, return true if and only if all the given nodes form exactly one valid binary tree.
 *
 * If node i has no left child then `leftChild[i]` will equal -1, similarly for the right child.
 *
 * Note that the nodes have no values and that we only use the node numbers in this problem.
 *
 * [URL](https://leetcode.com/problems/validate-binary-tree-nodes/)
 */
object ValidateBinaryTreeNodes {
    fun validateBinaryTreeNodes(n: Int, leftChild: IntArray, rightChild: IntArray): Boolean {
        val root = findRoot(n, leftChild, rightChild)
        val queue = java.util.ArrayDeque<Int>()
        queue.offer(root)
        val visited = HashSet<Int>()

        while (queue.isNotEmpty()) {
            val size = queue.size

            for (i in 0 until size) {
                val next = queue.poll()
                if (next == -1) {
                    continue
                }
                if (!visited.add(next)) {
                    return false
                }
                queue.offer(leftChild[next])
                queue.offer(rightChild[next])
            }

        }

        return visited.size == n
    }

    private fun findRoot(n: Int, left: IntArray, right: IntArray): Int {
        val children = HashSet<Int>()
        for (node in left) {
            children.add(node)
        }
        for (node in right) {
            children.add(node)
        }
        var possibleRoot = -1
        for (i in 0 until n) {
            if (!children.contains(i)) {
                if (possibleRoot != -1) {
                    return -1
                }
                possibleRoot = i
            }
        }
        return possibleRoot
    }
}
