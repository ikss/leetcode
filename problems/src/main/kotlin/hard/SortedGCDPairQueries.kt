package hard

/**
 * You are given an integer array nums of length n and an integer array queries.
 *
 * Let gcdPairs denote an array obtained by calculating the GCD of all possible pairs (nums[i], nums[j]), where 0 <= i < j < n, and then sorting these values in ascending order.
 *
 * For each query queries[i], you need to find the element at index queries[i] in gcdPairs.
 *
 * Return an integer array answer, where answer[i] is the value at gcdPairs[queries[i]] for each query.
 *
 * The term gcd(a, b) denotes the greatest common divisor of a and b.
 *
 * [URL](https://leetcode.com/problems/sorted-gcd-pair-queries/)
 */
object SortedGCDPairQueries {
    fun gcdValues(nums: IntArray, queries: LongArray): IntArray {
        var m = nums.max()
        val counts = LongArray(m + 1)
        for (num in nums) {
            m = maxOf(m, num)
            counts[num]++
        }

        for (i in 1..m) {
            var j = i * 2
            while (j <= m) {
                counts[i] += counts[j]
                j += i
            }
        }

        for (i in 1..m) {
            counts[i] = (counts[i] * (counts[i] - 1)) / 2
        }

        for (i in m downTo 1) {
            var j = i * 2
            while (j <= m) {
                counts[i] -= counts[j]
                j += i
            }
        }
        for (i in 1..m) {
            counts[i] += counts[i - 1]
        }

        val result = IntArray(queries.size)
        for (k in queries.indices) {
            val q = queries[k] + 1
            var left = 1
            var right = m
            while (left < right) {
                val mid = (left + right) / 2
                if (counts[mid] >= q) {
                    right = mid
                } else {
                    left = mid + 1
                }
            }
            result[k] = left
        }
        return result
    }
}
