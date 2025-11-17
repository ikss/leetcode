package arrays.easy

/**
 * Given an binary array nums and an integer k,
 * return true if all 1's are at least k places away from each other, otherwise return false.
 *
 * [URL](https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/)
 */
object CheckIfAll1sAreAtLeastLengthKPlacesAway {
    fun kLengthApart(nums: IntArray, k: Int): Boolean {
        var prev = -1
        for (i in nums.indices) {
            if (nums[i] != 1) continue

            if (prev == -1 || i - prev > k) {
                prev = i
            } else {
                return false
            }
        }
        return true
    }
}
