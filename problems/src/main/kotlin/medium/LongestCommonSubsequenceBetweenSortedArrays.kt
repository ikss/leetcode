package medium

/**
 * Given an array of integer arrays arrays where each `arrays[i]` is sorted in strictly increasing order,
 * return an integer array representing the longest common subsequence between all the arrays.
 *
 * A subsequence is a sequence that can be derived from another sequence by deleting some elements (possibly none)
 * without changing the order of the remaining elements.
 *
 * [URL](https://leetcode.com/problems/longest-common-subsequence-between-sorted-arrays/)
 */
object LongestCommonSubsequenceBetweenSortedArrays {
    fun longestCommonSubsequence(arrays: Array<IntArray>): List<Int> {
        val count = IntArray(101)
        for (arr in arrays) {
            for (n in arr) {
                count[n]++
            }
        }

        val result = ArrayList<Int>(count.count { it == arrays.size })

        for (i in count.indices) {
            if (count[i] == arrays.size) {
                result.add(i)
            }
        }

        return result
    }
}
