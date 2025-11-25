package medium

/**
 * You are given an integer array nums where the ith bag contains `nums[i]` balls.
 * You are also given an integer maxOperations.
 *
 * You can perform the following operation at most maxOperations times:
 *
 * * Take any bag of balls and divide it into two new bags with a positive number of balls.
 * * * For example, a bag of 5 balls can become two new bags of 1 and 4 balls, or two new bags of 2 and 3 balls.
 *
 * Your penalty is the maximum number of balls in a bag. You want to minimize your penalty after the operations.
 *
 * Return the minimum possible penalty after performing the operations.
 *
 * [URL](https://leetcode.com/problems/minimum-limit-of-balls-in-a-bag/)
 */
object MinimumLimitOfBallsInBag {
    fun minimumSize(nums: IntArray, maxOperations: Int): Int {
        var min = 1
        var max = nums.max()

        while (min < max) {
            val mid = (max - min) / 2 + min

            if (canAchieve(nums, maxOperations, mid)) {
                max = mid
            } else {
                min = mid + 1
            }
        }

        return min
    }

    private fun canAchieve(nums: IntArray, maxOperations: Int, goal: Int): Boolean {
        var operations = maxOperations

        for (n in nums) {
            operations -= (n - 1) / goal
            if (operations < 0) return false
        }
        return true
    }
}
