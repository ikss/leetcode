package arrays.hard

/**
 * You are given an integer n which represents an array nums containing the numbers from 1 to n in order.
 * Additionally, you are given a 2D array conflictingPairs,
 * where `conflictingPairs[i] = [a, b]` indicates that a and b form a conflicting pair.
 *
 * Remove exactly one element from conflictingPairs. Afterward, count the number of non-empty subarrays of nums which
 * do not contain both a and b for any remaining conflicting pair [a, b].
 *
 * Return the maximum number of subarrays possible after removing exactly one conflicting pair.
 *
 * [URL](https://leetcode.com/problems/maximize-subarrays-after-removing-one-conflicting-pair/)
 */
object MaximizeSubarraysAfterRemovingOneConflictingPair {

    fun maxSubarrays(n: Int, conflictingPairs: Array<IntArray>): Long {
        val bMin1 = IntArray(n + 1) { Int.MAX_VALUE }
        val bMin2 = IntArray(n + 1) { Int.MAX_VALUE }
        for ((first, second) in conflictingPairs) {
            val (a, b) = if (first <= second) first to second else second to first
            if (bMin1[a] > b) {
                bMin2[a] = bMin1[a]
                bMin1[a] = b
            } else if (bMin2[a] > b) {
                bMin2[a] = b
            }
        }
        var result = 0L
        var ib1 = n
        var b2 = Int.MAX_VALUE
        val delCount = LongArray(n + 1)
        for (i in n downTo 1) {
            if (bMin1[ib1] > bMin1[i]) {
                b2 = minOf(b2, bMin1[ib1])
                ib1 = i
            } else {
                b2 = minOf(b2, bMin1[i])
            }
            result += minOf(bMin1[ib1], n + 1) - i
            delCount[ib1] += minOf(minOf(b2, bMin2[ib1]), n + 1) - minOf(bMin1[ib1], n + 1)
        }
        var maxDelete = 0L
        for (n in delCount) {
            maxDelete = maxOf(maxDelete, n)
        }
        return result + maxDelete
    }
}
