package graphs.medium

import data_structures.GraphNode

/**
 * Given a reference of a node in a connected undirected graph.
 *
 * Return a deep copy (clone) of the graph.
 *
 * Each node in the graph contains a value (int) and a list (`List[GraphNode]`) of its neighbors.
 *
 * [URL](https://leetcode.com/problems/clone-graph/)
 */
object CloneGraph {
    fun cloneGraph(node: GraphNode?): GraphNode? {
        if (node == null) return null

        // use a queue to help BFS
        val q = java.util.ArrayDeque<GraphNode>()
        q.add(node)

        // use a map to save cloned nodes
        val map = hashMapOf<GraphNode?, GraphNode>()

        // clone the root
        map[node] = GraphNode(node.`val`)

        while (!q.isEmpty()) {
            val node = q.poll()

            // handle the neighbors
            for (neighbor in node.neighbors) {
                if (!map.containsKey(neighbor)) {
                    // clone the neighbor
                    map[neighbor] = GraphNode(neighbor.`val`)
                    // add it to the next level
                    q.add(neighbor)
                }

                // copy the neighbor
                map[node]!!.neighbors.add(map[neighbor]!!)
            }
        }

        return map[node]
    }
}
