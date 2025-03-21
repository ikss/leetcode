package graphs.hard

import java.util.*


/**
 * There is a new alien language that uses the English alphabet. However, the order of the letters is unknown to you.
 *
 * You are given a list of strings words from the alien language's dictionary. Now it is claimed that the strings in
 * words are sorted lexicographically by the rules of this new language.
 *
 * If this claim is incorrect, and the given arrangement of string in words cannot correspond to any order of letters,
 * return "".
 *
 * Otherwise, return a string of the unique letters in the new alien language sorted in lexicographically increasing
 * order by the new language's rules. If there are multiple solutions, return any of them.
 *
 * [URL](https://leetcode.com/problems/alien-dictionary/)
 */
object AlienDictionary {
    fun alienOrder(words: Array<String>): String {
        val neighbours = HashMap<Char, ArrayList<Char>>()
        val indegree = IntArray(26) { -1 }
        for (word in words) {
            for (c in word) {
                indegree[c - 'a'] = 0
            }
        }
        for (i in 0 until words.size - 1) {
            val word1 = words[i]
            val word2 = words[i + 1]
            if (word1.length > word2.length && word1.startsWith(word2)) {
                return ""
            }
            for (j in 0 until minOf(word1.length, word2.length)) {
                if (word1[j] != word2[j]) {
                    neighbours.computeIfAbsent(word1[j]) { ArrayList() }.add(word2[j])
                    indegree[word2[j] - 'a']++
                    break
                }
            }
        }

        val result = StringBuilder()
        val queue = ArrayDeque<Char>()
        for (i in indegree.indices) {
            if (indegree[i] == 0) {
                queue.add('a' + i)
            }
        }
        while (queue.isNotEmpty()) {
            val c = queue.poll()
            result.append(c)

            for (neigh in neighbours[c] ?: emptyList()) {
                indegree[neigh - 'a']--

                if (indegree[neigh - 'a'] == 0) {
                    queue.add(neigh)
                }
            }
        }

        if (result.length < indegree.count { it >= 0 }) {
            return ""
        }
        return result.toString()
    }
}
