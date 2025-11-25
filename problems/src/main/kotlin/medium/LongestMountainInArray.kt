package medium

/**
 * You may recall that an array arr is a mountain array if and only if:
 *
 * * arr.length >= 3
 * * There exists some index i (0-indexed) with 0 < i < arr.length - 1 such that:
 *     * `arr[0] < arr[1] < ... < arr[i - 1] < arr[i]`
 *     * `arr[i] > arr[i + 1] > ... > arr[arr.length - 1]`
 *
 * Given an integer array arr, return the length of the longest subarray, which is a mountain. Return 0 if there is no mountain subarray.
 *
 * [URL](https://leetcode.com/problems/longest-mountain-in-array/)
 */
object LongestMountainInArray {
    fun longestMountain(arr: IntArray): Int {
        val size = arr.size
        var ans = 0
        var base = 0
        while (base < size) {
            var end = base
            // if base is a left-boundary
            if (end + 1 < size && arr[end] < arr[end + 1]) {
                // set end to the peak of this potential mountain
                while (end + 1 < size && arr[end] < arr[end + 1]) end++
                // if end is really a peak...
                if (end + 1 < size && arr[end] > arr[end + 1]) {
                    // set end to the right-boundary of mountain
                    while (end + 1 < size && arr[end] > arr[end + 1]) end++
                    // record candidate answer
                    ans = maxOf(ans, end - base + 1)
                }
            }
            base = maxOf(end, base + 1)
        }
        return ans
    }
}
