package strings.medium

import java.util.*

/**
 * You are given a string word containing lowercase English letters.
 *
 * Telephone keypads have keys mapped with distinct collections of lowercase English letters, which can be used to form
 * words by pushing them. For example, the key 2 is mapped with `["a","b","c"]`, we need to push the key one time to
 * type "a", two times to type "b", and three times to type "c" .
 *
 * It is allowed to remap the keys numbered 2 to 9 to distinct collections of letters.
 * The keys can be remapped to any amount of letters, but each letter must be mapped to exactly one key.
 * You need to find the minimum number of times the keys will be pushed to type the string word.
 *
 * Return the minimum number of pushes needed to type word after remapping the keys.
 *
 * An example mapping of letters to keys on a telephone keypad is given below.
 * Note that 1, *, #, and 0 do not map to any letters.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-ii/)
 */
object MinimumNumberOfPushesToTypeWordII {
    fun minimumPushes(word: String): Int {
        val freq = IntArray(26)

        for (c in word) {
            freq[c - 'a']++
        }

        val pq = PriorityQueue<Int> { n1, n2 -> n2 - n1 }

        for (f in freq) {
            if (f != 0) pq.offer(f)
        }

        var result = 0
        var index = 0

        while (pq.isNotEmpty()) {
            val f = pq.poll()

            result += (1 + index++ / 8) * f
        }

        return result
    }
}
