package strings.medium

import java.util.*

/**
 * A gene string can be represented by an 8-character long string, with choices from 'A', 'C', 'G', and 'T'.
 *
 * Suppose we need to investigate a mutation from a gene string start to a gene string end where one mutation
 * is defined as one single character changed in the gene string.
 *
 * * For example, "AACCGGTT" --> "AACCGGTA" is one mutation.
 * There is also a gene bank _bank_ that records all the valid gene mutations. A gene must be in bank to make it
 * a valid gene string.
 *
 * Given the two gene strings start and end and the gene bank bank, return the minimum number of mutations needed
 * to mutate from start to end. If there is no such a mutation, return -1.
 *
 * Note that the starting point is assumed to be valid, so it might not be included in the bank.
 *
 * [URL](https://leetcode.com/problems/minimum-genetic-mutation/)
 */
object MinimumGeneticMutation {
    fun minMutation(start: String, end: String, bank: Array<String>): Int {
        val queue = LinkedList<String>()
        val seen: MutableSet<String> = HashSet()
        queue.add(start)
        seen.add(start)
        var steps = 0
        while (!queue.isEmpty()) {
            val nodesInQueue: Int = queue.size
            for (j in 0 until nodesInQueue) {
                val node: String = queue.remove()
                if (node == end) {
                    return steps
                }
                for (c in charArrayOf('A', 'C', 'G', 'T')) {
                    for (i in node.indices) {
                        val neighbor = node.substring(0, i) + c + node.substring(i + 1)
                        if (!seen.contains(neighbor) && bank.contains(neighbor)) {
                            queue.add(neighbor)
                            seen.add(neighbor)
                        }
                    }
                }
            }
            steps++
        }
        return -1
    }
}
