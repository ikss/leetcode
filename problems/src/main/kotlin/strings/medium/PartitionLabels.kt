package strings.medium

/**
 * You are given a string s. We want to partition the string into as many parts as possible so that each letter appears
 * in at most one part. For example, the string "ababcc" can be partitioned into `["abab", "cc"]`,
 * but partitions such as `["aba", "bcc"]` or `["ab", "ab", "cc"]` are invalid.
 *
 * Note that the partition is done so that after concatenating all the parts in order, the resultant string should be s.
 *
 * Return a list of integers representing the size of these parts.
 *
 * [URL](https://leetcode.com/problems/partition-labels/)
 */
object PartitionLabels {
    fun partitionLabels(s: String): List<Int> {
        val maxIndex = IntArray(26)

        for (i in s.indices) {
            maxIndex[s[i] - 'a'] = i
        }

        val result = ArrayList<Int>()
        var curr = 0

        while (curr < s.length) {
            val char = s[curr] - 'a'
            var max = maxIndex[char]
            val start = curr

            while (curr < max) {
                curr++
                max = maxOf(max, maxIndex[s[curr] - 'a'])
            }
            result.add(curr - start + 1)
            curr = max + 1
        }

        return result
    }
}