package strings.medium

/**
 * Given a string s, sort it in decreasing order based on the frequency of the characters.
 * The frequency of a character is the number of times it appears in the string.
 *
 * Return the sorted string. If there are multiple answers, return any of them.
 *
 * [URL](https://leetcode.com/problems/sort-characters-by-frequency/)
 */
object SortCharactersByFrequency {
    fun frequencySort(s: String): String {
        return s.groupBy { it }
            .asSequence()
            .map { entry -> entry.key to entry.value.size }
            .sortedByDescending { it.second }
            .joinToString(separator = "") { it.first.toString().repeat(it.second) }
    }
}
