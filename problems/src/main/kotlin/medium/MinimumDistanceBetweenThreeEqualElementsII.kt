package medium

/**
 * You are given an integer array nums.
 *
 * A tuple (i, j, k) of 3 distinct indices is good if `nums[i] == nums[j] == nums[k]`.
 *
 * The distance of a good tuple is abs(i - j) + abs(j - k) + abs(k - i), where abs(x) denotes the absolute value of x.
 *
 * Return an integer denoting the minimum possible distance of a good tuple. If no good tuples exist, return -1.
 *
 * [URL](https://leetcode.com/problems/minimum-distance-between-three-equal-elements-ii/)
 */
object MinimumDistanceBetweenThreeEqualElementsII {
    fun minimumDistance(nums: IntArray): Int {
        var max = Int.MIN_VALUE
        var min = Int.MAX_VALUE
        for (n in nums) {
            max = maxOf(max, n)
            min = minOf(min, n)
        }

        val distances = Array(max - min + 1) { IntArray(3) { -1 } }

        var result = Int.MAX_VALUE

        for (i in nums.indices) {
            val n = nums[i]

            val distance = distances[n - min]

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
        return 2 * (maxOf(arr[0], arr[1], arr[2]) - minOf(arr[0], arr[1], arr[2]))
    }
}
