package arrays.hard

/**
 * Given a string n representing an integer, return the closest integer (not including itself), which is a palindrome.
 * If there is a tie, return the smaller one.
 *
 * The closest is defined as the absolute difference minimized between two integers.
 *
 * [URL](https://leetcode.com/problems/count-of-smaller-numbers-after-self/)
 */
object FindTheClosestPalindrome {

    fun nearestPalindromic(n: String): String {
        val len = n.length
        val mid = if (len % 2 == 0) len / 2 - 1 else len / 2
        val firstHalf = n.substring(0, mid + 1).toLong()
        val possibilities = ArrayList<Long>(5)

        possibilities.add(halfToPalindrome(firstHalf, len % 2 == 0))
        possibilities.add(halfToPalindrome(firstHalf + 1, len % 2 == 0))
        possibilities.add(halfToPalindrome(firstHalf - 1, len % 2 == 0))
        possibilities.add(Math.pow(10.0, len - 1.toDouble()).toLong() - 1)
        possibilities.add(Math.pow(10.0, len.toDouble()).toLong() + 1)

        // Find the palindrome with minimum difference, and minimum value.
        var diff = Long.MAX_VALUE
        var result = 0L
        val nl = n.toLong()
        for (cand in possibilities) {
            if (cand == nl) continue
            if (Math.abs(cand - nl) < diff) {
                diff = Math.abs(cand - nl)
                result = cand
            } else if (Math.abs(cand - nl) == diff) {
                result = minOf(result, cand)
            }
        }

        return result.toString()
    }

    private fun halfToPalindrome(left: Long, even: Boolean): Long {
        val num = StringBuilder()
        num.append(left)

        var len = num.length
        if (!even) {
            len -= 1
        }
        for (i in len - 1 downTo 0) {
            num.append(num[i])
        }
        return num.toString().toLong()
    }
}
