package medium

import java.util.*

/**
 * You are given a 0-indexed array of positive integers nums and a positive integer limit.
 *
 * In one operation, you can choose any two indices i and j and swap `nums[i]` and `nums[j]` if `|nums[i] - nums[j]| <= limit`.
 *
 * Return the lexicographically smallest array that can be obtained by performing the operation any number of times.
 *
 * An array a is lexicographically smaller than an array b if in the first position where a and b differ,
 * array a has an element that is less than the corresponding element in b.
 * For example, the array [2,10,3] is lexicographically smaller than the array `[10,2,3]`
 * because they differ at index 0 and 2 < 10.
 *
 * [URL](https://leetcode.com/problems/make-lexicographically-smallest-array-by-swapping-elements/)
 */
object MakeLexicographicallySmallestArrayBySwappingElements {
    fun lexicographicallySmallestArray(nums: IntArray, limit: Int): IntArray {
        val numsSorted = nums.sortedArray()

        val numToGroup = HashMap<Int, Int>()
        val groupToList = HashMap<Int, ArrayDeque<Int>>()

        var currGroup = 0
        for (i in nums.indices) {
            if (i > 0 && Math.abs(numsSorted[i] - numsSorted[i - 1]) > limit) {
                currGroup++
            }

            numToGroup[numsSorted[i]] = currGroup

            groupToList.computeIfAbsent(currGroup) { ArrayDeque() }.offer(numsSorted[i])
        }

        for (i in nums.indices) {
            val num = nums[i]
            val group = numToGroup[num]!!
            nums[i] = groupToList[group]!!.pop()
        }

        return nums
    }

}