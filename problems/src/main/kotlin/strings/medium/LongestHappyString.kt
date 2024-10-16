package strings.medium

import java.util.*

/**
 * A string s is called happy if it satisfies the following conditions:
 * * s only contains the letters 'a', 'b', and 'c'.
 * * s does not contain any of "aaa", "bbb", or "ccc" as a substring.
 * * s contains at most a occurrences of the letter 'a'.
 * * s contains at most b occurrences of the letter 'b'.
 * * s contains at most c occurrences of the letter 'c'.
 *
 * Given three integers a, b, and c, return the longest possible happy string. If there are multiple longest happy
 * strings, return any of them. If there is no such string, return the empty string "".
 *
 * A substring is a contiguous sequence of characters within a string.
 *
 * [URL](https://leetcode.com/problems/longest-happy-string/)
 */
object LongestHappyString {
    fun longestDiverseString(a: Int, b: Int, c: Int): String {
        val result = StringBuilder()

        var prev = '_'
        var prevprev = '_'

        val queue = PriorityQueue<Pair<Int, Char>> { p1, p2 -> p2.first - p1.first }
        if (a > 0) queue.offer(a to 'a')
        if (b > 0) queue.offer(b to 'b')
        if (c > 0) queue.offer(c to 'c')

        while (queue.isNotEmpty()) {
            var greatest = queue.poll()
            if (greatest.second == prev && greatest.second == prevprev) {
                if (queue.isEmpty()) break
                val next = queue.poll()
                queue.offer(greatest)
                greatest = next
            }

            result.append(greatest.second)
            if (greatest.first > 1) {
                queue.offer(greatest.first - 1 to greatest.second)
            }
            prevprev = prev
            prev = greatest.second
        }

        return result.toString()
    }
}
