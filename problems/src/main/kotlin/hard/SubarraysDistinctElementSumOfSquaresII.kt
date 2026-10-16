package hard

/**
 * You are given a 0-indexed integer array nums.
 *
 * The distinct count of a subarray of nums is defined as:
 * * Let `nums[i..j]` be a subarray of nums consisting of all the indices from i to j such that 0 <= i <= j < nums.length.
 * Then the number of distinct values in `nums[i..j]` is called the distinct count of `nums[i..j]`.
 * Return the sum of the squares of distinct counts of all subarrays of nums.
 *
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * A subarray is a contiguous non-empty sequence of elements within an array.
 *
 * [URL](https://leetcode.com/problems/subarrays-distinct-element-sum-of-squares-ii/)
 */
object SubarraysDistinctElementSumOfSquaresII {
    fun sumCounts(nums: IntArray): Int {
        val n = nums.size
        var result = 0L
        var cur = 0L
        val bit = BIT(n + 10)
        val seen = HashMap<Int, Int>()
        val mod = 1_000_000_007L

        for (i in 0..<n) {
            val a = nums[i]
            val j = seen.getOrDefault(a, -1) + 1
            val q = bit.query(j, i)
            cur = (cur + q * 2 + i - j + 1) % mod
            result = (result + cur) % mod
            bit.add(j, i, 1)
            seen[a] = i
        }
        return result.toInt()
    }

    private class BIT(var size: Int) {
        private var tree1 = LongArray(size + 2)
        private var tree2 = LongArray(size + 2)

        private fun lowbit(index: Int): Int {
            return index and -index
        }

        fun add(left: Int, right: Int, delta: Int) {
            addInternal(left, delta)
            addInternal(right + 1, -delta)
        }

        fun query(left: Int, right: Int): Long {
            return queryInternal(right) - queryInternal(left - 1)
        }

        private fun addInternal(index: Int, delta: Int) {
            var index = index
            index += 1
            val rawIndex = index.toLong()
            while (index <= size) {
                tree1[index] += delta.toLong()
                tree2[index] += rawIndex * delta
                index += lowbit(index)
            }
        }

        private fun queryInternal(index: Int): Long {
            var index = index
            index += 1
            val rawIndex = index + 1L
            if (index > size) {
                index = size
            }
            var res = 0L
            while (index > 0) {
                res += rawIndex * tree1[index] - tree2[index]
                index -= lowbit(index)
            }
            return res
        }
    }
}
