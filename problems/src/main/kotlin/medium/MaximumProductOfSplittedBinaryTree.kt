package medium

import data_structures.TreeNode

/**
 * Given the root of a binary tree, split the binary tree into two subtrees by removing one edge
 * such that the product of the sums of the subtrees is maximized.
 *
 * Return the maximum product of the sums of the two subtrees. Since the answer may be too large,
 * return it modulo 10^9 + 7.
 *
 * Note that you need to maximize the answer before taking the mod and not after taking it.
 *
 * [URL](https://leetcode.com/problems/maximum-product-of-splitted-binary-tree/)
 */
object MaximumProductOfSplittedBinaryTree {
    private const val MOD = 1_000_000_007L
    private var list = mutableListOf<Long>()

    fun maxProduct(root: TreeNode?): Int {
        list = ArrayList()
        val total = postOrder(root)
        var max = 0L
        for (elem in list) {
            val prod = elem * (total - elem)
            max = maxOf(prod, max)
        }
        return (max % MOD).toInt()
    }

    private fun postOrder(root: TreeNode?): Long {
        if (root == null) {
            return 0
        }
        //fetch the left subtree sum
        val leftChild = postOrder(root.left)
        //fetch the right subtree sum
        val rightChild = postOrder(root.right)
        val curSum = leftChild + rightChild + root.`val`
        //record the current subtree sum
        list.add(curSum)
        return curSum
    }
}
