package graphs.hard

import java.util.*

/**
 * You are given a positive integer n representing the number of nodes in an undirected graph.
 * The nodes are labeled from 1 to n.
 *
 * You are also given a 2D integer array edges, where `edges[i] = [ai, bi]` indicates that there is a bidirectional edge
 * between nodes ai and bi. Notice that the given graph may be disconnected.
 *
 * Divide the nodes of the graph into m groups (1-indexed) such that:
 *
 * Each node in the graph belongs to exactly one group.
 * For every pair of nodes in the graph that are connected by an edge `[ai, bi]`, if ai belongs to the group with index x,
 * and bi belongs to the group with index y, then `|y - x| = 1`.
 * Return the maximum number of groups (i.e., maximum m) into which you can divide the nodes.
 * Return -1 if it is impossible to group the nodes with the given conditions.
 *
 * [URL](https://leetcode.com/problems/divide-nodes-into-the-maximum-number-of-groups/)
 */
object DivideNodesIntoTheMaximumNumberOfGroups {
    fun magnificentSets(n: Int, edges: Array<IntArray>): Int {
        val adjList = ArrayList<ArrayList<Int>>(n)
        for (i in 0..<n) {
            adjList.add(ArrayList())
        }
        for ((first, second) in edges) {
            // Transition to 0-index
            adjList[first - 1].add(second - 1)
            adjList[second - 1].add(first - 1)
        }

        val colors = IntArray(n) { -1 }
        for (node in 0..<n) {
            if (colors[node] != -1) continue
            // Start coloring from uncolored nodes
            colors[node] = 0
            // If the graph is not bipartite, return -1
            if (!isBipartite(adjList, node, colors)) return -1
        }

        // Calculate the longest shortest path for each node
        val distances = IntArray(n)
        for (node in 0..<n) {
            distances[node] = getLongestShortestPath(adjList, node, n)
        }

        // Calculate the total maximum number of groups across all components
        var maxNumberOfGroups = 0
        val visited = BooleanArray(n)
        for (node in 0..<n) {
            if (visited[node]) continue
            // Add the number of groups for this component to the total
            maxNumberOfGroups += getNumberOfGroupsForComponent(adjList, node, distances, visited)
        }

        return maxNumberOfGroups
    }

    // Checks if the graph is bipartite starting from the given node
    private fun isBipartite(
        adjList: ArrayList<ArrayList<Int>>,
        node: Int,
        colors: IntArray,
    ): Boolean {
        for (neighbor in adjList[node]) {
            // If a neighbor has the same color as the current node, the graph is not bipartite
            if (colors[neighbor] == colors[node]) return false

            // If the neighbor is already colored, skip it
            if (colors[neighbor] != -1) continue

            // Assign the opposite color to the neighbor
            colors[neighbor] = (colors[node] + 1) % 2

            // Recursively check bipartiteness for the neighbor; return false if it fails
            if (!isBipartite(adjList, neighbor, colors)) return false
        }
        // If all neighbors are properly colored, return true
        return true
    }

    // Computes the longest shortest path (height) in the graph starting from the source node
    private fun getLongestShortestPath(adjList: ArrayList<ArrayList<Int>>, srcNode: Int, n: Int): Int {
        // Initialize a queue for BFS and a visited array
        val nodesQueue: Queue<Int> = LinkedList()
        val visited = BooleanArray(n)

        nodesQueue.add(srcNode)
        visited[srcNode] = true
        var distance = 0

        // Perform BFS layer by layer
        while (!nodesQueue.isEmpty()) {
            // Process all nodes in the current layer
            val numOfNodesInLayer = nodesQueue.size
            for (i in 0..<numOfNodesInLayer) {
                val currentNode = nodesQueue.poll()

                // Visit all unvisited neighbors of the current node
                for (neighbor in adjList[currentNode]) {
                    if (visited[neighbor]) continue
                    visited[neighbor] = true
                    nodesQueue.add(neighbor)
                }
            }
            // Increment the distance for each layer
            distance++
        }
        // Return the total distance (longest shortest path)
        return distance
    }

    // Calculates the maximum number of groups for a connected component
    private fun getNumberOfGroupsForComponent(
        adjList: ArrayList<ArrayList<Int>>,
        node: Int,
        distances: IntArray,
        visited: BooleanArray,
    ): Int {
        // Start with the distance of the current node as the maximum
        var maxNumberOfGroups = distances[node]
        visited[node] = true

        // Recursively calculate the maximum for all unvisited neighbors
        for (neighbor in adjList[node]) {
            if (visited[neighbor]) continue
            maxNumberOfGroups = maxOf(
                maxNumberOfGroups,
                getNumberOfGroupsForComponent(adjList, neighbor, distances, visited),
            )
        }
        return maxNumberOfGroups
    }

}
