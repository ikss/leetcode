package medium

import java.util.*

/**
 * You are given a list of bombs. The range of a bomb is defined as the area where its effect can be felt.
 * This area is in the shape of a circle with the center as the location of the bomb.
 *
 * The bombs are represented by a 0-indexed 2D integer array bombs where `bombs[i] = [xi, yi, ri]`. xi and yi denote
 * the X-coordinate and Y-coordinate of the location of the ith bomb, whereas ri denotes the radius of its range.
 *
 * You may choose to detonate a single bomb. When a bomb is detonated, it will detonate all bombs that lie in its range.
 * These bombs will further detonate the bombs that lie in their ranges.
 *
 * Given the list of bombs, return the maximum number of bombs that can be detonated if you are allowed to detonate only
 * one bomb.
 *
 * [URL](https://leetcode.com/problems/detonate-the-maximum-bombs/)
 */
object DetonateTheMaximumBombs {
    fun maximumDetonation(bombs: Array<IntArray>): Int {
        val graph = HashMap<Int, ArrayList<Int>>()
        val n = bombs.size

        // Build the graph
        for (i in 0 until n) {
            val (xi, yi, ri) = bombs[i]
            for (j in 0 until n) {
                val (xj, yj, _) = bombs[j]

                // Create a path from node i to node j, if bomb i detonates bomb j.
                if (ri.toLong() * ri >= (xi - xj).toLong() * (xi - xj) + (yi - yj).toLong() * (yi - yj)) {
                    graph.computeIfAbsent(i) { ArrayList() }.add(j)
                }
            }
        }
        var answer = 0
        for (i in 0 until n) {
            answer = maxOf(answer, bfs(i, graph))
        }
        return answer
    }

    private fun bfs(i: Int, graph: Map<Int, MutableList<Int>>): Int {
        val queue: Deque<Int> = ArrayDeque()
        val visited: MutableSet<Int> = HashSet()
        queue.offer(i)
        visited.add(i)
        while (!queue.isEmpty()) {
            val cur = queue.poll()
            for (neib in graph[cur] ?: continue) {
                if (visited.add(neib)) {
                    queue.offer(neib)
                }
            }
        }
        return visited.size
    }
}
