package hard

/**
 * Given a string s and an integer k, partition s into k substrings such that the letter changes needed to make each
 * substring a semi-palindrome are minimized.
 *
 * Return the minimum number of letter changes required.
 *
 * A semi-palindrome is a special type of string that can be divided into palindromes based on a repeating pattern.
 * To check if a string is a semi-palindrome:
 * 1. Choose a positive divisor d of the string's length. d can range from 1 up to, but not including, the string's length.
 * For a string of length 1, it does not have a valid divisor as per this definition, since the only divisor is its length, which is not allowed.
 * 2. For a given divisor d, divide the string into groups where each group contains characters from the string that
 * follow a repeating pattern of length d. Specifically, the first group consists of characters at positions 1, 1 + d,
 * 1 + 2d, and so on; the second group includes characters at positions 2, 2 + d, 2 + 2d, etc.
 * 3. The string is considered a semi-palindrome if each of these groups forms a palindrome.
 *
 * [URL](https://leetcode.com/problems/minimum-changes-to-make-k-semi-palindromes/)
 */
object MinimumChangesToMakeKSemiPalindromes {
    fun minimumChanges(s: String, k: Int): Int {
        val n = s.length
        val inf = Int.MAX_VALUE / 2
        val cost = Array(n + 1) { IntArray(n + 1) { inf } }  // cost[i][j]: changes to make s[i:j] a semi-palindrome
        var d = 1
        while (2 * d <= n) {
            var length = 2 * d
            while (length <= n) {
                // every length that d divides, with d < length
                var i = 0
                var j = length
                while (j <= n) {
                    cost[i][j] = minOf(cost[i][j], peel(s, i, j, d))
                    i++
                    j++
                }
                length += d
            }
            d++
        }

        var best = IntArray(n + 1) { inf } // best[j]: the fewest changes for s[:j] cut into the pieces placed so far
        best[0] = 0
        for (pieces in 1..<k) {  // every piece but the last
            val next = IntArray(n + 1) { inf }
            for (j in 2 * pieces..n - 2 * (k - pieces)) {  // 2 letters for each piece, placed or still to come
                next[j] = extend(best, cost, j)
            }
            best = next
        }
        return extend(best, cost, n) // the last piece ends at n
    }

    private fun peel(s: String, i: Int, j: Int, d: Int): Int {
        // s[i:j] in blocks of d: the outer pair of blocks, then the inside
        var i = i
        var j = j
        var changes = 0
        while (j - i > d) {
            for (t in 0..<d) {
                if (s[i + t] != s[j - d + t]) {
                    changes++
                }
            }
            i += d
            j -= d
        }
        return changes
    }

    private fun extend(
        best: IntArray,
        cost: Array<IntArray>,
        j: Int,
    ): Int {  // the newest piece s[i:j] starts at an old cut i and gets at least 2 letters
        return (0..j - 2).minOf { i -> best[i] + cost[i][j] }
    }
}
