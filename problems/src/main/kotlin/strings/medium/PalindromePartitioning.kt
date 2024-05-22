package strings.medium

/**
 * Given a string s, partition s such that every substring of the partition is a palindrome
 * Return all possible palindrome partitioning of s.
 *
 * [URL](https://leetcode.com/problems/palindrome-partitioning/)
 */
object PalindromePartitioning {
    fun partition(s: String): List<List<String>> {
        val result = ArrayList<List<String>>()
        traverse(0, s, ArrayList(), result)
        return result
    }

    private fun traverse(start: Int, s: String, curr: ArrayList<String>, result: ArrayList<List<String>>) {
        if (start == s.length) {
            result.add(ArrayList(curr))
            return
        }
        for (i in start + 1..s.length) {
            val str = s.substring(start, i)
            if (isPalindrome(str)) {
                curr.add(str)
                traverse(i, s, curr, result)
                curr.removeAt(curr.size - 1)
            }
        }
    }

    private fun isPalindrome(s: String): Boolean {
        for (i in 0 until s.length / 2) {
            if (s[i] != s[s.length - i - 1]) {
                return false
            }
        }

        return true
    }
}