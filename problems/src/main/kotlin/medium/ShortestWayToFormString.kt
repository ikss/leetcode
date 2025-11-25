package medium

/**
 * A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of
 * the characters without disturbing the relative positions of the remaining characters.
 * (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 *
 * Given two strings source and target, return the minimum number of subsequences of source such that their
 * concatenation equals target. If the task is impossible, return -1.
 *
 * [URL](https://leetcode.com/problems/shortest-way-to-form-string/)
 */
object ShortestWayToFormString {

    fun shortestWay(source: String, target: String): Int {
        // Length of source
        val sourceLength = source.length

        // Next Occurrence of Character after Index
        val nextOccurrence = Array(sourceLength) { IntArray(26) { -1 } }

        // Base Case
        for (c in 0..25) {
            nextOccurrence[sourceLength - 1][c] = -1
        }
        nextOccurrence[sourceLength - 1][source[sourceLength - 1] - 'a'] = sourceLength - 1

        // Fill using the recurrence relation
        for (idx in sourceLength - 2 downTo 0) {
            for (c in 0..25) {
                nextOccurrence[idx][c] = nextOccurrence[idx + 1][c]
            }
            nextOccurrence[idx][source[idx] - 'a'] = idx
        }

        // Pointer to the current index in source
        var sourceIterator = 0

        // Number of times we need to iterate through source
        var count = 1

        // Find all characters of target in source
        for (idx in 0 until target.length) {

            // If the character is not present in source
            if (nextOccurrence[0][target[idx] - 'a'] == -1) {
                return -1
            }

            // If we have reached the end of source, or character is not in
            // source after source_iterator, loop back to beginning
            if (sourceIterator == sourceLength || nextOccurrence[sourceIterator][target[idx] - 'a'] == -1) {
                count++
                sourceIterator = 0
            }

            // Next occurrence of the character in source after source_iterator
            sourceIterator = nextOccurrence[sourceIterator][target[idx] - 'a'] + 1
        }

        // Return the number of times we need to iterate through source
        return count
    }
}