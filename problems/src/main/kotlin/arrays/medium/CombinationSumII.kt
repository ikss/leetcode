package arrays.medium

import java.util.*

/**
 * Given a collection of candidate numbers (candidates) and a target number (target),
 * find all unique combinations in candidates where the candidate numbers sum to target.
 *
 * Each number in candidates may only be used once in the combination.
 *
 * __Note:__ The solution set must not contain duplicate combinations.
 *
 * [URL](https://leetcode.com/problems/combination-sum-ii/)
 */
object CombinationSumII {
    fun combinationSum2(candidates: IntArray, target: Int): List<List<Int>> {
        val map = TreeMap<Int, Int>()
        for (c in candidates) {
            map.merge(c, 1, Integer::sum)
        }
        val result = ArrayList<List<Int>>()
        backtrack(map, result, target, 0, 0, ArrayList())
        return result
    }

    private fun backtrack(
        map: TreeMap<Int, Int>,
        result: ArrayList<List<Int>>,
        target: Int,
        curr: Int,
        prev: Int,
        comb: ArrayList<Int>,
    ) {
        if (curr == target) {
            result.add(comb.toList())
            return
        }

        for ((elem, counter) in map) {
            if (counter == 0 || prev > elem) continue
            if (curr > target - elem) break
            comb.add(elem)
            map[elem] = counter - 1

            backtrack(map, result, target, curr + elem, elem, comb)

            map[elem] = counter
            comb.removeAt(comb.size - 1)
        }
    }
}
