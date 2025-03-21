package arrays.medium

/**
 * You are given an integer array nums. This array contains n elements, where exactly n - 2 elements are special
 * numbers. One of the remaining two elements is the sum of these special numbers, and the other is an outlier.
 *
 * An outlier is defined as a number that is neither one of the original special numbers nor the element representing
 * the sum of those numbers.
 *
 * Note that special numbers, the sum element, and the outlier must have distinct indices, but may share the same value.
 *
 * Return the largest potential outlier in nums.
 *
 * [URL](https://leetcode.com/problems/identify-the-largest-outlier-in-an-array/)
 */
object IdentifyTheLargestOutlierInAnArray {
    fun getLargestOutlier(nums: IntArray): Int {
        var sum = 0L
        val numsCount = HashMap<Int, Int>()
        for (n in nums) {
            sum += n
            numsCount[n] = numsCount.getOrDefault(n, 0) + 1
        }

        var result = Int.MIN_VALUE

        for (n in nums) {
            val sumWithoutOutlier = sum - n
            if (sumWithoutOutlier % 2 != 0L) continue

            val halfSum = (sumWithoutOutlier / 2).toInt()
            val count = if (halfSum == n) 1 else 0

            if (numsCount.getOrDefault(halfSum, 0) > count) {
                result = maxOf(result, n)
            }
        }

        return result
    }
}
