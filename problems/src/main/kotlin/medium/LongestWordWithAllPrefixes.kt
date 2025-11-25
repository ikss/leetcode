package medium

/**
 * Given an array of strings words, find the longest string in words such that every prefix of it is also in words.
 *
 * For example, let words = ["a", "app", "ap"]. The string "app" has prefixes "ap" and "a", all of which are in words.
 * Return the string described above. If there is more than one string with the same length,
 * return the lexicographically smallest one, and if no string exists, return "".
 *
 * [URL](https://leetcode.com/problems/longest-word-with-all-prefixes/)
 */
object LongestWordWithAllPrefixes {
    fun longestWord(words: Array<String>): String {
        val set = HashSet<String>()

        for (w in words) {
            set.add(w)
        }

        val sorted = words.sortedWith { w1, w2 ->
            if (w1.length == w2.length) {
                w1.compareTo(w2)
            } else w2.length - w1.length
        }

        for (w in sorted) {
            var found = true
            for (i in w.length - 1 downTo 1) {
                val substr = w.substring(0, i)
                if (substr !in set) {
                    found = false
                    break
                }
            }
            if (found) return w
        }
        return ""
    }
}