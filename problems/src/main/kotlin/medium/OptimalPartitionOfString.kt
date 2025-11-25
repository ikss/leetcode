package medium

/**
 * Given a string s, partition the string into one or more substrings such that the characters in each substring
 * are unique. That is, no letter appears in a single substring more than once.
 *
 * Return the minimum number of substrings in such a partition.
 *
 * Note that each character should belong to exactly one substring in a partition.
 *
 * [URL](https://leetcode.com/problems/optimal-partition-of-string/)
 */
object OptimalPartitionOfString {
    fun partitionStringNaive(s: String): Int {
        var hash = IntArray(26)
        var result = 1

        for (c in s) {
            val index = c - 'a'
            if (hash[index] > 0) {
                result++
                hash = IntArray(26)
            }
            hash[index]++
        }
        return result
    }

    fun partitionStringOptimized(s: String): Int {
        val seen = IntArray(26) { -1 }
        var result = 1
        var substringStart = 0

        for (i in s.indices) {
            val index = s[i] - 'a'
            if (seen[index] >= substringStart) {
                result++
                substringStart = i
            }
            seen[index] = i
        }
        return result
    }
}
