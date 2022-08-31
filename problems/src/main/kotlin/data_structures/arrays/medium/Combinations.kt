package data_structures.arrays.medium

/**
 * Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].
 *
 * You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/combinations/)
 */
object Combinations {
    fun combine(n: Int, k: Int): List<List<Int>> =
        combineRecursive(n, k)

    private fun combineRecursive(n: Int, k: Int): MutableList<MutableList<Int>> {
        if (k > n) return mutableListOf()

        if (k == 0) {
            return mutableListOf(mutableListOf())
        }

        val result = combineRecursive(n - 1, k - 1)
        result.forEach {
            it.add(n)
        }
        result.addAll(combineRecursive(n - 1, k))
        return result
    }
}
