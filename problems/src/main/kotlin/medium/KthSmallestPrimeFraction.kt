package medium

import java.util.*

/**
 * You are given a sorted integer array arr containing 1 and prime numbers, where all the integers of arr are unique. You are also given an integer k.
 *
 * For every i and j where 0 <= i < j < arr.length, we consider the fraction `arr[i] / arr[j]`.
 *
 * Return the kth smallest fraction considered. Return your answer as an array of integers of size 2,
 * where `answer[0] == arr[i]` and `answer[1] == arr[j]`.
 *
 * [URL](https://leetcode.com/problems/k-th-smallest-prime-fraction/)
 */
object KthSmallestPrimeFraction {
    fun kthSmallestPrimeFraction(arr: IntArray, k: Int): IntArray {
        var k = k
        val pq = PriorityQueue<Pair<Double, Pair<Int, Int>>> { p1, p2 -> p1.first.compareTo(p2.first) }

        for (i in arr.indices) {
            pq.offer(arr[i].toDouble() / arr[arr.size - 1] to (i to arr.size - 1))
        }

        while (--k > 0) {
            var (numerator, denominator) = pq.poll().second
            denominator -= 1
            if (denominator <= numerator) continue
            pq.offer(arr[numerator].toDouble() / arr[denominator] to (numerator to denominator))
        }

        val (numerator, denominator) = pq.poll().second
        return intArrayOf(arr[numerator], arr[denominator])
    }
}
