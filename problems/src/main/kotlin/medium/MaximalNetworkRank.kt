package medium

/**
 * There is an infrastructure of n cities with some number of roads connecting these cities. Each `roads[i] = [ai, bi]`
 * indicates that there is a bidirectional road between cities ai and bi.
 *
 * The network rank of two different cities is defined as the total number of directly connected roads to either city.
 * If a road is directly connected to both cities, it is only counted once.
 *
 * The maximal network rank of the infrastructure is the maximum network rank of all pairs of different cities.
 *
 * Given the integer n and the array roads, return the maximal network rank of the entire infrastructure.
 *
 * [URL](https://leetcode.com/problems/maximal-network-rank/)
 */
object MaximalNetworkRank {
    fun maximalNetworkRank(n: Int, roads: Array<IntArray>): Int {
        var result = 0
        val adj: MutableMap<Int, MutableSet<Int>> = HashMap()
        // Construct adjacency list 'adj', where adj[node] stores all nodes connected to 'node'.
        for ((city1, city2) in roads) {
            adj.computeIfAbsent(city1) { HashSet() }.add(city2)
            adj.computeIfAbsent(city2) { HashSet() }.add(city1)
        }

        // Iterate on each possible pair of nodes.
        for (node1 in 0 until n) {
            for (node2 in node1 + 1 until n) {
                var currentRank = (adj[node1]?.size ?: 0) + (adj[node2]?.size ?: 0)

                // Find the current pair's respective network rank and store if it's maximum till now.
                if (adj[node1]?.contains(node2) == true) {
                    --currentRank
                }
                result = maxOf(result, currentRank)
            }
        }
        // Return the maximum network rank.
        return result
    }
}