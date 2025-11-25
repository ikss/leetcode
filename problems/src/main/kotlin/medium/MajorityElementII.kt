package medium

/**
 * Given an integer array of size n, find all elements that appear more than `[n/3]` times.
 *
 * [URL](https://leetcode.com/problems/majority-element-ii/)
 */
object MajorityElementII {
    fun majorityElement(nums: IntArray): List<Int> {
        val result = ArrayList<Int>()

        var candidate1 = Int.MIN_VALUE
        var count1 = 0
        var candidate2 = Int.MIN_VALUE
        var count2 = 0

        for (n in nums) {
            if (n == candidate1) {
                count1++
            } else if (n == candidate2) {
                count2++
            } else if (count1 == 0) {
                candidate1 = n
                count1 = 1
            } else if (count2 == 0) {
                candidate2 = n
                count2 = 1
            } else {
                count1--
                count2--
            }
        }
        count1 = 0
        count2 = 0
        for (n in nums) {
            if (candidate1 == n) count1++
            else if (candidate2 == n) count2++
        }
        val threshold = nums.size / 3
        return buildList {
            if (count1 > threshold) add(candidate1)
            if (count2 > threshold) add(candidate2)
        }
    }
}
