package strings.hard

/**
 * A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words
 * beginWord -> s1 -> s2 -> ... -> sk such that:
 *
 * * Every adjacent pair of words differs by a single letter.
 * * Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
 * * sk == endWord
 *
 * Given two words, beginWord and endWord, and a dictionary wordList, return all the shortest transformation sequences
 * from beginWord to endWord, or an empty list if no such sequence exists. Each sequence should be returned as a list
 * of the words [beginWord, s1, s2, ..., sk].
 *
 * [URL](https://leetcode.com/problems/word-ladder-ii/)
 */
object WordLadderII {
    fun findLadders(beginWord: String, endWord: String, wordList: List<String>): List<List<String>> {
        val dict = wordList.toSet()
        val res: MutableList<List<String>> = ArrayList()
        if (!dict.contains(endWord)) {
            return res
        }
        val map = getChildren(beginWord, endWord, dict)

        val path = mutableListOf(beginWord)
        findLadders(beginWord, endWord, map, res, path)
        return res
    }

    private fun findLadders(
        beginWord: String,
        endWord: String,
        map: Map<String, MutableList<String>>,
        res: MutableList<List<String>>,
        path: MutableList<String>,
    ) {
        if (beginWord == endWord) {
            res.add(ArrayList(path))
        }
        val nextList = map[beginWord] ?: return
        for (next in nextList) {
            path.add(next)
            findLadders(next, endWord, map, res, path)
            path.removeLast()
        }
    }

    private fun getChildren(beginWord: String, endWord: String, dict: Set<String>): Map<String, MutableList<String>> {
        val map = mutableMapOf<String, MutableList<String>>()
        var start = mutableSetOf(beginWord)
        var end = mutableSetOf(endWord)
        val visited = mutableSetOf<String>()
        var found = false
        var isBackward = false

        while (start.isNotEmpty() && !found) {
            if (start.size > end.size) {
                val tem = start
                start = end
                end = tem
                isBackward = !isBackward
            }
            val newStart = mutableSetOf<String>()
            for (cur in start) {
                visited.add(cur)
                for (next in getNext(cur, dict)) {
                    if (visited.contains(next) || start.contains(next)) {
                        continue
                    }
                    if (end.contains(next)) {
                        found = true
                    }
                    newStart.add(next)
                    val parent = if (isBackward) next else cur
                    val child = if (isBackward) cur else next
                    val list = map.computeIfAbsent(parent) { ArrayList() }
                    list.add(child)
                }
            }
            start = newStart
        }
        return map
    }

    private fun getNext(cur: String, dict: Set<String>): List<String> {
        val res = mutableListOf<String>()
        val chars = cur.toCharArray()
        for (i in chars.indices) {
            val old = chars[i]
            var c = 'a'
            while (c <= 'z') {
                if (c == old) {
                    c++
                    continue
                }
                chars[i] = c
                val next = String(chars)
                if (dict.contains(next)) {
                    res.add(next)
                }
                c++
            }
            chars[i] = old
        }
        return res
    }
}
