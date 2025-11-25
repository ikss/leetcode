package medium

/**
 * A swap is defined as taking two distinct positions in an array and swapping the values in them.
 *
 * A circular array is defined as an array where we consider the first element and the last element to be adjacent.
 *
 * Given a binary circular array nums, return the minimum number of swaps required to group all 1's present in the array together at any location.
 *
 * [URL](https://leetcode.com/problems/minimum-swaps-to-group-all-1s-together-ii/)
 */
object MinimumSwapsToGroupAll1sTogetherII {
    fun minSwaps(nums: IntArray): Int {
        var totalOnes = 0

        for (num in nums) {
            totalOnes += num
        }
        var result = totalOnes

        var onesCount = 0
        var end = 0
        var start = 0
        
        while (end < totalOnes) {
            onesCount += nums[end++]
        }
        end--

        while (start < nums.size) {
            if (start > 0) {
                onesCount -= nums[start - 1]
                onesCount += nums[end % nums.size]
            }

            result = minOf(result, totalOnes - onesCount)
            start++
            end++
        }

        return result
    }
}
