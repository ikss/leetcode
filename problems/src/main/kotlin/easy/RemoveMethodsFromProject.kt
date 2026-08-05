package easy

/**
 * You are maintaining a project that has n methods numbered from 0 to n - 1.
 *
 * You are given two integers n and k, and a 2D integer array invocations,
 * where `invocations[i] = [ai, bi]` indicates that method ai invokes method bi.
 *
 * There is a known bug in method k. Method k, along with any method invoked by it, either directly or indirectly,
 * are considered suspicious and we aim to remove them.
 *
 * A group of methods can only be removed if no method outside the group invokes any methods within it.
 *
 * Return an array containing all the remaining methods after removing all the suspicious methods.
 * You may return the answer in any order.
 * If it is not possible to remove all the suspicious methods, none should be removed.
 *
 * [URL](https://leetcode.com/problems/remove-methods-from-project/)
 */
object RemoveMethodsFromProject {
    fun remainingMethods(n: Int, k: Int, invocations: Array<IntArray>): List<Int> {
        val graph = HashMap<Int, ArrayList<Int>>()

        for ((from, to) in invocations) {
            graph.computeIfAbsent(from) { ArrayList() }.add(to)
        }

        val sus = BooleanArray(n)

        markSus(k, sus, graph)

        return filterNonSus(n, sus, graph)
    }

    private fun markSus(k: Int, sus: BooleanArray, graph: Map<Int, List<Int>>) {
        val queue = java.util.ArrayDeque<Int>()
        queue.offer(k)
        sus[k] = true

        while (queue.isNotEmpty()) {
            val curr = queue.poll()

            for (neigh in graph[curr] ?: continue) {
                if (sus[neigh]) continue

                sus[neigh] = true
                queue.offer(neigh)
            }
        }
    }

    private fun filterNonSus(n: Int, sus: BooleanArray, graph: Map<Int, List<Int>>): List<Int> {
        var queue = java.util.ArrayDeque<Int>()
        val seen = HashSet<Int>()

        for (i in sus.indices) {
            if (!sus[i]) {
                queue.offer(i)
            }
        }

        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            seen.add(curr)

            for (neigh in graph[curr] ?: continue) {
                if (neigh !in seen) {
                    if (sus[neigh]) {
                        return (0..<n).toList()
                    }
                    queue.offer(neigh)
                }
            }
        }

        return seen.toList()
    }
}
