package medium

/**
 * Given a string s, remove duplicate letters so that every letter appears once and only once.
 * You must make sure your result is the smallest in lexicographical order among all possible results.
 *
 * [URL](https://leetcode.com/problems/remove-duplicate-letters/)
 */
object RemoveDuplicateLetters {
    fun removeDuplicateLetters(s: String): String {
        val indices = IntArray(26)
        for (i in s.indices) {
            indices[s[i] - 'a'] = i
        }
        val visited = HashSet<Char>()
        val result = StringBuilder()

        for (i in s.indices) {
            val char = s[i]
            if (!visited.add(char)) continue

            while (result.isNotEmpty() && char < result.last() && i < indices[result.last() - 'a']) {
                visited.remove(result.last())
                result.setLength(result.length - 1)
            }
            result.append(char)
        }

        return result.toString()
    }
}
