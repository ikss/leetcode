package medium

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
            if (!isPalindrome(s, start, i)) continue
            val str = s.substring(start, i)
            curr.add(str)
            traverse(i, s, curr, result)
            curr.removeAt(curr.size - 1)
        }
    }

    fun isPalindrome(s: String, start: Int, end: Int): Boolean {
        var start = start
        var end = end - 1
        while (start < end) {
            if (s[start++] != s[end--]) return false
        }
        return true
    }
}