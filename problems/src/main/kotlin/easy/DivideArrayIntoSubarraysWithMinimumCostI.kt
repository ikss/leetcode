package easy

/**
 * You are given an array of integers nums of length n.
 *
 * The cost of an array is the value of its first element.
 * For example, the cost of `[1,2,3]` is 1 while the cost of [3,4,1] is 3.
 *
 * You need to divide nums into 3 disjoint contiguous subarrays.
 *
 * Return the minimum possible sum of the cost of these subarrays.
 *
 * [URL](https://leetcode.com/problems/adding-spaces-to-a-string/)
 */
object DivideArrayIntoSubarraysWithMinimumCostI {
    fun minimumCost(nums: IntArray): Int {
        val mins = IntArray(2) { Int.MAX_VALUE }

        for (i in 1 until nums.size) {
            val num = nums[i]
            if (num < mins[0]) {
                mins[1] = mins[0]
                mins[0] = num
            } else if (num < mins[1]) {
                mins[1] = num
            }
        }

        return nums[0] + mins[1] + mins[0]
    }
}