package hard

import java.util.*

/**
 * Given a string s and an integer k, rearrange s such that the same characters are at least distance
 * k from each other. If it is not possible to rearrange the string, return an empty string "".
 *
 * [URL](https://leetcode.com/problems/rearrange-string-k-distance-apart/)
 */
object RearrangeStringKDistanceApart {
    fun rearrangeString(s: String, k: Int): String {
        val map = HashMap<Char, Int>()

        for (c in s) {
            map[c] = map.getOrDefault(c, 0) + 1
        }

        val queue = PriorityQueue(compareByDescending<Pair<Char, Int>> { it.second }.thenComparing({ it.first }) )

        for (e in map) {
            queue.offer(e.key to e.value)
        }

        val result = StringBuilder()
        val busy = LinkedList<Triple<Char, Int, Int>>()
        while (result.length != s.length) {
            val index = result.length
            if (busy.isNotEmpty() && (index - busy.peek().third) >= k) {
                val q = busy.remove()
                queue.offer(Pair(q.first, q.second))
            }

            if (queue.isEmpty()) {
                return ""
            }

            val (currChar, currCount) = queue.poll()
            result.append(currChar)

            if (currCount > 1) {
                busy.add(Triple(currChar, currCount - 1, index))
            }
        }

        return result.toString()
    }
}
