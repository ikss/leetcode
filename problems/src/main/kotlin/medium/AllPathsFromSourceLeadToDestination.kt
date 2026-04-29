package medium


/**
 * Given the edges of a directed graph where `edges[i] = [ai, bi]` indicates there is an edge between nodes ai and bi,
 * and two nodes source and destination of this graph, determine whether or not all paths starting from source
 * eventually, end at destination, that is:
 * * At least one path exists from the source node to the destination node
 * * If a path exists from the source node to a node with no outgoing edges, then that node is equal to destination.
 * * The number of possible paths from source to destination is a finite number.
 *
 * Return true if and only if all roads from source lead to destination.
 *
 * [URL](https://leetcode.com/problems/all-paths-from-source-lead-to-destination/
 */
object AllPathsFromSourceLeadToDestination {

    private enum class Color {
        GRAY, BLACK, WHITE,
    };

    fun leadsToDestination(n: Int, edges: Array<IntArray>, source: Int, destination: Int): Boolean {
        val graph = buildDigraph(n, edges)

        return leadsToDest(graph, source, destination, Array(n) { Color.WHITE })
    }

    private fun leadsToDest(graph: Array<ArrayList<Int>>, node: Int, dest: Int, states: Array<Color>): Boolean {
        // If the state is GRAY, this is a backward edge and hence, it creates a loop.

        if (states[node] != Color.WHITE) {
            return states[node] == Color.BLACK
        }

        // If this is a leaf node, it should be equal to the destination.
        if (graph[node].isEmpty()) {
            return node == dest
        }

        // Now, we are processing this node. So we mark it as GRAY
        states[node] = Color.GRAY

        for (next in graph[node]) {
            // If we get a `false` from any recursive call on the neighbors, we short circuit and return from there.

            if (!leadsToDest(graph, next, dest, states)) {
                return false
            }
        }

        // Recursive processing done for the node. We mark it BLACK
        states[node] = Color.BLACK
        return true
    }

    private fun buildDigraph(n: Int, edges: Array<IntArray>): Array<ArrayList<Int>> {
        val graph = Array<ArrayList<Int>>(n) { ArrayList() }

        for (edge in edges) {
            graph[edge[0]].add(edge[1])
        }

        return graph
    }
}
