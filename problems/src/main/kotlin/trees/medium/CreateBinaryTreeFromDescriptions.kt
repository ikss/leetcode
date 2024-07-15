package trees.medium

import data_structures.TreeNode

/**
 * You are given a 2D integer array descriptions where `descriptions[i] = [parenti, childi, isLefti]` indicates that
 * parenti is the parent of childi in a binary tree of unique values. Furthermore,
 * * If isLefti == 1, then childi is the left child of parenti.
 * * If isLefti == 0, then childi is the right child of parenti.
 *
 * Construct the binary tree described by descriptions and return its root.
 *
 * The test cases will be generated such that the binary tree is valid.
 *
 * [URL](https://leetcode.com/problems/amount-of-time-for-binary-tree-to-be-infected/)
 */
object CreateBinaryTreeFromDescriptions {
    fun createBinaryTree(descriptions: Array<IntArray>): TreeNode? {
        val map = HashMap<Int, TreeNode>()
        val hasParent = HashSet<Int>()

        for ((parent, child, isLeft) in descriptions) {
            val parentNode = map.computeIfAbsent(parent) { TreeNode(parent) }
            val childNode = map.computeIfAbsent(child) { TreeNode(child) }
            hasParent.add(child)
            if (isLeft == 1) {
                parentNode.left = childNode
            } else {
                parentNode.right = childNode
            }
        }
        for ((k, v) in map) {
            if (!hasParent.contains(k)) {
                return v
            }
        }
        return null
    }
}