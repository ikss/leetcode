package medium

/**
 * You are given a positive integer n representing n cities numbered from 1 to n. You are also given a 2D array roads
 * where `roads[i] = [ai, bi, distancei]` indicates that there is a bidirectional road between cities ai and bi
 * with a distance equal to distancei. The cities graph is not necessarily connected.
 *
 * The score of a path between two cities is defined as the minimum distance of a road in this path.
 *
 * Return the minimum possible score of a path between cities 1 and n.
 *
 * Note:
 * * A path is a sequence of roads between two cities.
 * * It is allowed for a path to contain the same road multiple times, and you can visit cities 1 and n multiple times
 * along the path.
 * * The test cases are generated such that there is at least one path between 1 and n.
 *
 * [URL](https://leetcode.com/problems/minimum-score-of-a-path-between-two-cities/)
 */
object MinimumScoreOfPathBetweenTwoCities {
    fun minScore(n: Int, roads: Array<IntArray>): Int {
        val map = hashMapOf<Int, ArrayList<Pair<Int, Int>>>()

        for (r in roads) {
            val (s, e, d) = r
            map.computeIfAbsent(s) { ArrayList() }.add(e to d)
            map.computeIfAbsent(e) { ArrayList() }.add(s to d)
        }

        return bfs(n, map)
    }

    private fun bfs(n: Int, map: Map<Int, List<Pair<Int, Int>>>): Int {
        val visit = BooleanArray(n + 1)
        val queue = java.util.ArrayDeque<Int>()
        queue.offer(1)
        visit[1] = true

        var result = Int.MAX_VALUE
        while (queue.isNotEmpty()) {
            val e = queue.poll()

            val edges = map[e]
                ?: break
            for ((next, w) in edges) {
                result = minOf(result, w)
                if (!visit[next]) {
                    visit[next] = true
                    queue.offer(next)
                }
            }
        }
        return result
    }
}
