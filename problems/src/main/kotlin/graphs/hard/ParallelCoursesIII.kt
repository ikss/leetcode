package graphs.hard

import java.util.*
import kotlin.math.max

/**
 * ou are given an integer n, which indicates that there are n courses labeled from 1 to n. You are also given a
 * 2D integer array relations where `relations[j] = [prevCoursej, nextCoursej]` denotes that course prevCoursej has to
 * be completed before course nextCoursej (prerequisite relationship). Furthermore, you are given a 0-indexed integer
 * array time where `time[i]` denotes how many months it takes to complete the (i+1)th course.
 *
 * You must find the minimum number of months needed to complete all the courses following these rules:
 *
 * You may start taking a course at any time if the prerequisites are met.
 * Any number of courses can be taken at the same time.
 * Return the minimum number of months needed to complete all the courses.
 *
 * Note: The test cases are generated such that it is possible to complete every course (i.e., the graph is a directed acyclic graph).
 *
 * [URL](https://leetcode.com/problems/parallel-courses-iii/)
 */
object ParallelCoursesIII {
    fun minimumTimeKahn(n: Int, relations: Array<IntArray>, time: IntArray): Int {
        val graphDirect = HashMap<Int, HashSet<Int>>()
        val graphIndirect = HashMap<Int, HashSet<Int>>()

        for ((before, after) in relations) {
            graphDirect.computeIfAbsent(before) { HashSet() }.add(after)
            graphIndirect.computeIfAbsent(after) { HashSet() }.add(before)
        }

        var result = 0

        val queue = PriorityQueue<Pair<Int, Int>> { a, b -> a.second - b.second }
        for (course in 1..n) {
            val indirect = graphIndirect[course] ?: emptySet()
            if (indirect.isEmpty()) {
                val end = time[course - 1]
                queue.add(course to end)
            }
        }
        while (queue.isNotEmpty()) {
            val (course, endTime) = queue.poll()
            result = maxOf(result, endTime)

            for (next in graphDirect[course] ?: emptySet()) {
                val prerequisites = graphIndirect[next] ?: continue
                prerequisites.remove(course)
                if (prerequisites.isEmpty()) {
                    val end = endTime + time[next - 1]
                    queue.add(next to end)
                }
            }

        }

        return result
    }

    fun minimumTimeDfs(n: Int, relations: Array<IntArray>, time: IntArray): Int {
        val graph = HashMap<Int, ArrayList<Int>>()
        val memo = HashMap<Int, Int>()

        for (edge in relations) {
            val x = edge[0] - 1
            val y = edge[1] - 1
            graph.computeIfAbsent(x) { ArrayList() }.add(y)
        }
        var ans = 0
        for (node in 0 until n) {
            ans = max(ans, dfs(node, time, graph, memo))
        }
        return ans
    }

    private fun dfs(node: Int, time: IntArray, graph: HashMap<Int, ArrayList<Int>>, memo: HashMap<Int, Int>): Int {
        if (memo.containsKey(node)) {
            return memo[node]!!
        }
        val neighbours = graph[node] ?: emptyList()
        if (neighbours.isEmpty()) {
            return time[node]
        }
        var ans = 0
        for (neighbor in neighbours) {
            ans = max(ans, dfs(neighbor, time, graph, memo))
        }
        memo[node] = time[node] + ans
        return time[node] + ans
    }
}