package hard

/**
 * You are given a 0-indexed array nums consisting of positive integers.
 *
 * Initially, you can increase the value of any element in the array by at most 1.
 *
 * After that, you need to select one or more elements from the final array such that those elements are
 * consecutive when sorted in increasing order.
 * For example, the elements `[3, 4, 5]` are consecutive while `[3, 4, 6]` and `[1, 1, 2, 3]` are not.
 *
 * Return the maximum number of elements that you can select.
 *
 * [URL](https://leetcode.com/problems/maximize-consecutive-elements-in-an-array-after-modification/)
 */
object MaximizeConsecutiveElementsInAnArrayAfterModification {
    fun maxSelectedElements(nums: IntArray): Int {
        nums.sort()
        val dp = HashMap<Int, Int>()
        var result = 0

        for (x in nums) {
            dp[x + 1] = maxOf(dp.getOrDefault(x + 1, 0), dp.getOrDefault(x, 0) + 1)
            dp[x] = maxOf(dp.getOrDefault(x, 0), dp.getOrDefault(x - 1, 0) + 1)
            result = maxOf(result, dp.get(x)!!, dp.get(x + 1)!!)
        }
        return result
    }
}
