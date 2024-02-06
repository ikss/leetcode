package strings.medium

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 *
 * [URL](https://leetcode.com/problems/group-anagrams/)
 */
object GroupAnagrams {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if (strs.isEmpty()) return emptyList()

        val map = LinkedHashMap<String, ArrayList<String>>()
        for (s in strs) {
            val ca = CharArray(26)
            for (c in s) {
                ca[c - 'a']++
            }
            val keyStr = String(ca)
            map.computeIfAbsent(keyStr) { ArrayList() }.add(s)
        }
        return map.values.toList()
    }
}
