package arrays.easy

/**
 * You are given an array nums of non-negative integers. nums is considered special if there exists a number x
 * such that there are exactly x numbers in nums that are greater than or equal to x.
 *
 * Notice that x does not have to be an element in nums.
 *
 * Return x if the array is special, otherwise, return -1. It can be proven that if nums is special,
 * the value for x is unique.
 *
 * [URL](https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/)
 */
object SpecialArrayWithXElementsGreaterThanOrEqualX {
    fun specialArrayFreq(nums: IntArray): Int {
        val n = nums.size
        val freq = IntArray(n + 1)

        for (i in 0 until n) {
            val index = minOf(n, nums[i])
            freq[index]++
        }

        var numGreaterThanOrEqual = 0
        for (i in n downTo 1) {
            numGreaterThanOrEqual += freq[i]
            
            if (i == numGreaterThanOrEqual) {
                return i
            }
        }

        return -1
    }

    fun specialArraySimplified(nums: IntArray): Int {
        val n = nums.size
        nums.sort()
        for (x in 1..n) {
            if (nums[n - x] < x) continue
            if (n == x || nums[n - x - 1] < x) {
                return x
            }
        }
        return -1
    }
}
