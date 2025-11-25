package hard

/**
 * You may recall that an array arr is a mountain array if and only if:
 * * arr.length >= 3
 * * There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
 * * * `arr[0] < arr[1] < ... < arr[i - 1] < arr[i]`
 * * * `arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`
 * 
 * Given an integer array nums, return the minimum number of elements to remove to make nums a mountain array.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-removals-to-make-mountain-array/)
 */
object MinimumNumberOfRemovalsToMakeMountainArray {

    fun minimumMountainRemovals(nums: IntArray): Int {
        val n = nums.size

        val lisLength = IntArray(n) { 1 }
        val ldsLength = IntArray(n) { 1 }

        for (i in 0 until n) {
            for (j in i - 1 downTo 0) {
                if (nums[i] > nums[j]) {
                    lisLength[i] = maxOf(lisLength[i], lisLength[j] + 1)
                }
            }
        }

        for (i in n - 1 downTo 0) {
            for (j in i + 1 until n) {
                if (nums[i] > nums[j]) {
                    ldsLength[i] = maxOf(ldsLength[i], ldsLength[j] + 1)
                }
            }
        }

        var result = Int.MAX_VALUE
        for (i in 0 until n) {
            if (lisLength[i] > 1 && ldsLength[i] > 1) {
                result = minOf(result, n - lisLength[i] - ldsLength[i] + 1)
            }
        }

        return result
    }
}
