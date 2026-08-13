package hard

import java.util.*


/**
 * You are given a 0-indexed string s. You are also given a 0-indexed string queryCharacters of length k and
 * a 0-indexed array of integer indices queryIndices of length k, both of which are used to describe k queries.
 *
 * The ith query updates the character in s at index `queryIndices[i]` to the character `queryCharacters[i]`.
 *
 * Return an array lengths of length k where `lengths[i]` is the length of the longest substring of s consisting
 * of only one repeating character after the ith query is performed.
 *
 * [URL](https://leetcode.com/problems/longest-substring-of-one-repeating-character/)
 */
object LongestSubstringOfOneRepeatingCharacter {

    fun longestRepeating(s: String, queryCharacters: String, queryIndices: IntArray): IntArray {
        val n = s.length
        val arr = s.toCharArray()
        val segs = TreeMap<Int, Int>()
        val lens = TreeMap<Int, Int>()

        var i = 0
        while (i < n) {
            var j = i
            while (j < n && arr[j] == arr[i]) {
                j++
            }
            segs[i] = j - 1
            lens[j - i] = lens.getOrDefault(j - i, 0) + 1
            i = j
        }

        val k = queryIndices.size
        val ans = IntArray(k)

        for (q in 0..<k) {
            val pos = queryIndices[q]
            val ch = queryCharacters.get(q)

            if (arr[pos] != ch) {
                val l = segs.floorKey(pos)!!
                val r = segs[l]!!
                segs.remove(l)

                val oldLen = r - l + 1
                lens[oldLen] = lens[oldLen]!! - 1
                if (lens[oldLen] == 0) {
                    lens.remove(oldLen)
                }

                if (l <= pos - 1) {
                    segs[l] = pos - 1
                    val len1 = pos - l
                    lens[len1] = lens.getOrDefault(len1, 0)!! + 1
                }
                if (pos + 1 <= r) {
                    segs[pos + 1] = r
                    val len2 = r - pos
                    lens[len2] = lens.getOrDefault(len2, 0)!! + 1
                }

                var newL = pos
                var newR = pos

                val rightKey = segs.ceilingKey(pos + 1)
                if (rightKey != null && rightKey == pos + 1 && arr[pos + 1] == ch) {
                    val rightR: Int = segs.get(rightKey)!!
                    val rightLen = rightR - rightKey + 1
                    lens[rightLen] = lens[rightLen]!! - 1
                    if (lens[rightLen] == 0) {
                        lens.remove(rightLen)
                    }
                    newR = rightR
                    segs.remove(rightKey)
                }

                val leftKey = segs.floorKey(pos - 1)
                if (leftKey != null) {
                    val leftR: Int = segs[leftKey]!!
                    if (leftR == pos - 1 && arr[pos - 1] == ch) {
                        val leftLen = leftR - leftKey + 1
                        lens[leftLen] = lens[leftLen]!! - 1
                        if (lens[leftLen] == 0) {
                            lens.remove(leftLen)
                        }
                        newL = leftKey
                        segs.remove(leftKey)
                    }
                }

                segs[newL] = newR
                val newLen = newR - newL + 1
                lens[newLen] = lens.getOrDefault(newLen, 0) + 1
                arr[pos] = ch
            }

            ans[q] = lens.lastKey()!!
        }

        return ans
    }
}
