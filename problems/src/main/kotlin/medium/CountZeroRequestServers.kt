package medium

import java.util.*


/**
 * You are given an integer n denoting the total number of servers and a 2D 0-indexed integer array logs,
 * where `logs[i] = [server_id, time]` denotes that the server with id server_id received a request at time time.
 *
 * You are also given an integer x and a 0-indexed integer array queries.
 *
 * Return a 0-indexed integer array arr of length queries.length where `arr[i]` represents the number of servers that
 * did not receive any requests during the time interval `[queries[i] - x, queries[i]]`.
 *
 * Note that the time intervals are inclusive.
 *
 * [URL](https://leetcode.com/problems/count-zero-request-servers/)
 */
object CountZeroRequestServers {
    fun countServers(n: Int, logs: Array<IntArray>, x: Int, queries: IntArray): IntArray {
        logs.sortBy { it[1] }

        val m = queries.size
        val ids = Array(m) { it }
        ids.sortBy { queries[it] }

        val ans = IntArray(m)
        val cnt = IntArray(n + 1)
        var left = 0
        var right = 0
        var active = 0

        for (i in ids) {
            val q = queries[i]
            while (right < logs.size && logs[right][1] <= q) {
                val id = logs[right++][0]
                if (cnt[id]++ == 0) {
                    ++active
                }
            }
            while (left < right && logs[left][1] < q - x) {
                val id = logs[left++][0]
                if (--cnt[id] == 0) {
                    --active
                }
            }
            ans[i] = n - active
        }
        return ans
    }
}
