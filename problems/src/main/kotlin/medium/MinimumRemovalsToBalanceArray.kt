package medium

/**
 * You are given an integer array nums and an integer k.
 *
 * An array is considered balanced if the value of its maximum element is at most k times the minimum element.
 *
 * You may remove any number of elements from nums without making it empty.
 *
 * Return the minimum number of elements to remove so that the remaining array is balanced.
 *
 * Note: An array of size 1 is considered balanced as its maximum and minimum are equal,
 * and the condition always holds true.
 *
 * [URL](https://leetcode.com/problems/minimum-removals-to-balance-array/)
 */
object MinimumRemovalsToBalanceArray {
    fun minRemoval(nums: IntArray, k: Int): Int {
        val n = nums.size
        nums.sort()

        var ans = n
        var right = 0

        for (left in 0..<n) {
            while (right < n && nums[right] <= nums[left].toLong() * k) {
                right++
            }
            ans = minOf(ans, n - (right - left))
        }

        return ans
    }

}
