package hard

/**
 * You are given a binary string s of length n, where:
 * * '1' represents an active section.
 * * '0' represents an inactive section.
 *
 * You can perform at most one trade to maximize the number of active sections in s. In a trade, you:
 * * Convert a contiguous block of '1's that is surrounded by '0's to all '0's.
 * * Afterward, convert a contiguous block of '0's that is surrounded by '1's to all '1's.
 * 
 * Additionally, you are given a 2D array queries, where `queries[i] = [li, ri]` represents a substring `s[li...ri]`.
 *
 * For each query, determine the maximum possible number of active sections in s after making the optimal trade
 * on the substring `s[li...ri]`.
 *
 * Return an array answer, where `answer[i]` is the result for `queries[i]`.
 *
 * Note
 * * For each query, treat `s[li...ri]` as if it is augmented with a '1' at both ends,
 * forming `t = '1' + s[li...ri] + '1'`. The augmented '1's do not contribute to the final count.
 * * The queries are independent of each other.
 *
 * [URL](https://leetcode.com/problems/maximize-active-section-with-trade-ii/)
 */
object MaximizeActiveSectionWithTradeII {
    private class SegmentTree(private val arr: IntArray) {
        private val n = arr.size
        private val seg = IntArray(n shl 2)

        init {
            build(1, 0, n - 1)
        }

        private fun build(p: Int, l: Int, r: Int) {
            if (l == r) {
                seg[p] = arr[l]
                return
            }

            val mid = (l + r) shr 1
            build(p shl 1, l, mid)
            build((p shl 1) or 1, mid + 1, r)
            seg[p] = maxOf(seg[p shl 1], seg[(p shl 1) or 1])
        }

        private fun _query(p: Int, l: Int, r: Int, L: Int, R: Int): Int {
            if (L <= l && r <= R) {
                return seg[p]
            }

            val mid = (l + r) shr 1
            var res = 0
            if (L <= mid) {
                res = maxOf(res, _query(p shl 1, l, mid, L, R))
            }
            if (R > mid) {
                res = maxOf(res, _query((p shl 1) or 1, mid + 1, r, L, R))
            }

            return res
        }

        fun query(L: Int, R: Int): Int {
            if (L > R) {
                return 0
            }

            return _query(1, 0, n - 1, L, R)
        }
    }

    fun maxActiveSectionsAfterTrade(s: String, queries: Array<IntArray>): ArrayList<Int> {
        val n = s.length
        var cnt1 = 0
        for (c in s) {
            if (c == '1') {
                cnt1++
            }
        }

        val zeroBlocks = ArrayList<Int>()
        val blockLeft = ArrayList<Int>()
        val blockRight = ArrayList<Int>()

        var i = 0
        while (i < n) {
            val st = i
            while (i < n && s[i] == s[st]) {
                i += 1
            }
            if (s[st] == '0') {
                zeroBlocks.add(i - st)
                blockLeft.add(st)
                blockRight.add(i - 1)
            }
        }

        val m = zeroBlocks.size
        if (m < 2) {
            // continuous 0 blocks less than 2 segments, return the answer directly
            val result = ArrayList<Int>()
            for (q in queries.indices) {
                result.add(cnt1)
            }
            return result
        }

        val tmpSum = IntArray(m - 1)
        for (k in 0..<m - 1) {
            tmpSum[k] = zeroBlocks[k] + zeroBlocks[k + 1]
        }
        val seg = SegmentTree(tmpSum)
        val ans = ArrayList<Int>()

        for (q in queries) {
            val l = q[0]
            val r = q[1]
            val idx = lowerBound(blockRight, l)
            val jdx = upperBound(blockLeft, r) - 1

            // at most 1 continuous block of 0s within the substring
            if (idx > m - 1 || jdx < 0 || idx >= jdx) {
                ans.add(cnt1)
                continue
            }
            // actual length of the first consecutive block of 0s in the substring
            val firstLen = blockRight[idx] - maxOf(blockLeft[idx], l) + 1
            // actual length of the last consecutive block of 0s in the substring
            val lastLen = minOf(blockRight[jdx], r) - blockLeft[jdx] + 1
            // exactly 2 consecutive 0 blocks within the substring
            if (idx + 1 == jdx) {
                val bestGain = firstLen + lastLen
                ans.add(cnt1 + bestGain)
                continue
            }

            val val1 = firstLen + zeroBlocks[idx + 1]
            val val2 = zeroBlocks[jdx - 1] + lastLen
            val val3 = seg.query(idx + 1, jdx - 2)
            val bestGain = maxOf(val1, val2, val3)
            ans.add(cnt1 + bestGain)
        }

        return ans
    }

    private fun lowerBound(list: MutableList<Int>, target: Int): Int {
        var left = 0
        var right = list.size
        while (left < right) {
            val mid = left + (right - left) / 2
            if (list[mid] < target) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }

    private fun upperBound(list: MutableList<Int>, target: Int): Int {
        var left = 0
        var right = list.size
        while (left < right) {
            val mid = left + (right - left) / 2
            if (list[mid] <= target) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left
    }
}
