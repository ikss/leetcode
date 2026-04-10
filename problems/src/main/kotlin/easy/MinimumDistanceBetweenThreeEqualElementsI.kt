package easy

/**
 * You are given an integer array nums.
 *
 * A tuple (i, j, k) of 3 distinct indices is good if `nums[i] == nums[j] == nums[k]`.
 *
 * The distance of a good tuple is abs(i - j) + abs(j - k) + abs(k - i), where abs(x) denotes the absolute value of x.
 *
 * Return an integer denoting the minimum possible distance of a good tuple. If no good tuples exist, return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-distance-between-three-equal-elements-i/)
 */
object MinimumDistanceBetweenThreeEqualElementsI {
    fun minimumDistance(nums: IntArray): Int {
        val distances = Array(101) { IntArray(3) { -1 } }

        var result = Int.MAX_VALUE

        for (i in nums.indices) {
            val n = nums[i]

            val distance = distances[n]

            if (distance[2] != -1) {
                distance[0] = distance[1]
                distance[1] = distance[2]
                distance[2] = i
                result = minOf(result, calculateTotalDistance(distance))
            } else {
                if (distance[0] == -1) distance[0] = i
                else if (distance[1] == -1) distance[1] = i
                else {
                    distance[2] = i
                    result = minOf(result, calculateTotalDistance(distance))
                }
            }
        }

        return if (result == Int.MAX_VALUE) -1 else result
    }

    private fun calculateTotalDistance(arr: IntArray): Int {
        return Math.abs(arr[0] - arr[1]) + Math.abs(arr[0] - arr[2])+  Math.abs(arr[1] - arr[2])
    }
}
