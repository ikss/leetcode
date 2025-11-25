package medium

import java.util.*

/**
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where `prerequisites[i] = [ai, bi]` indicates that you must take course bi first
 * if you want to take course ai.
 *
 * For example, the pair `[0, 1]`, indicates that to take course 0 you have to first take course 1.
 * Return true if you can finish all courses. Otherwise, return false.
 *
 * [URL](https://leetcode.com/problems/course-schedule/)
 */
object CourseSchedule {
    fun canFinishKahn(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val graph = HashMap<Int, ArrayList<Int>>()
        val indegree = IntArray(numCourses)

        for ((from, to) in prerequisites) {
            graph.computeIfAbsent(from) { ArrayList() }.add(to)
            indegree[to]++
        }

        val queue = ArrayDeque<Int>()
        for (i in 0 until numCourses) {
            if (indegree[i] == 0) queue.offer(i)
        }

        while (!queue.isEmpty()) {
            val start = queue.poll()

            for (neighbour in graph[start] ?: continue) {
                indegree[neighbour]--
                if (indegree[neighbour] == 0) queue.offer(neighbour)
            }
        }

        return indegree.all { it == 0 }
    }

    fun canFinishDfs(numCourses: Int, prerequisites: Array<IntArray>): Boolean {
        val adj = Array<ArrayList<Int>>(numCourses) { ArrayList() }
        for ((from, to) in prerequisites) {
            adj[from].add(to)
        }
        val color = IntArray(numCourses)
        for (i in 0 until numCourses) {
            if (dfs(adj, i, color)) {
                return false
            }
        }
        return true
    }

    private fun dfs(adj: Array<ArrayList<Int>>, v: Int, color: IntArray): Boolean {
        color[v] = 1
        for (neighbor in adj[v]) {
            if (color[neighbor] == 1 || (color[neighbor] == 0 && dfs(adj, neighbor, color))) {
                return true
            }
        }
        color[v] = 2
        return false
    }
}
