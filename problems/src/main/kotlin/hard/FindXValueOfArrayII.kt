package hard

import java.util.*


/**
 * You are given an array of positive integers nums and a positive integer k. You are also given a 2D array queries,
 * where `queries[i] = [indexi, valuei, starti, xi]`.
 *
 * You are allowed to perform an operation once on nums, where you can remove any suffix
 * from nums such that nums remains non-empty.
 *
 * The x-value of nums for a given x is defined as the number of ways to perform this operation so that the product of
 * the remaining elements leaves a remainder of x modulo k.
 *
 * For each query in queries you need to determine the x-value of nums for xi after performing the following actions:
 *
 * Update `nums[indexi]` to valuei. Only this step persists for the rest of the queries.
 * Remove the prefix `nums[0..(starti - 1)]` (where `nums[0..(-1)]` will be used to represent the empty prefix).
 * Return an array result of size queries.length where `result[i]` is the answer for the ith query.
 *
 * A prefix of an array is a subarray that starts from the beginning of the array and extends to any point within it.
 *
 * A suffix of an array is a subarray that starts at any point within the array and extends to the end of the array.
 *
 * Note that the prefix and suffix to be chosen for the operation can be empty.
 *
 * Note that x-value has a different definition in this version.
 *
 * [URL](https://leetcode.com/problems/find-x-value-of-array-ii/)
 */
object FindXValueOfArrayII {
    class SegmentTree(nums: IntArray, private val k: Int) {
        private val n: Int = nums.size
        private val tree: Array<IntArray> = Array(2 shl Integer.toBinaryString(n).length) { IntArray(MAXK) }

        init {
            build(nums, 1, 0, n - 1)
        }

        private fun makeLeaf(o: Int, value: Int) {
            Arrays.fill(tree[o], 0)
            val r = value % k
            tree[o][r] = 1
            tree[o][k] = r
        }

        private fun mergePre(left: IntArray, right: IntArray, result: IntArray) {
            val mulL = left[k]
            val mulR = right[k]
            result[k] = (mulL * mulR) % k

            for (x in 0..<k) {
                result[x] = left[x]
            }
            for (x in 0..<k) {
                result[(mulL * x) % k] += right[x]
            }
        }

        private fun maintain(o: Int) {
            mergePre(tree[o * 2], tree[o * 2 + 1], tree[o])
        }

        private fun build(nums: IntArray, o: Int, l: Int, r: Int) {
            if (l == r) {
                makeLeaf(o, nums[l])
                return
            }
            val m = (l + r) / 2
            build(nums, o * 2, l, m)
            build(nums, o * 2 + 1, m + 1, r)
            maintain(o)
        }

        fun update(o: Int, l: Int, r: Int, index: Int, value: Int) {
            if (l == r) {
                makeLeaf(o, value)
                return
            }
            val m = (l + r) / 2
            if (index <= m) {
                update(o * 2, l, m, index, value)
            } else {
                update(o * 2 + 1, m + 1, r, index, value)
            }
            maintain(o)
        }

        fun query(o: Int, l: Int, r: Int, L: Int, R: Int): IntArray {
            if (L <= l && r <= R) {
                return tree[o]
            }

            val m = (l + r) / 2
            if (R <= m) {
                return query(o * 2, l, m, L, R)
            }
            if (L > m) {
                return query(o * 2 + 1, m + 1, r, L, R)
            }

            val left = query(o * 2, l, m, L, R)
            val right = query(o * 2 + 1, m + 1, r, L, R)
            val result = IntArray(MAXK)
            mergePre(left, right, result)
            return result
        }

        companion object {
            private const val MAXK = 6
        }
    }

    fun resultArray(nums: IntArray, k: Int, queries: Array<IntArray>): IntArray {
        val n = nums.size
        val seg = SegmentTree(nums, k)
        val ans = IntArray(queries.size)

        for (i in queries.indices) {
            val (index, value, start, x) = queries[i]

            seg.update(1, 0, n - 1, index, value)
            val pre = seg.query(1, 0, n - 1, start, n - 1)
            ans[i] = pre[x]
        }

        return ans
    }
}
