package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, return all duplicate subtrees.
 *
 * For each kind of duplicate subtrees, you only need to return the root node of any one of them.
 *
 * Two trees are duplicate if they have the same structure with the same node values.
 *
 * [URL](https://leetcode.com/problems/find-duplicate-subtrees/)
 */
object FindDuplicateSubtrees {
    fun findDuplicateSubtrees(root: TreeNode?): List<TreeNode> {
        val res = ArrayList<TreeNode>()
        traverse(root, HashMap(), HashMap(), res)
        return res
    }

    private fun traverse(
        node: TreeNode?,
        tripletToID: MutableMap<String, Int>,
        cnt: MutableMap<Int, Int>,
        res: MutableList<TreeNode>,
    ): Int {
        if (node == null) {
            return 0
        }
        val triplet = traverse(node.left, tripletToID, cnt, res).toString() + "," + node.`val` +
                ',' + traverse(node.right, tripletToID, cnt, res)
        if (!tripletToID.containsKey(triplet)) {
            tripletToID[triplet] = tripletToID.size + 1
        }
        val id = tripletToID[triplet]!!
        cnt[id] = cnt.getOrDefault(id, 0) + 1
        if (cnt[id] == 2) {
            res.add(node)
        }
        return id
    }
}
