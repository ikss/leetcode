package easy

/**
 * Given a list of dominoes, `dominoes[ i ] = [a, b]` is equivalent to `dominoes[ j ] = [c, d]` if and only if either
 * (a == c and b == d), or (a == d and b == c) - that is, one domino can be rotated to be equal to another domino.
 *
 * Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length,
 * and `dominoes[ i ]` is equivalent to `dominoes[ j ]`.
 *
 * [URL](https://leetcode.com/problems/number-of-equivalent-domino-pairs/)
 */
object NumberOfEquivalentDominoPairs {
    fun numEquivDominoPairs(dominoes: Array<IntArray>): Int {
        val unique = IntArray(91)

        var result = 0
        for ((f, s) in dominoes) {
            val value = if (f <= s) f * 9 + s else s * 9 + f

            result += unique[value]
            unique[value]++
        }

        return result
    }
}
