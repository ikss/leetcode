package hard

import java.util.*

/**
 * You are given an integer array nums of length n and a 2D integer array queries of size q, where queries[i] = [li, ri, ki, vi].
 *
 * For each query, you must apply the following operations in order:
 *
 * * Set idx = li.
 * * While idx <= ri:
 * * * Update: `nums[idx] = (nums[idx] * vi) % (10^9 + 7)`
 * * * Set idx += ki.
 *
 * Return the bitwise XOR of all elements in nums after processing all queries.
 *
 * [URL](https://leetcode.com/problems/xor-after-range-multiplication-queries-ii/)
 */
object XORAfterRangeMultiplicationQueriesII {
    private val MOD = 1_000_000_007L

    private fun pow(x: Long, y: Long): Int {
        var x = x
        var y = y
        var res: Long = 1
        while (y > 0) {
            if ((y and 1L) == 1L) {
                res = (res * x) % MOD
            }
            x = (x * x) % MOD
            y = y shr 1
        }
        return res.toInt()
    }

    fun xorAfterQueries(nums: IntArray, queries: Array<IntArray>): Int {
        val n = nums.size
        val sqrt = Math.sqrt(n.toDouble()).toInt()
        val groups = ArrayList<ArrayList<IntArray>>(sqrt)
        for (i in 0..<sqrt) {
            groups.add(ArrayList<IntArray>())
        }

        for (q in queries) {
            val l = q[0]
            val r = q[1]
            val k = q[2]
            val v = q[3]
            if (k < sqrt) {
                groups[k].add(intArrayOf(l, r, v))
            } else {
                var i = l
                while (i <= r) {
                    nums[i] = ((nums[i].toLong() * v) % MOD).toInt()
                    i += k
                }
            }
        }

        val dif = LongArray(n + sqrt)
        for (k in 1..<sqrt) {
            if (groups[k].isEmpty()) {
                continue
            }
            Arrays.fill(dif, 1)
            for (q in groups[k]) {
                val l = q[0]
                val r = q[1]
                val v = q[2]
                dif[l] = (dif[l] * v) % MOD
                val R = ((r - l) / k + 1) * k + l
                dif[R] = (dif[R] * pow(v.toLong(), MOD - 2)) % MOD
            }

            for (i in k..<n) {
                dif[i] = (dif[i] * dif[i - k]) % MOD
            }
            for (i in 0..<n) {
                nums[i] = ((nums[i].toLong() * dif[i]) % MOD).toInt()
            }
        }

        var res = 0
        for (x in nums) {
            res = res xor x
        }
        return res
    }
}