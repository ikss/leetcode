package graphs.medium

/**
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where `prerequisites[i] = [ai, bi]` indicates that you must take course ai
 * first if you want to take course bi.
 *
 * For example, the pair [0, 1] indicates that you have to take course 0 before you can take course 1.
 * Prerequisites can also be indirect. If course a is a prerequisite of course b, and course b is a prerequisite
 * of course c, then course a is a prerequisite of course c.
 *
 * You are also given an array queries where `queries[j] = [uj, vj]`. For the jth query, you should answer whether course
 * uj is a prerequisite of course vj or not.
 *
 * Return a boolean array answer, where `answer[j]` is the answer to the jth query.
 *
 * [URL](https://leetcode.com/problems/course-schedule-iv/)
 */
object CourseScheduleIV {
    fun checkIfPrerequisite(numCourses: Int, prerequisites: Array<IntArray>, queries: Array<IntArray>): List<Boolean> {
        val graph = Array<HashSet<Int>>(numCourses) { HashSet() }

        for ((first, second) in prerequisites) {
            graph[second].add(first)
        }

        val result = BooleanArray(queries.size)

        for (i in queries.indices) {
            val (to, from) = queries[i]

            result[i] = graph[from].isNotEmpty() && isPrerequisite(from, to, graph)
        }

        return result.toList()
    }

    private fun isPrerequisite(start: Int, end: Int, graph: Array<HashSet<Int>>): Boolean {
        if (graph[start].contains(end)) {
            return true
        }
        val queue = java.util.ArrayDeque<Int>()
        queue.offer(start)
        val visited = HashSet<Int>()
        visited.add(start)

        while (queue.isNotEmpty()) {
            val curr = queue.poll()

            for (neigh in graph[curr]) {
                if (end == neigh) {
                    return true
                }
                if (visited.add(neigh)) {
                    queue.offer(neigh)
                }
            }
        }

        return false
    }
}
