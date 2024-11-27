package arrays.medium

import java.util.*


/**
 * You are given an integer array arr. From some starting index, you can make a series of jumps.
 * The (1st, 3rd, 5th, ...) jumps in the series are called odd-numbered jumps, and the (2nd, 4th, 6th, ...)
 * jumps in the series are called even-numbered jumps. Note that the jumps are numbered, not the indices.
 *
 * You may jump forward from index i to index j (with i < j) in the following way:
 *
 * * During odd-numbered jumps (i.e., jumps 1, 3, 5, ...), you jump to the index j such that `arr[i] <= arr[j] and arr[j]`
 * is the smallest possible value. If there are multiple such indices j, you can only jump to the smallest such index j.
 * * During even-numbered jumps (i.e., jumps 2, 4, 6, ...), you jump to the index j such that `arr[i] >= arr[j] and arr[j]`
 * is the largest possible value. If there are multiple such indices j, you can only jump to the smallest such index j.
 * * It may be the case that for some index i, there are no legal jumps.
 *
 * A starting index is good if, starting from that index, you can reach the end of the array (index arr.length - 1) by
 * jumping some number of times (possibly 0 or more than once).
 *
 * Return the number of good starting indices.
 *
 * [URL](https://leetcode.com/problems/odd-even-jump/)
 */
object OddEvenJump {
    fun oddEvenJumps(arr: IntArray): Int {
        val n = arr.size
        var res = 1
        val higher = BooleanArray(n)
        val lower = BooleanArray(n)
        higher[n - 1] = true
        lower[n - 1] = true
        val map = TreeMap<Int, Int>()

        map[arr[n - 1]] = n - 1
        for (i in n - 2 downTo 0) {
            val hi = map.ceilingEntry(arr[i])
            if (hi != null) {
                higher[i] = lower[hi.value]
                if (higher[i]) {
                    res++
                }
            }
            val lo = map.floorEntry(arr[i])
            if (lo != null) {
                lower[i] = higher[lo.value]
            }
            map[arr[i]] = i
        }
        return res
    }
}
