package hard

/**
 * Two strings X and Y are similar if we can swap two letters (in different positions) of X, so that it equals Y.
 * Also two strings X and Y are similar if they are equal.
 *
 * For example, "tars" and "rats" are similar (swapping at positions 0 and 2), and "rats" and "arts" are similar,
 * but "star" is not similar to "tars", "rats", or "arts".
 *
 * Together, these form two connected groups by similarity: {"tars", "rats", "arts"} and {"star"}.
 * Notice that "tars" and "arts" are in the same group even though they are not similar.  Formally, each group is
 * such that a word is in the group if and only if it is similar to at least one other word in the group.
 *
 * We are given a list strs of strings where every string in strs is an anagram of every other string in strs.
 * How many groups are there?
 *
 * [URL](https://leetcode.com/problems/similar-string-groups/)
 */
object SimilarStringGroups {

    fun numSimilarGroups(strs: Array<String>): Int {
        val n = strs.size
        val adj = HashMap<Int, ArrayList<Int>>()
        // Form the required graph from the given strings array.
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                if (isSimilar(strs[i], strs[j])) {
                    adj.computeIfAbsent(i) { ArrayList() }.add(j)
                    adj.computeIfAbsent(j) { ArrayList() }.add(i)
                }
            }
        }
        val visit = BooleanArray(n)
        var count = 0
        // Count the number of connected components.
        for (i in 0 until n) {
            if (!visit[i]) {
                bfs(i, adj, visit)
                count++
            }
        }
        return count
    }

    private fun isSimilar(a: String, b: String): Boolean {
        var diff = 0
        for (i in a.indices) {
            if (a[i] != b[i]) {
                diff++
            }
        }
        return diff == 0 || diff == 2
    }

    private fun bfs(node: Int, adj: Map<Int, List<Int>>, visit: BooleanArray) {
        val q = java.util.ArrayDeque<Int>()
        q.offer(node)
        visit[node] = true
        while (!q.isEmpty()) {
            val next = q.poll()
            val neighbors = adj[next]
                ?: continue
            for (neighbor in neighbors) {
                if (!visit[neighbor]) {
                    visit[neighbor] = true
                    q.offer(neighbor)
                }
            }
        }
    }

}
