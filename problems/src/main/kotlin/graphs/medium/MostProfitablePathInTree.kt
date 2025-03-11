package graphs.medium

import java.util.*

/**
 * There is an undirected tree with n nodes labeled from 0 to n - 1, rooted at node 0. You are given a 2D integer array
 * edges of length n - 1 where `edges[i] = [ai, bi]` indicates that there is an edge between nodes ai and bi in the tree.
 *
 * At every node i, there is a gate. You are also given an array of even integers amount, where `amount[i]` represents:
 * * the price needed to open the gate at node i, if `amount[i]` is negative, or,
 * * the cash reward obtained on opening the gate at node i, otherwise.
 *
 * The game goes on as follows:
 * * Initially, Alice is at node 0 and Bob is at node bob.
 * * At every second, Alice and Bob each move to an adjacent node. Alice moves towards some leaf node,
 * while Bob moves towards node 0.
 * * For every node along their path, Alice and Bob either spend money to open the gate at that node,
 * or accept the reward. Note that:
 * * If the gate is already open, no price will be required, nor will there be any cash reward.
 * * If Alice and Bob reach the node simultaneously, they share the price/reward for opening the gate there.
 * In other words, if the price to open the gate is c, then both Alice and Bob pay c / 2 each. Similarly,
 * if the reward at the gate is c, both of them receive c / 2 each.
 * * If Alice reaches a leaf node, she stops moving. Similarly, if Bob reaches node 0, he stops moving.
 *
 * Note that these events are independent of each other.
 *
 * Return the maximum net income Alice can have if she travels towards the optimal leaf node.
 *
 * [URL](https://leetcode.com/problems/most-profitable-path-in-a-tree/)
 */
object MostProfitablePathInTree {

    fun mostProfitablePath(edges: Array<IntArray>, bob: Int, amount: IntArray): Int {
        val n = amount.size
        tree = ArrayList()
        maxIncome = Int.MIN_VALUE
        val visited = BooleanArray(n)
        for (i in 0..<n) {
            tree.add(ArrayList())
        }

        // Form tree with edges
        for (edge in edges) {
            tree.get(edge[0]).add(edge[1])
            tree.get(edge[1]).add(edge[0])
        }

        // Find the path taken by Bob to reach node 0 and the times it takes to get there

        var bobPath = getBobMoves(tree, bob)
        // Find Alice's optimal path
        Arrays.fill(visited, false)
        findAlicePath(0, 0, 0, amount, visited, bobPath)

        return maxIncome
    }

    private var tree: ArrayList<ArrayList<Int>> = ArrayList()
    private var maxIncome = Int.MIN_VALUE


    // Depth First Search to find Alice's optimal path
    private fun findAlicePath(
        sourceNode: Int,
        time: Int,
        income: Int,
        amount: IntArray,
        visited: BooleanArray,
        bobPath: HashMap<Int, Int>,
    ) {
        // Mark node as explored
        var income = income
        visited[sourceNode] = true

        // Alice reaches the node first
        if (!bobPath!!.containsKey(sourceNode) || time < bobPath!![sourceNode]!!
        ) {
            income += amount[sourceNode]
        } else if (time == bobPath!![sourceNode]) {
            income += amount[sourceNode] / 2
        }

        // Update max value if current node is a new leaf
        if (tree!![sourceNode].size == 1 && sourceNode != 0) {
            maxIncome = maxOf(maxIncome, income)
        }

        // Traverse through unvisited nodes
        for (adjacentNode in tree!![sourceNode]) {
            if (!visited[adjacentNode]) {
                findAlicePath(adjacentNode, time + 1, income, amount, visited, bobPath)
            }
        }
    }

    private fun getBobMoves(graph: ArrayList<ArrayList<Int>>, bob: Int): HashMap<Int, Int> {
        var time = 0
        val moves = hashMapOf(bob to time)
        var curr = bob
        while (curr != 0) {
            val next = graph[curr].first()
            moves[next] = ++time
            curr = next
        }

        return moves
    }

}
