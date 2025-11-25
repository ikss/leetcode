package medium

/**
 * Given two nodes of a binary tree p and q, return their lowest common ancestor (LCA).
 *
 * Each node will have a reference to its parent node. The definition for Node is below:
 *
 * class Node {
 *     public int val;
 *     public Node left;
 *     public Node right;
 *     public Node parent;
 * }
 *
 * According to the definition of LCA on Wikipedia: "The lowest common ancestor of two nodes p and q in a tree T is
 * the lowest node that has both p and q as descendants (where we allow a node to be a descendant of itself)."
 *
 * [URL](https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree-iii/)
 */
object LowestCommonAncestorOfBinaryTreeIII {
    data class Node(
        val `val`: Int,
        var left: Node? = null,
        var right: Node? = null,
        var parent: Node? = null,
    )

    fun lowestCommonAncestor(p: Node?, q: Node?): Node? {
        if (p == null || q == null) return null

        val parents = getParents(p)

        var node = q
        while (node !in parents) {
            node = node!!.parent!!
        }

        return node
    }

    private fun getParents(node: Node): Set<Node> {
        val result = HashSet<Node>()
        result.add(node)

        var node = node
        while (node.parent != null) {
            result.add(node.parent!!)
            node = node.parent!!
        }

        return result
    }
}