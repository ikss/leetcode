package math.medium

/**
 * We build a table of n rows (1-indexed). We start by writing 0 in the 1st row. Now in every subsequent row,
 * we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
 * * For example, for n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row is 0110.
 *
 * Given two integer n and k, return the kth (1-indexed) symbol in the nth row of a table of n rows.
 *
 * [URL](https://leetcode.com/problems/k-th-symbol-in-grammar/)
 */
object KThSymbolInGrammar {
    fun kthGrammar(n: Int, k: Int): Int {
        val count = (k - 1).countOneBits()
        return if (count % 2 == 0) 0 else 1
    }

    fun kthGrammarOwn(n: Int, k: Int): Int {
        var k = k - 1
        var inverted = false

        while (k > 0) {
            if (k % 2 != 0) inverted = !inverted
            k /= 2
        }
        return if (inverted) 1 else 0
    }
}
