package strings.hard


/**
 * Given an integer n, your task is to count how many strings of length n can be formed under the following rules:
 *
 *  * Each character is a lower case vowel ('a', 'e', 'i', 'o', 'u')
 *  * Each vowel 'a' may only be followed by an 'e'.
 *  * Each vowel 'e' may only be followed by an 'a' or an 'i'.
 *  * Each vowel 'i' may not be followed by another 'i'.
 *  * Each vowel 'o' may only be followed by an 'i' or a 'u'.
 *  * Each vowel 'u' may only be followed by an 'a'.
 *  * Since the answer may be too large, return it modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/count-vowels-permutation/)
 */
object CountVowelsPermutation {
    private val a = 0
    private val e = 1
    private val i = 2
    private val o = 3
    private val u = 4
    private val MOD = 1_000_000_007

    fun countVowelPermutation(n: Int): Int {
        var n = n
        var dp = LongArray(5)
        var prevDP = LongArray(5) { 1L }
        while (n-- > 1) {
            dp[a] = (prevDP[e] + prevDP[i] + prevDP[u]) % MOD
            dp[e] = (prevDP[a] + prevDP[i]) % MOD
            dp[i] = (prevDP[e] + prevDP[o]) % MOD
            dp[o] = prevDP[i]
            dp[u] = (prevDP[i] + prevDP[o]) % MOD
            val tmp = dp
            dp = prevDP
            prevDP = tmp
        }
        return ((prevDP[a] + prevDP[e] + prevDP[i] + prevDP[o] + prevDP[u]) % MOD).toInt()
    }
}
