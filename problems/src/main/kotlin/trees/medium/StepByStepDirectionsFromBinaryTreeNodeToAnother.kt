package trees.medium

import data_structures.TreeNode

/**
 * You are given the root of a binary tree with n nodes. Each node is uniquely assigned a value from 1 to n.
 * You are also given an integer startValue representing the value of the start node s,
 * and a different integer destValue representing the value of the destination node t.
 *
 * Find the shortest path starting from node s and ending at node t. Generate step-by-step directions of such path
 * as a string consisting of only the uppercase letters 'L', 'R', and 'U'. Each letter indicates a specific direction:
 * * 'L' means to go from a node to its left child node.
 * * 'R' means to go from a node to its right child node.
 * * 'U' means to go from a node to its parent node.
 *
 * Return the step-by-step directions of the shortest path from node s to node t.
 *
 * [URL](https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/)
 */
object StepByStepDirectionsFromBinaryTreeNodeToAnother {
    fun getDirections(root: TreeNode?, startValue: Int, destValue: Int): String {
        val startPath = StringBuilder()
        val destPath = StringBuilder()

        findPath(root, startValue, startPath)
        findPath(root, destValue, destPath)

        val directions = StringBuilder()
        var commonPathLength = 0

        // Find the length of the common path
        while (
            commonPathLength < startPath.length &&
            commonPathLength < destPath.length &&
            startPath[commonPathLength] == destPath[commonPathLength]
        ) {
            commonPathLength++
        }

        // Add "U" for each step to go up from start to common ancestor
        for (i in 0 until startPath.length - commonPathLength) {
            directions.append('U')
        }

        // Add directions from common ancestor to destination
        for (i in commonPathLength until destPath.length) {
            directions.append(destPath[i])
        }

        return directions.toString()
    }

    private fun findPath(node: TreeNode?, target: Int, path: StringBuilder): Boolean {
        if (node == null) {
            return false
        }

        if (node.`val` == target) {
            return true
        }

        // Try left subtree
        path.append('L')
        if (findPath(node.left, target, path)) {
            return true
        }
        path.deleteCharAt(path.length - 1) // Remove last character

        // Try right subtree
        path.append('R')
        if (findPath(node.right, target, path)) {
            return true
        }
        path.deleteCharAt(path.length - 1) // Remove last character

        return false
    }
}