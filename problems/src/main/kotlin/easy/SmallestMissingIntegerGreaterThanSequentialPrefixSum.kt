package easy

/**
 * You are given a 0-indexed array of integers nums.
 *
 * A prefix nums[0..i] is sequential if, for all 1 <= j <= i, `nums[j] = nums[j - 1] + 1`.
 * In particular, the prefix consisting only of `nums[0]` is sequential.
 *
 * Return the smallest integer x missing from nums such that x is greater than or equal to the sum of the longest sequential prefix.
 *
 * [URL](https://leetcode.com/problems/sliding-puzzle/)
 */
object SmallestMissingIntegerGreaterThanSequentialPrefixSum {
    fun missingInteger(nums: IntArray): Int {
        val set = HashSet<Int>()
        set.add(nums[0])
        var longestPrefSum = nums[0]

        var i = 1
        while (i < nums.size) {
            val num = nums[i]
            set.add(num)
            if (num == nums[i - 1] + 1) {
                longestPrefSum += num
            } else {
                break
            }
            i++
        }

        while (i < nums.size) {
            val num = nums[i]
            set.add(num)

            i++
        }

        while (true) {
            if (longestPrefSum !in set) {
                return longestPrefSum
            }
            longestPrefSum++
        }
    }
}
