package medium

import java.util.*

/**
 * You are given a directed acyclic graph of n nodes numbered from 0 to n − 1.
 * This is represented by a 2D array edges of length m, where `edges[i] = [ui, vi, costi]` indicates a one‑way
 * communication from node ui to node vi with a recovery cost of costi.
 * 
 * Some nodes may be offline. You are given a boolean array online where `online[i] = true` means node i is online.
 * Nodes 0 and n − 1 are always online.
 * 
 * A path from 0 to n − 1 is valid if:
 * * All intermediate nodes on the path are online.
 * * The total recovery cost of all edges on the path does not exceed k.
 *
 * For each valid path, define its score as the minimum edge‑cost along that path.
 * 
 * Return the maximum path score (i.e., the largest minimum-edge cost) among all valid paths.
 * If no valid path exists, return -1.
 *
 * [URL](https://leetcode.com/problems/network-recovery-pathways/)
 */
object NetworkRecoveryPathways {
    fun findMaxPathScore(edges: Array<IntArray>, online: BooleanArray, k: Long): Int {
        val n = online.size
        val g = Array(n) { ArrayList<IntArray>() }
        val deg = IntArray(n)

        var l = Int.MAX_VALUE
        var r = 0
        for ((u, v, w) in edges) {
            if (!online[u] || !online[v]) {
                continue
            }
            g[u].add(intArrayOf(v, w))
            deg[v]++
            l = minOf(l, w)
            r = maxOf(r, w)
        }

        // Delete unreachable nodes
        val q = ArrayDeque<Int>()
        for (i in 1..<n) {
            if (deg[i] == 0) {
                q.offer(i)
            }
        }
        while (q.isNotEmpty()) {
            val u = q.poll()
            for (edge in g[u]) {
                val v = edge[0]
                if (--deg[v] == 0 && v != 0) {
                    q.offer(v)
                }
            }
        }

        if (!check(l, k, g, deg, n)) {
            return -1
        }

        while (l <= r) {
            val mid = (l + r) shr 1
            if (check(mid, k, g, deg, n)) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }
        return r
    }

    private fun check(mid: Int, k: Long, g: Array<ArrayList<IntArray>>, deg: IntArray, n: Int): Boolean {
        val dp = LongArray(n) { Long.MAX_VALUE / 2 }
        val cdeg = deg.clone()
        dp[0] = 0

        val q = ArrayDeque<Int>()
        q.offer(0)

        while (q.isNotEmpty()) {
            val u: Int = q.poll()!!
            if (u == n - 1) {
                return dp[u] <= k
            }

            for (edge in g[u]) {
                val v = edge[0]
                val w = edge[1]
                if (w >= mid) {
                    dp[v] = minOf(dp[v], dp[u] + w)
                }
                if (--cdeg[v] == 0) {
                    q.offer(v)
                }
            }
        }
        return false
    }
}
