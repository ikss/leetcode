package medium

import java.util.*

/**
 * A company has n employees with a unique ID for each employee from 0 to n - 1. The head of the company is
 * the one with headID.
 *
 * Each employee has one direct manager given in the manager array where `manager[i]` is the direct manager of the i-th
 * employee, `manager[headID] = -1`. Also, it is guaranteed that the subordination relationships have a tree structure.
 *
 * The head of the company wants to inform all the company employees of an urgent piece of news.
 * He will inform his direct subordinates, and they will inform their subordinates,
 * and so on until all employees know about the urgent news.
 *
 * The i-th employee needs `informTime[i]` minutes to inform all of his direct subordinates
 * (i.e., After `informTime[i]` minutes, all his direct subordinates can start spreading the news).
 *
 * Return the number of minutes needed to inform all the employees about the urgent news.
 *
 * [URL](https://leetcode.com/problems/time-needed-to-inform-all-employees/)
 */
object TimeNeededToInformAllEmployees {
    fun numOfMinutes(n: Int, headID: Int, manager: IntArray, informTime: IntArray): Int {
        val graph = HashMap<Int, ArrayList<Int>>()
        for (i in manager.indices) {
            val m = manager[i]
            graph.computeIfAbsent(m) { ArrayList() }.add(i)
        }

        val queue = ArrayDeque<Pair<Int, Int>>()
        queue.offer(headID to 0)

        var result = 0

        while (queue.isNotEmpty()) {
            val size = queue.size

            for (i in 0 until size) {
                val (next, currMax) = queue.poll()
                result = maxOf(result, currMax)
                val time = informTime[next]
                for (n in graph[next] ?: continue) {
                    queue.offer(n to currMax + time)
                }
            }
        }

        return result
    }
}