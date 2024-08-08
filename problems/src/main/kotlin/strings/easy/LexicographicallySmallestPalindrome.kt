package strings.easy

/**
 * You are given a string s consisting of lowercase English letters, and you are allowed to perform operations on it.
 * In one operation, you can replace a character in s with another lowercase English letter.
 *
 * Your task is to make s a palindrome with the minimum number of operations possible. If there are multiple palindromes
 * that can be made using the minimum number of operations, make the lexicographically smallest one.
 *
 * A string a is lexicographically smaller than a string b (of the same length) if in the first position where a and b
 * differ, string a has a letter that appears earlier in the alphabet than the corresponding letter in b.
 *
 * Return the resulting palindrome string.
 *
 * [URL](https://leetcode.com/problems/lexicographically-smallest-palindrome/)
 */
object LexicographicallySmallestPalindrome {
    fun makeSmallestPalindrome(s: String): String {
        val n = s.length
        val arr = s.toCharArray()

        for (i in 0 until n / 2) {
            if (arr[i] == arr[n - i - 1]) {
                continue
            }

            if (arr[i] < arr[n - i - 1]) {
                arr[n - i - 1] = arr[i]
            } else {
                arr[i] = arr[n - i - 1]
            }
        }
        return String(arr)
    }
}
