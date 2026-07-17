package hard

import data_structures.TreeNode
import java.util.*

/**
 * You are given an integer array nums of length n.
 *
 * Construct an array prefixGcd where for each index i:
 *
 * * Let mxi = max(nums[0], nums[1], ..., nums[i]).
 * * prefixGcd[i] = gcd(nums[i], mxi).
 *
 * After constructing prefixGcd:
 * * Sort prefixGcd in non-decreasing order.
 * * Form pairs by taking the smallest unpaired element and the largest unpaired element.
 * * Repeat this process until no more pairs can be formed.
 * * For each formed pair, compute the gcd of the two elements.
 * * If n is odd, the middle element in the prefixGcd array remains unpaired and should be ignored.
 *
 * Return an integer denoting the sum of the GCD values of all formed pairs.
 *
 * The term gcd(a, b) denotes the greatest common divisor of a and b.
 *
 * [URL](https://leetcode.com/problems/sum-of-gcd-of-formed-pairs/)
 */
object SumOfGCDOfFormedPairs {
    fun gcdSum(nums: IntArray): Long {
        val n = nums.size
        val prefixGcd = IntArray(nums.size)

        var runningMax = 0
        for (i in nums.indices) {
            runningMax = maxOf(runningMax, nums[i])
            prefixGcd[i] = gcd(runningMax, nums[i])
        }

        var sum = 0L
        prefixGcd.sort()

        for (i in 0 until n / 2) {
            sum += gcd(prefixGcd[i], prefixGcd[n - 1 - i])
        }

        return sum
    }

    private fun gcd(a: Int, b: Int): Int {
        var a = a
        var b = b

        while (b > 0) {
            val temp = a
            a = b
            b = temp % b
        }

        return a
    }
}
