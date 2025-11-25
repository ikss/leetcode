package medium

/**
 * You are given an integer array nums and an integer x. In one operation, you can either remove the leftmost
 * or the rightmost element from the array nums and subtract its value from x.
 * Note that this modifies the array for future operations.
 *
 * Return the minimum number of operations to reduce x to exactly 0 if it is possible, otherwise, return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-operations-to-reduce-x-to-zero/)
 */
object MinimumOperationsToReduceToZero {
    fun minOperations(nums: IntArray, x: Int): Int {
        var target = -x
        for (num in nums) target += num

        if (target == 0) {  // since all elements are positive, we have to take all of them
            return nums.size
        }

        val map = mutableMapOf(0 to -1)
        var sum = 0
        var res = Int.MIN_VALUE

        for (i in nums.indices) {
            sum += nums[i]
            if (map.containsKey(sum - target)) {
                res = maxOf(res, i - map[sum - target]!!)
            }

            // no need to check containsKey since sum is unique
            map[sum] = i
        }

        return if (res == Integer.MIN_VALUE) -1 else nums.size - res
    }

    fun minOperationsTwoPointers(nums: IntArray, x: Int): Int {
        val size = nums.size
        var sum = nums.sum()
        var result = Int.MAX_VALUE

        var left = 0
        var right = 0

        while (left <= right) {
            if (sum >= x) {
                if (sum == x) {
                    result = minOf(result, size - right + left)
                }
                if (right >= size) break
                sum -= nums[right++]
            } else {
                sum += nums[left++]
            }
        }

        return if (result == Int.MAX_VALUE) -1 else result
    }
}