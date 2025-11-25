package medium

/**
 * Given a string s, return the maximum number of unique substrings that the given string can be split into.
 *
 * You can split string s into any list of non-empty substrings, where the concatenation of the substrings forms the
 * original string. However, you must split the substrings such that all of them are unique.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/split-a-string-into-the-max-number-of-unique-substrings/)
 */
object SplitStringIntoTheMaxNumberOfUniqueSubstrings {
    fun maxUniqueSplit(s: String): Int {
        val seen = HashSet<String>()
        return backtrack(s, 0, seen)
    }

    private fun backtrack(s: String, start: Int, seen: HashSet<String>): Int {
        if (start == s.length) return 0

        var maxCount = 0

        for (end in start + 1..s.length) {
            val substring = s.substring(start, end)
            if (seen.add(substring)) {
                maxCount = maxOf(maxCount, 1 + backtrack(s, end, seen))
                seen.remove(substring)
            }
        }
        return maxCount
    }
}