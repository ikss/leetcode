package medium

import java.util.*

/**
 * You are given two 0-indexed strings source and target, both of length n and consisting of lowercase English letters.
 * You are also given two 0-indexed character arrays original and changed, and an integer array cost, where `cost[i]`
 * represents the cost of changing the character `original[i]` to the character `changed[i]`.
 *
 * You start with the string source. In one operation, you can pick a character x from the string
 * and change it to the character y at a cost of z if there exists any index j such that `cost[j] == z`,
 * `original[j] == x`, and `changed[j] == y`.
 *
 * Return the minimum cost to convert the string source to the string target using any number of operations.
 * If it is impossible to convert source to target, return -1.
 *
 * Note that there may exist indices i, j such that `original[j] == original[i]` and `changed[j] == changed[i]`.
 *
 * [URL](https://leetcode.com/problems/minimum-cost-to-convert-string-i/)
 */
object MinimumCostToConvertStringI {

    fun minimumCost(source: String, target: String, original: CharArray, changed: CharArray, cost: IntArray): Long {
        // Create a graph representation of character conversions
        val adjacencyList = Array(26) { ArrayList<Pair<Int, Int>>() }

        // Populate the adjacency list with character conversions
        val conversionCount = original.size
        for (i in 0..<conversionCount) {
            adjacencyList[original[i] - 'a'].add(changed[i] - 'a' to cost[i])
        }

        // Calculate shortest paths for all possible character conversions
        val minConversionCosts = Array(26) { LongArray(26) }
        for (i in 0..25) {
            minConversionCosts[i] = dijkstra(i, adjacencyList)
        }

        // Calculate the total cost of converting source to target
        var totalCost = 0L
        val stringLength = source.length
        for (i in 0..<stringLength) {
            if (source[i] != target[i]) {
                val charConversionCost = minConversionCosts[source[i] - 'a'][target[i] - 'a']
                if (charConversionCost == -1L) {
                    return -1L // Conversion not possible
                }
                totalCost += charConversionCost
            }
        }
        return totalCost
    }

    // Find minimum conversion costs from a starting character to all other characters
    private fun dijkstra(startChar: Int, adjacencyList: Array<ArrayList<Pair<Int, Int>>>): LongArray {
        // Priority queue to store characters with their conversion cost, sorted by cost
        val priorityQueue = PriorityQueue<Pair<Long, Int>>(compareBy { it.first })

        // Initialize the starting character with cost 0
        priorityQueue.add(Pair(0L, startChar))

        // Array to store the minimum conversion cost to each character
        // Initialize all costs to -1 (unreachable)
        val minCosts = LongArray(26) { -1L }

        while (priorityQueue.isNotEmpty()) {
            val currentPair = priorityQueue.poll()
            val (currentCost, currentChar) = currentPair

            if (minCosts[currentChar] != -1L && minCosts[currentChar] < currentCost) continue

            // Explore all possible conversions from the current character
            for (conversion in adjacencyList[currentChar]) {
                val (targetChar, conversionCost) = conversion
                val newTotalCost = currentCost + conversionCost

                // If we found a cheaper conversion, update its cost
                if (minCosts[targetChar] == -1L || newTotalCost < minCosts[targetChar]) {
                    minCosts[targetChar] = newTotalCost
                    // Add the updated conversion to the queue for further exploration
                    priorityQueue.add(Pair(newTotalCost, targetChar))
                }
            }
        }
        // Return the array of minimum conversion costs from the starting character to all others
        return minCosts
    }
}