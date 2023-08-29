package arrays.medium

/**
 * Given two integers n and k, return all possible combinations of k numbers out of the range [1, n].
 *
 * You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/combinations/)
 */
object Combinations {
    fun combineRecursive(n: Int, k: Int): List<List<Int>> {
        return recursive(n, k)
    }

    private fun recursive(n: Int, k: Int): MutableList<MutableList<Int>> {
        if (k > n) return mutableListOf()

        if (k == 0) {
            return mutableListOf(mutableListOf())
        }

        val result = recursive(n - 1, k - 1)
        result.forEach {
            it.add(n)
        }
        result.addAll(recursive(n - 1, k))
        return result
    }

    fun combineBacktrack(n: Int, k: Int): List<List<Int>> {
        val result = ArrayList<ArrayList<Int>>()
        backtrack(n, k, 1, result, ArrayList())
        return result
    }

    private fun backtrack(n: Int, k: Int, start: Int, result: ArrayList<ArrayList<Int>>, curList: ArrayList<Int>) {
        if (curList.size == k) {
            result.add(ArrayList(curList))
            return
        }
        for (i in start..n) {
            curList.add(i)
            backtrack(n, k, i + 1, result, curList)
            curList.removeAt(curList.size - 1)
        }
    }
}