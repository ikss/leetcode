package hard

/**
 * Given an m x n board of characters and a list of strings words, return all words on the board.
 *
 * Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or
 * vertically neighboring. The same letter cell may not be used more than once in a word.
 *
 * [URL](https://leetcode.com/problems/word-search-ii/)
 */
object WordSearchII {
    private val DIRECTIONS_X = intArrayOf(0, 0, 1, -1)
    private val DIRECTIONS_Y = intArrayOf(1, -1, 0, 0)

    fun findWords(board: Array<CharArray>, words: Array<String>): List<String> {
        val root = Trie()
        for (word in words) {
            root.add(word)
        }

        val res = mutableListOf<String>()

        for (i in board.indices) {
            for (j in board[i].indices) {
                val node = root.getChild(board[i][j]) ?: continue
                findWords(board, i, j, node, res)
            }
        }
        return res
    }

    private fun findWords(board: Array<CharArray>, bx: Int, by: Int, node: Trie, res: MutableList<String>) {
        node.word?.let {
            res.add(it)
            node.word = null
        }
        val c = board[bx][by]
        board[bx][by] = 'z' + 1
        for (i in 0 until 4) {
            val x = bx + DIRECTIONS_X[i]
            val y = by + DIRECTIONS_Y[i]
            if (x >= 0 && x < board.size && y >= 0 && y < board[x].size) {
                val trie = node.getChild(board[x][y]) ?: continue
                findWords(board, x, y, trie, res)
            }
        }
        board[bx][by] = c
    }

    private class Trie {
        private val children = Array<Trie?>(27) { null }
        var word: String? = null

        fun add(word: String) {
            var node = this
            for (c in word) {
                node = node.getAndSetChildDefault(c)
            }
            node.word = word
        }

        fun getChild(c: Char) = children[c - 'a']

        private fun getAndSetChildDefault(c: Char): Trie {
            val index = c - 'a'
            return children[index] ?: Trie().also { children[index] = it }
        }
    }
}