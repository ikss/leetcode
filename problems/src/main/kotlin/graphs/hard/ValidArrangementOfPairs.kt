package graphs.hard

import java.util.*

/**
 * You are given a 0-indexed 2D integer array pairs where `pairs[i] = [starti, endi]`.
 * An arrangement of pairs is valid if for every index i where 1 <= i < pairs.length, we have endi-1 == starti.
 *
 * Return any valid arrangement of pairs.
 *
 * Note: The inputs will be generated such that there exists a valid arrangement of pairs.
 *
 * [URL](https://leetcode.com/problems/valid-arrangement-of-pairs/)
 */
object ValidArrangementOfPairs {

    fun validArrangement(pairs: Array<IntArray>): Array<IntArray> {
        val adjacencyMatrix = HashMap<Int, Deque<Int>>()
        val inDegree = HashMap<Int, Int>()
        val outDegree = HashMap<Int, Int>()

        for ((start, end) in pairs) {
            adjacencyMatrix.computeIfAbsent(start) { ArrayDeque() }.add(end)
            outDegree[start] = outDegree.getOrDefault(start, 0) + 1
            inDegree[end] = inDegree.getOrDefault(end, 0) + 1
        }

        val result = ArrayList<Int>()

        // Find the start node (outDegree == inDegree + 1)
        var startNode = -1
        for (node in outDegree.keys) {
            if (outDegree[node] == inDegree.getOrDefault(node, 0) + 1) {
                startNode = node
                break
            }
        }

        // If no such node exists, start from the first pair's first element
        if (startNode == -1) {
            startNode = pairs[0][0]
        }

        // Start DFS traversal
        visit(startNode, adjacencyMatrix, result)

        // Reverse the result since DFS gives us the path in reverse
        result.reverse()

        // Construct the result pairs
        val pairedResult = Array(result.size - 1) { IntArray(2) }
        for (i in 1..<result.size) {
            pairedResult[i - 1] = intArrayOf(result[i - 1], result[i])
        }

        return pairedResult
    }

    private fun visit(
        node: Int,
        adjMatrix: Map<Int, Deque<Int>>,
        res: ArrayList<Int>,
    ) {
        val neighbors = adjMatrix[node]
        while (!neighbors.isNullOrEmpty()) {
            val nextNode = neighbors.pollFirst()
            visit(nextNode, adjMatrix, res)
        }
        res.add(node)
    }
}