package hard

/**
 * You are given a string s and a positive integer k.
 *
 * Select a set of non-overlapping substrings from the string s that satisfy the following conditions:
 * * The length of each substring is at least k.
 * * Each substring is a palindrome.
 *
 * Return the maximum number of substrings in an optimal selection.
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/maximum-number-of-non-overlapping-palindrome-substrings/)
 */
object MaximumNumberOfNonoverlappingPalindromeSubstrings {
    fun maxPalindromes(s: String, k: Int): Int {
        if (k == 1) return s.length

        val cache = HashMap<Int, Int>()

        return traverse(0, s, k, cache)
    }

    private fun traverse(i: Int, s: String, k: Int, cache: HashMap<Int, Int>): Int {
        cache[i]?.let {
            return it
        }

        var result = 0

        for (start in i..s.length - k) {
            for (end in start + k - 1 until s.length) {
                if (end - start + 1 < k) break
                if (isPalindrome(start, end, s)) {
                    result = maxOf(result, 1 + traverse(end + 1, s, k, cache))
                    break
                }
            }
        }
        cache[i] = result

        return result
    }

    private fun isPalindrome(start: Int, end: Int, s: String): Boolean {
        val half = (end - start) / 2
        for (i in 0..half) {
            if (s[start + i] != s[end - i]) {
                return false
            }
        }
        return true
    }
}
