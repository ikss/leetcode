package easy

import java.util.*

/**
 * You are given an array nums of n integers and two integers k and x.
 *
 * The x-sum of an array is calculated by the following procedure:
 *
 * * Count the occurrences of all elements in the array.
 * * Keep only the occurrences of the top x most frequent elements. If two elements have the same number of occurrences,
 * the element with the bigger value is considered more frequent.
 * * Calculate the sum of the resulting array.
 *
 * Note that if an array has less than x distinct elements, its x-sum is the sum of the array.
 *
 * Return an integer array answer of length n - k + 1 where `answer[i]` is the x-sum of the subarray `nums[i..i + k - 1]`.
 *
 * [URL](https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-i/)
 */
object FindXSumOfAllKLongSubarraysI {
    fun findXSum(nums: IntArray, k: Int, x: Int): IntArray {
        val result = IntArray(nums.size - k + 1)
        val numToFreq = HashMap<Int, Int>()
        val freqToNums = TreeMap<Int, TreeSet<Int>>()
        freqToNums[0] = TreeSet()

        for (i in nums.indices) {
            val n = nums[i]
            val oldFreq = numToFreq[n] ?: 0
            val newFreq = oldFreq + 1
            numToFreq[n] = newFreq
            freqToNums[oldFreq]!!.remove(n)
            freqToNums.computeIfAbsent(newFreq) { TreeSet() }.add(n)

            if (i >= k - 1) {
                result[i - k + 1] = getSum(freqToNums, x)

                val oldn = nums[i - k + 1]
                val oldFreqOldn = numToFreq[oldn]!!
                val newFreqOldn = oldFreqOldn - 1
                numToFreq[oldn] = newFreqOldn
                freqToNums[oldFreqOldn]!!.remove(oldn)
                freqToNums[newFreqOldn]!!.add(oldn)
            }
        }

        return result
    }

    private fun getSum(freqToNums: TreeMap<Int, TreeSet<Int>>, x: Int): Int {
        var x = x
        var sum = 0

        for ((freq, nums) in freqToNums.descendingMap()) {
            for (n in nums.descendingIterator()) {
                sum += n * freq
                x--
                if (x == 0) {
                    return sum
                }
            }
        }
        return sum
    }
}
