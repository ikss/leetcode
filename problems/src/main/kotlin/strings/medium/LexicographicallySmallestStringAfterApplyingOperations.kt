package strings.medium

/**
 * You are given a string s of even length consisting of digits from 0 to 9, and two integers a and b.
 *
 * You can apply either of the following two operations any number of times and in any order on s:
 *
 * * Add a to all odd indices of s (0-indexed). Digits post 9 are cycled back to 0. For example,
 * if s = "3456" and a = 5, s becomes "3951".
 * * Rotate s to the right by b positions. For example, if s = "3456" and b = 1, s becomes "6345".
 * Return the lexicographically smallest string you can obtain by applying the above operations any number of times on s.
 *
 * A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b
 * differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b. For example,
 * "0158" is lexicographically smaller than "0190" because the first position they differ is at the third letter,
 * and '5' comes before '9'.
 *
 * [URL](https://leetcode.com/problems/lexicographically-smallest-string-after-applying-operations/)
 */
object LexicographicallySmallestStringAfterApplyingOperations {
    fun findLexSmallestString(s: String, a: Int, b: Int): String {
        var res = s
        val n = s.length
        val s = s + s
        val g = gcd(b, n)

        var i = 0
        while (i < n) {
            val t = s.substring(i, i + n).toCharArray()
            add(t, n, a, 1)

            if (b % 2 != 0) {
                add(t, n, a, 0)
            }
            val tStr = String(t)
            if (tStr < res) {
                res = tStr
            }
            i += g
        }
        return res
    }

    fun add(t: CharArray, n: Int, a: Int, start: Int) {
        var minVal = 10
        var times = 0
        for (i in 0..9) {
            val added = ((t[start] - '0') + i * a) % 10
            if (added < minVal) {
                minVal = added
                times = i
            }
        }
        var i = start
        while (i < n) {
            t[i] = '0' + ((t[i] - '0') + times * a) % 10
            i += 2
        }
    }

    fun gcd(num1: Int, num2: Int): Int {
        var n1 = num1
        var n2 = num2
        while (n2 != 0) {
            val temp = n1
            n1 = n2
            n2 = temp % n2
        }
        return n1
    }
}
