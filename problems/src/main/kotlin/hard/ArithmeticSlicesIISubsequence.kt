package hard

/**
 * Given an integer array nums, return the number of all the arithmetic subsequences of nums.
 *
 * A sequence of numbers is called arithmetic if it consists of at least three elements and if the difference between
 * any two consecutive elements is the same.
 *
 * For example, `[1, 3, 5, 7, 9]`, `[7, 7, 7, 7]`, and `[3, -1, -5, -9]` are arithmetic sequences.
 * For example, `[1, 1, 2, 5, 7]` is not an arithmetic sequence.
 * A subsequence of an array is a sequence that can be formed by removing some elements (possibly none) of the array.
 *
 * For example, `[2, 5, 10]` is a subsequence of `[1, 2, 1, 2, 4, 1, 5, 10]`.
 * The test cases are generated so that the answer fits in 32-bit integer.
 *
 * [URL](https://leetcode.com/problems/arithmetic-slices-ii-subsequence/)
 */
object ArithmeticSlicesIISubsequence {
    fun numberOfArithmeticSlices(nums: IntArray): Int {
        var ans = 0
        val cnt = Array(nums.size) { HashMap<Int, Int>(it, 1.0F) }

        for (i in nums.indices) {
            for (j in 0 until i) {
                val delta = nums[i].toLong() - nums[j].toLong()
                if (delta < Int.MIN_VALUE || delta > Int.MAX_VALUE) {
                    continue
                }
                val diff = delta.toInt()
                val sum = cnt[j].getOrDefault(diff, 0)
                val origin = cnt[i].getOrDefault(diff, 0)
                cnt[i][diff] = origin + sum + 1
                ans += sum
            }
        }
        return ans
    }
}
