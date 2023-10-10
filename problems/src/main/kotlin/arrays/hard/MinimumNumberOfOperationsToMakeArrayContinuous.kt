package arrays.hard

/**
 * You are given an integer array nums. In one operation, you can replace any element in nums with any integer.
 *
 * nums is considered continuous if both of the following conditions are fulfilled:
 *
 * All elements in nums are unique.
 * The difference between the maximum element and the minimum element in nums equals `nums.length - 1`.
 * For example, `nums = [4, 2, 5, 3]` is continuous, but `nums = [1, 2, 3, 5, 6]` is not continuous.
 *
 * Return the minimum number of operations to make nums continuous.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-operations-to-make-array-continuous/)
 */
object MinimumNumberOfOperationsToMakeArrayContinuous {
    fun minOperations(nums: IntArray): Int {
        val n = nums.size
        var ans = n

        val unique = nums.toSet()
        val newNums = unique.toTypedArray().sortedArray()
        
        var j = 0
        for (i in newNums.indices) {
            while (j < newNums.size && newNums[j] < newNums[i] + n) {
                j++
            }
            val count = j - i
            ans = minOf(ans, n - count)
        }
        return ans
    }
}
