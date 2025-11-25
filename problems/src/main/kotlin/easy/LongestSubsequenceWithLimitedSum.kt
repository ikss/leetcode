package easy

/**
 * You are given an integer array nums of length n, and an integer array queries of length m.
 *
 * Return an array answer of length m where `answer[i]` is the maximum size of a subsequence that you can take
 * from nums such that the sum of its elements is less than or equal to `queries[i]`.
 *
 * A subsequence is an array that can be derived from another array by deleting some or no elements without changing
 * the order of the remaining elements.
 *
 * [URL](https://leetcode.com/problems/longest-subsequence-with-limited-sum/)
 */
object LongestSubsequenceWithLimitedSum {
    fun answerQueries(nums: IntArray, queries: IntArray): IntArray {
        nums.sort()

        val result = IntArray(queries.size)

        for (i in queries.indices) {
            var count = 0
            var sum = 0
            for (n in nums) {
                sum += n
                if (sum > queries[i]) break
                count++
            }

            result[i] = count
        }
        return result
    }
}
