package arrays.medium

/**
 * You are given an integer array nums that is sorted in non-decreasing order.
 *
 * Determine if it is possible to split nums into one or more subsequences
 * such that both of the following conditions are true:
 *
 *  * Each subsequence is a consecutive increasing sequence (i.e. each integer is exactly one more than the previous integer).
 *  * All subsequences have a length of 3 or more.
 *
 * Return true if you can split nums according to the above conditions, or false otherwise.
 *
 * A subsequence of an array is a new array that is formed from the original array by deleting some (can be none)
 * of the elements without disturbing the relative positions of the remaining elements.
 * (i.e., `[1,3,5]` is a subsequence of `[1,2,3,4,5]` while `[1,3,2]` is not).
 *
 * [URL](https://leetcode.com/problems/split-array-into-consecutive-subsequences/)
 */
object SplitArrayIntoConsecutiveSubsequences {
    fun isPossible(nums: IntArray): Boolean {
        val left = mutableMapOf<Int, Int>()
        val end = mutableMapOf<Int, Int>()
        for (n in nums) {
            left[n] = left.getOrDefault(n, 0) + 1
        }

        for (n in nums) {
            if (left[n]!! <= 0) continue
            left[n] = left[n]!! - 1

            // place n in an existing subsequence if possible
            if (end.getOrDefault(n - 1, 0) > 0) {
                end[n - 1] = end[n - 1]!! - 1
                end[n] = end.getOrDefault(n, 0) + 1
                continue
            }

            // place n in a new subsequence
            if (left.getOrDefault(n + 1, 0) > 0 && left.getOrDefault(n + 2, 0) > 0) {
                left[n + 1] = left[n + 1]!! - 1
                left[n + 2] = left[n + 2]!! - 1
                end[n + 2] = end.getOrDefault(n + 2, 0) + 1
                continue
            }

            // don't know where to place a? ---> false
            return false
        }
        return true
    }
}
