package easy

/**
 * Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
 *
 * Return the kth positive integer that is missing from this array.
 *
 * [URL](https://leetcode.com/problems/kth-missing-positive-number/)
 */
object KthMissingPositiveNumber {
    fun findKthPositiveNaive(arr: IntArray, k: Int): Int {
        var prev = arr[0]
        var missing = prev - 1
        if (missing >= k) {
            return k
        }
        for (n in arr) {
            if (prev < n - 1) {
                missing += n - prev - 1
                if (missing >= k) {
                    return n - (missing - k) - 1
                }
            }
            prev = n
        }

        return arr[arr.size - 1] + k - missing
    }

    // LeetCode comment with detailed description
    // https://leetcode.com/problems/kth-missing-positive-number/solutions/779999/java-c-python-o-logn/comments/811118
    fun findKthPositiveBinarySearch(arr: IntArray, k: Int): Int {
        var left = 0
        var right = arr.size

        while (left < right) {
            val candidate = (left + right) / 2
            if (arr[candidate] - candidate <= k) {
                left = candidate + 1
            } else {
                right = candidate
            }
        }

        return left + k
    }
}