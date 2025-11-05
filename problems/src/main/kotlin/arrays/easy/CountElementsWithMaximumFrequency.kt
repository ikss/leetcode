package arrays.easy

/**
 * You are given an array nums consisting of positive integers.
 *
 * Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
 *
 * The frequency of an element is the number of occurrences of that element in the array.
 *
 * [URL](https://leetcode.com/problems/count-elements-with-maximum-frequency/)
 */
object CountElementsWithMaximumFrequency {
    fun maxFrequencyElementsMap(nums: IntArray): Int {
        val frequencies = HashMap<Int, Int>()
        var maxFreq = 0
        for (n in nums) {
            val newMax = frequencies.merge(n, 1, Int::plus)
            maxFreq = maxOf(maxFreq, newMax!!)
        }

        var result = 0
        for ((_, v) in frequencies) {
            if (v == maxFreq) {
                result += maxFreq
            }
        }
        return result
    }

    fun maxFrequencyElementsArray(nums: IntArray): Int {
        val frequencies = IntArray(101)
        var maxFreq = 0
        for (n in nums) {
            frequencies[n]++
            val newMax = frequencies[n]
            maxFreq = maxOf(maxFreq, newMax!!)
        }

        var result = 0
        for (v in frequencies) {
            if (v == maxFreq) {
                result += maxFreq
            }
        }
        return result
    }
}
