package medium


/**
 * Given a positive integer n, there exists a 0-indexed array called powers, composed of the minimum number of
 * powers of 2 that sum to n. The array is sorted in non-decreasing order, and there is only one way to form the array.
 *
 * You are also given a 0-indexed 2D integer array queries, where `queries[i] = [lefti, righti].
 * Each `queries[i]` represents a query where you have to find the product of all `powers[j]` with lefti <= j <= righti.
 *
 * Return an array answers, equal in length to queries, where `answers[i]` is the answer to the ith query.
 * Since the answer to the ith query may be too large, each `answers[i]` should be returned modulo 10^9 + 7.
 *
 * [URL](https://leetcode.com/problems/range-product-queries-of-powers/)
 */
object RangeProductQueriesOfPowers {

    fun productQueries(n: Int, queries: Array<IntArray>): IntArray {
        val MOD = 1_000_000_007
        val bins = getBins(n)

        val m = bins.size
        val results = Array(m) { IntArray(m) }
        for (i in 0..<m) {
            var cur: Long = 1
            for (j in i..<m) {
                cur = (cur * bins[j]) % MOD
                results[i][j] = cur.toInt()
            }
        }

        val ans = IntArray(queries.size)
        for (i in queries.indices) {
            val (left, right) = queries[i]
            ans[i] = results[left][right]
        }
        return ans
    }

    private fun getBins(n: Int): ArrayList<Int> {
        var n = n
        val bins = ArrayList<Int>()
        var rep = 1
        while (n > 0) {
            if (n % 2 == 1) {
                bins.add(rep)
            }
            n /= 2
            rep *= 2
        }
        return bins
    }
}