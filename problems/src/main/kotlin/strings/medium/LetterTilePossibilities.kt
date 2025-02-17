package strings.medium

/**
 * You have n  tiles, where each tile has one letter `tiles[i]` printed on it.
 *
 * Return the number of possible non-empty sequences of letters you can make using the letters printed on those tiles.
 *
 * [URL](https://leetcode.com/problems/letter-tile-possibilities/)
 */
object LetterTilePossibilities {
    private val factorials = IntArray(8) { 1 }

    init {
        for (i in 1 until factorials.size) {
            factorials[i] = factorials[i - 1] * i
        }
    }

    fun numTilePossibilitiesCombinatorics(tiles: String): Int {
        val counts = IntArray(26)

        for (n in tiles) {
            counts[n - 'A']++
        }

        return countRecursive(counts, 0)
    }

    private fun countRecursive(counts: IntArray, curr: Int): Int {
        val sum = counts.sum()
        if (sum == 0) return 0
        var temp = factorials[sum]

        for (c in counts) {
            if (c == 0) continue
            temp /= factorials[c]
        }
        var result = temp

        for (i in curr until counts.size) {
            if (counts[i] == 0) continue
            counts[i]--
            result += countRecursive(counts, i)
            counts[i]++
        }
        return result
    }

    fun numTilePossibilitiesDfs(tiles: String): Int {
        val counts = IntArray(26)

        for (n in tiles) {
            counts[n - 'A']++
        }

        return countDfs(counts)
    }

    private fun countDfs(counts: IntArray): Int {
        var result = 0

        for (i in counts.indices) {
            if (counts[i] == 0) continue
            counts[i]--
            result += 1 + countDfs(counts)
            counts[i]++
        }
        return result
    }
    
}
