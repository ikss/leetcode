package strings.hard


/**
 * A transformation sequence from word beginWord to word endWord using a dictionary wordList is a sequence of words
 * beginWord -> s1 -> s2 -> ... -> sk such that:
 *
 * * Every adjacent pair of words differs by a single letter.
 * * Every si for 1 <= i <= k is in wordList. Note that beginWord does not need to be in wordList.
 * * sk == endWord
 *
 * Given two words, beginWord and endWord, and a dictionary wordList,return the number of words in the shortest
 * transformation sequence from beginWord to endWord, or 0 if no such sequence exists.
 *
 * [URL](https://leetcode.com/problems/word-ladder/)
 */
object WordLadder {
    fun ladderLength(beginWord: String, endWord: String, wordList: List<String>): Int {
        val l = beginWord.length
        val combos = hashMapOf<String, MutableList<String>>()
        val forms = hashMapOf<String, List<String>>()
        for (word in wordList + beginWord) {
            val transformations = (0 until l).map { word.substring(0, it) + '*' + word.substring(it + 1) }
            forms[word] = transformations
            transformations.forEach { combos.getOrPut(it) { arrayListOf() }.add(word) }
        }

        val visited = hashSetOf<String>()
        val queue = java.util.ArrayDeque<Pair<String, Int>>()
        queue.offer(beginWord to 1)

        while (queue.isNotEmpty()) {
            val (word, level) = queue.poll()
            for (form in forms.getOrDefault(word, emptyList())) {
                for (neighbour in combos[form]!!) {
                    if (neighbour == endWord) {
                        return level + 1
                    }
                    if (visited.add(neighbour)) {
                        queue.offer(neighbour to level + 1)
                    }
                }
            }
        }

        return 0
    }
}