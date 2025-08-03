package arrays.hard

import java.util.*

/**
 * You are given a 0-indexed integer array nums consisting of 3 * n elements.
 *
 * You are allowed to remove any subsequence of elements of size exactly n from nums.
 * The remaining 2 * n elements will be divided into two equal parts:
 * * The first n elements belonging to the first part and their sum is sumfirst.
 * * The next n elements belonging to the second part and their sum is sumsecond.
 *
 * The difference in sums of the two parts is denoted as sumfirst - sumsecond.
 * * For example, if sumfirst = 3 and sumsecond = 2, their difference is 1.
 * * Similarly, if sumfirst = 2 and sumsecond = 3, their difference is -1.
 *
 * Return the minimum difference possible between the sums of the two parts after the removal of n elements.
 *
 * [URL](https://leetcode.com/problems/minimum-difference-in-sums-after-removal-of-elements/)
 */
object MinimumDifferenceInSumsAfterRemovalOfElements {

    fun minimumDifference(nums: IntArray): Long {
        val n3 = nums.size
        val n = n3 / 3
        val part1 = LongArray(n + 1)
        var sum = 0L

        // max heap (simulate with opposite numbers)
        val ql = PriorityQueue(Comparator { a: Int?, b: Int? -> b!! - a!! })
        for (i in 0..<n) {
            val num = nums[i]
            sum += num
            ql.add(num)
        }
        part1[0] = sum
        for (i in n..<n * 2) {
            sum += nums[i].toLong()
            ql.add(nums[i])
            sum -= ql.poll()!!.toLong()
            part1[i - (n - 1)] = sum
        }

        var part2 = 0L
        // min heap
        val qr = PriorityQueue<Int?>()
        for (i in n * 3 - 1 downTo n * 2) {
            val num = nums[i]
            part2 += num
            qr.add(num)
        }

        var result = part1[n] - part2
        for (i in n * 2 - 1 downTo n) {
            val num = nums[i]
            part2 += num
            qr.add(num)
            part2 -= qr.poll()!!
            result = minOf(result, part1[i - n] - part2)
        }
        return result
    }
}
