package arrays.medium

/**
 * You are given two arrays with positive integers arr1 and arr2.
 *
 * A prefix of a positive integer is an integer formed by one or more of its digits, starting from its leftmost digit.
 * For example, 123 is a prefix of the integer 12345, while 234 is not.
 *
 * A common prefix of two integers a and b is an integer c, such that c is a prefix of both a and b. For example,
 * 5655359 and 56554 have a common prefix 565 while 1223 and 43456 do not have a common prefix.
 *
 * You need to find the length of the longest common prefix between all pairs of integers (x, y) such that x belongs
 * to arr1 and y belongs to arr2.
 *
 * Return the length of the longest common prefix among all pairs. If no common prefix exists among them, return 0.
 *
 * [URL](https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/)
 */
object FindTheLengthOfTheLongestCommonPrefix {
    private class Trie(val digit: Int) {
        var children = Array<Trie?>(10) { null }
    }

    fun longestCommonPrefix(arr1: IntArray, arr2: IntArray): Int {
        if (arr1.isEmpty() || arr2.isEmpty()) return 0

        val (small, big) = if (arr1.size <= arr2.size) arr1 to arr2 else arr2 to arr1

        val trie = buildTrie(small)

        var result = 0
        for (num in big) {
            result = maxOf(result, findCommonPrefix(num, trie))
        }

        return result
    }

    private fun findCommonPrefix(num: Int, trie: Trie): Int {
        val digits = numberToDigits(num)

        var result = 0
        var curr = trie
        for (d in digits.reversed()) {
            val next = curr?.children?.get(d)
            if (next != null) {
                curr = next
                result++
            } else {
                break
            }
        }

        return result
    }

    private fun buildTrie(nums: IntArray): Trie {
        val head = Trie(-1)

        for (n in nums) {
            var curr = head
            val digits = numberToDigits(n)
            for (d in digits.reversed()) {
                val new = if (curr.children[d] == null) {
                    Trie(d).also { curr.children[d] = it }
                } else {
                    curr.children[d]!!
                }
                curr = new
            }
        }
        return head
    }
    private fun numberToDigits(n: Int): List<Int> {
        val digits = ArrayList<Int>()
        var n = n
        while (n > 0) {
            digits.add(n % 10)
            n /= 10
        }
        return digits
    }
}
