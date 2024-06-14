package arrays.medium

import java.util.*

/**
 * You are given an integer array nums. In one move, you can pick an index i where 0 <= i < nums.length
 * and increment `nums[i]` by 1.
 *
 * Return the minimum number of moves to make every value in nums unique.
 *
 * The test cases are generated so that the answer fits in a 32-bit integer.
 *
 * [URL](https://leetcode.com/problems/minimum-increment-to-make-array-unique/)
 */
object MinimumIncrementToMakeArrayUnique {
    fun minIncrementForUnique(nums: IntArray): Int {
        val counts = TreeMap<Int, Int>()

        for (n in nums) {
            counts.merge(n, 1, Int::plus)
        }

        var result = 0
        while (counts.isNotEmpty()){
            var (k, v) = counts.firstEntry()
            var move = 1
            while (v-- > 1) {
                counts.merge(k + move, 1, Int::plus)
                result += move++
            }
            counts.remove(k)
        }

        return result
    }
}