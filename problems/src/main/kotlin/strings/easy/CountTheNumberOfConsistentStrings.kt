package strings.easy

/**
 * You are given a string allowed consisting of distinct characters and an array of strings words.
 * A string is consistent if all characters in the string appear in the string allowed.
 *
 * Return the number of consistent strings in the array words.
 *
 * [URL](https://leetcode.com/problems/count-the-number-of-consistent-strings/)
 */
object CountTheNumberOfConsistentStrings {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        val set = HashSet<Char>()

        for (c in allowed) {
            set.add(c)
        }

        var result = 0

        for (w in words) {
            var consistent = true
            for (c in w) {
                if (c !in set) {
                    consistent = false
                    break
                }
            }
            if (consistent) result++
        }

        return result
    }
}
