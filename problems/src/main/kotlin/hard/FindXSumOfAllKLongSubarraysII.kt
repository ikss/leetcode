package hard

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
 * [URL](https://leetcode.com/problems/find-x-sum-of-all-k-long-subarrays-ii/)
 */
object FindXSumOfAllKLongSubarraysII {
    private class Helper(private val x: Int) {
        private val comparator = Comparator<Pair<Int, Int>> { o1, o2 ->
            if (o1.first != o2.first) {
                o1.first - o2.first
            } else {
                o1.second - o2.second
            }
        }
        var result = 0L
            private set
        private val large = TreeSet<Pair<Int, Int>>(comparator)
        private val small = TreeSet<Pair<Int, Int>>(comparator)
        private val counts = HashMap<Int, Int>()

        fun insert(num: Int) {
            val prev = counts[num]
            if (prev != null && prev > 0) {
                internalRemove(prev to num)
            }
            val new = 1 + (prev ?: 0)
            counts[num] = 1 + (prev ?: 0)
            internalInsert(new to num)
        }

        fun remove(num: Int) {
            val prev = counts[num]!!
            internalRemove(prev to num)
            val new = prev - 1
            counts[num] = new
            if (new > 0) {
                internalInsert(new to num)
            }
        }

        private fun internalInsert(p: Pair<Int, Int>) {
            if (large.size < x || comparator.compare(p, large.first()) > 0) {
                result += p.first.toLong() * p.second
                large.add(p)
                if (large.size > x) {
                    val toRemove = large.first()
                    result -= toRemove.first.toLong() * toRemove.second
                    large.remove(toRemove)
                    small.add(toRemove)
                }
            } else {
                small.add(p)
            }
        }

        private fun internalRemove(p: Pair<Int, Int>) {
            if (comparator.compare(p, large.first()) >= 0) {
                result -= p.first.toLong() * p.second
                large.remove(p)
                if (!small.isEmpty()) {
                    val toAdd = small.last()
                    result += toAdd.first.toLong() * toAdd.second
                    small.remove(toAdd)
                    large.add(toAdd)
                }
            } else {
                small.remove(p)
            }
        }
    }

    fun findXSum(nums: IntArray, k: Int, x: Int): LongArray {
        val helper = Helper(x)
        val result = LongArray(nums.size - k + 1)

        for (i in nums.indices) {
            helper.insert(nums[i])
            if (i >= k) {
                helper.remove(nums[i - k])
            }
            if (i >= k - 1) {
                result[i - k + 1] = helper.result
            }
        }

        return result
    }
}
