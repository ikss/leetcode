package strings.medium

import java.util.*

/**
 * You are given a string s and an integer repeatLimit. Construct a new string repeatLimitedString using the characters
 * of s such that no letter appears more than repeatLimit times in a row. You do not have to use all characters from s.
 *
 * Return the lexicographically largest repeatLimitedString possible.
 *
 * A string a is lexicographically larger than a string b if in the first position where a and b differ,
 * string a has a letter that appears later in the alphabet than the corresponding letter in b. If the first
 * min(a.length, b.length) characters do not differ, then the longer string is the lexicographically larger one.
 *
 * [URL](https://leetcode.com/problems/construct-string-with-repeat-limit/)
 */
object ConstructStringWithRepeatLimit {
    fun repeatLimitedStringTreeMap(s: String, repeatLimit: Int): String {
        val map = TreeMap<Char, Int>()
        val result = StringBuilder()

        for (c in s) {
            map[c] = map.getOrDefault(c, 0) + 1
        }

        while (map.isNotEmpty()) {
            val last = map.lastEntry()
            var removed = false
            for (i in 0 until minOf(repeatLimit, last.value)) {
                result.append(last.key)
                map[last.key] = map[last.key]!! - 1
                if (map[last.key] == 0) {
                    map.remove(last.key)
                    removed = true
                }
            }
            if (!removed) {
                val prev = map.lowerEntry(last.key)
                if (prev == null) {
                    break
                }
                result.append(prev.key)
                map[prev.key] = map[prev.key]!! - 1
                if (map[prev.key] == 0) {
                    map.remove(prev.key)
                }
            }
        }

        return result.toString()
    }

    fun repeatLimitedStringArray(s: String, repeatLimit: Int): String {
        val array = IntArray(26)
        val result = StringBuilder()

        var last = -1
        for (c in s) {
            val index = c - 'a'
            array[index]++
            last = maxOf(last, index)
        }

        while (true) {
            for (i in 0 until minOf(repeatLimit, array[last])) {
                result.append('a' + last)
                array[last]--
            }
            if (array[last] > 0) {
                val prev = getPrevious(array, last)
                if (prev == last) {
                    break
                }
                result.append('a' + prev)
                array[prev]--
            } else {
                val prev = getPrevious(array, last)
                if (prev == last) {
                    break
                }
                last = prev
            }
        }

        return result.toString()
    }
    
    private fun getPrevious(array: IntArray, last: Int): Int {
        for (i in last - 1 downTo 0) {
            if (array[i] > 0) {
                return i
            }
        }
        return last
    }
}
