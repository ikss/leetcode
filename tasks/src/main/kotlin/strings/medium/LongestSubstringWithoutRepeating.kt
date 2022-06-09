package strings.medium


/**
 * Given a string s, find the length of the longest substring without repeating characters.
 *
 * [URL](https://leetcode.com/problems/longest-substring-without-repeating-characters/)
 */
object LongestSubstringWithoutRepeating {

    fun lengthOfLongestSubstring(s: String): Int {
        var l = 0
        var r = 0
        val n: Int = s.length
        var len = 0

        val h = HashSet<Char>()
        val a: CharArray = s.toCharArray()

        while (r < n) {
            if (h.contains(a[r])) {
                h.remove(a[l])
                l++
            } else {
                h.add(a[r])
                len = Math.max(len, h.size)
                r++
            }
        }

        return len
    }

    fun lengthOfLongestSubstringWOSet(s: String): Int {
        var result = 0
        val cache = IntArray(256)
        var left = 0
        for (right in s.indices) {
            val char = s[right].code
            left = Math.max(left, cache[char])
            cache[char] = right + 1
            result = Math.max(result, right - left + 1)
        }
        return result
    }
}
