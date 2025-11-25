package medium

/**
 * Given a binary array nums, return the maximum number of consecutive 1's in the array if you can flip at most one 0.
 *
 * [URL](https://leetcode.com/problems/max-consecutive-ones-ii/)
 */
object MaxConsecutiveOnesII {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var prev = 0
        var curr = 0
        var hasZero = false

        var result = 0

        for (n in nums) {
            if (n == 1) {
                curr++
                hasZero = false
                continue
            }
            result = maxOf(result, curr + prev)
            prev = if (hasZero) 0 else curr + 1
            curr = 0
            hasZero = true
        }

        return maxOf(result, curr + prev)
    }
}
