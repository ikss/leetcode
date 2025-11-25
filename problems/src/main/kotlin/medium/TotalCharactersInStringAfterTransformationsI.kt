package medium

/**
 * You are given a string s and an integer t, representing the number of transformations to perform.
 * In one transformation, every character in s is replaced according to the following rules:
 *
 * * If the character is 'z', replace it with the string "ab".
 * * Otherwise, replace it with the next character in the alphabet. For example, 'a' is replaced with 'b',
 * 'b' is replaced with 'c', and so on.
 *
 * Return the length of the resulting string after exactly t transformations.
 *
 * Since the answer may be very large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/total-characters-in-string-after-transformations-i/)
 */
object TotalCharactersInStringAfterTransformationsI {
    private const val MOD: Int = 1_000_000_007

    fun lengthAfterTransformations(s: String, t: Int): Int {
        var counts = IntArray(26)
        for (ch in s) {
            ++counts[ch - 'a']
        }
        for (rep in 0..<t) {
            val next = IntArray(26)
            next[0] = counts[25]
            next[1] = (counts[25] + counts[0]) % MOD
            for (i in 2..25) {
                next[i] = counts[i - 1]
            }
            counts = next
        }
        var result = 0
        for (i in 0..25) {
            result = (result + counts[i]) % MOD
        }
        return result
    }
}
