package strings.medium

/**
 * A wonderful string is a string where at most one letter appears an odd number of times.
 *
 * For example, "ccjjc" and "abab" are wonderful, but "ab" is not.
 * Given a string word that consists of the first ten lowercase English letters ('a' through 'j'),
 * return the number of wonderful non-empty substrings in word.
 * If the same substring appears multiple times in word, then count each occurrence separately.
 *
 * A substring is a contiguous sequence of characters in a string.
 *
 * [URL](https://leetcode.com/problems/number-of-wonderful-substrings/)
 */
object NumberOfWonderfulSubstrings {
    fun wonderfulSubstrings(word: String): Long {
        val n = word.length

        // Create the frequency map
        // Key = bitmask, Value = frequency of bitmask key
        val freq = HashMap<Int, Int>()

        // The empty prefix can be the smaller prefix, which is handled like this
        freq[0] = 1

        var mask = 0
        var res = 0L
        for (i in 0 until n) {
            val c = word[i]

            // Flip the parity of the c-th bit in the running prefix mask
            mask = mask xor (1 shl c - 'a')
            
            // Count smaller prefixes that create substrings with no odd occurring letters
            res += freq.getOrDefault(mask, 0)

            // Increment value associated with mask by 1
            freq[mask] = freq.getOrDefault(mask, 0) + 1

            // Loop through every possible letter that can appear an odd number of times in a substring
            for (oddChar in 0..9) {
                res += freq.getOrDefault(mask xor (1 shl oddChar), 0)
            }
        }
        return res
    }
}