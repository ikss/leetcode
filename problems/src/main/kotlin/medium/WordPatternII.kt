package medium

/**
 * Given a pattern and a string s, return true if s matches the pattern.
 *
 * A string s matches a pattern if there is some bijective mapping of single characters to non-empty strings such that
 * if each character in pattern is replaced by the string it maps to, then the resulting string is s.
 * A bijective mapping means that no two characters map to the same string, and no character maps to two different strings.
 *
 * [URL](https://leetcode.com/problems/word-pattern-ii/)
 */
object WordPatternII {
    fun wordPatternMatch(pattern: String, s: String): Boolean {
        val mapTo = HashMap<Char, String>()
        val seenStrings = HashSet<String>()

        return traverse(pattern, s, 0, 0, mapTo, seenStrings)
    }

    private fun traverse(
        pattern: String,
        s: String,
        pstart: Int,
        sstart: Int,
        symbolMap: HashMap<Char, String>,
        seenStrings: HashSet<String>,
    ): Boolean {
        if (pstart == pattern.length && sstart == s.length) return true
        if (pstart >= pattern.length || sstart >= s.length) return false

        val c = pattern[pstart]
        if (c in symbolMap) {
            val mapping = symbolMap[c]!!
            return when {
                !isSame(mapping, s, sstart) -> false
                else -> traverse(pattern, s, pstart + 1, sstart + mapping.length, symbolMap, seenStrings)
            }
        }
        for (end in sstart + 1..s.length) {
            val substr = s.substring(sstart, end)
            if (seenStrings.contains(substr)) continue
            symbolMap[c] = substr
            seenStrings.add(substr)

            if (traverse(pattern, s, pstart + 1, sstart + substr.length, symbolMap, seenStrings)) {
                return true
            }
            symbolMap.remove(c)
            seenStrings.remove(substr)
        }
        return false
    }

    private fun isSame(mapping: String, s: String, sstart: Int): Boolean {
        var start = sstart
        for (c in mapping) {
            if (start >= s.length || c != s[start++]) return false
        }
        return true
    }
}