package arrays.medium

/**
 * The frequency of an element is the number of times it occurs in an array.
 *
 * You are given an integer array nums and an integer k. In one operation, you can choose an index of nums and
 * increment the element at that index by 1.
 *
 * Return the maximum possible frequency of an element after performing at most k operations.
 *
 * [URL](https://leetcode.com/problems/frequency-of-the-most-frequent-element/)
 */
object FrequencyOfTheMostFrequentElement {
    fun maxFrequency(nums: IntArray, k: Int): Int {
        nums.sort()
        var left = 0
        var curr = 0L

        for (right in nums.indices) {
            val target = nums[right]
            curr += target.toLong()
            if ((right - left + 1) * target - curr > k) {
                curr -= nums[left]
                left++
            }
        }

        return nums.size - left
    }
}