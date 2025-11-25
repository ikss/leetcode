package medium

import java.util.*

/**
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where `prerequisites[i] = [ai, bi]` indicates that you must take course bi
 * first if you want to take course ai.
 * * For example, the pair `[0, 1]`, indicates that to take course 0 you have to first take course 1.
 *
 * Return the ordering of courses you should take to finish all courses. If there are many valid answers,
 * return any of them. If it is impossible to finish all courses, return an empty array.
 *
 * [URL](https://leetcode.com/problems/find-closest-node-to-given-two-nodes/)
 */
object CourseScheduleII {
    fun findOrder(numCourses: Int, prerequisites: Array<IntArray>): IntArray {
        val graph = HashMap<Int, ArrayList<Int>>()
        val inbound = IntArray(numCourses)

        for ((b, a) in prerequisites) {
            graph.computeIfAbsent(a) { ArrayList() }.add(b)
            inbound[b]++
        }
        var visited = 0
        var queue = ArrayDeque<Int>()
        var result = IntArray(numCourses)
        
        for (i in inbound.indices) {
            if (inbound[i] > 0) continue
            queue.offer(i)
            result[visited++] = i
        }

        while (queue.isNotEmpty()) {
            val next = queue.poll()
            for (neigh in graph[next] ?: continue) {
                if (--inbound[neigh] == 0) {
                    queue.offer(neigh)
                    result[visited++] = neigh
                }
            }
        }

        return if (visited == numCourses) result else IntArray(0)
    }
}
