package arrays.medium

/**
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations
 * of candidates where the chosen numbers sum to target. You may return the combinations in any order.
 *
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
 * frequency
 *  of at least one of the chosen numbers is different.
 *
 * The test cases are generated such that the number of unique combinations that sum up to target is less than 150
 * combinations for the given input.
 *
 * [URL](https://leetcode.com/problems/combination-sum/)
 */
object CombinationSum {
    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        candidates.sort()

        val result = mutableSetOf<MutableList<Int>>()
        backtrack(candidates, target, mutableListOf(), 0, result)

        return result.toList()
    }

    private fun backtrack(
        candidates: IntArray,
        target: Int,
        current: MutableList<Int>,
        currIndex: Int,
        result: MutableSet<MutableList<Int>>,
    ) {
        if (target == 0) {
            result.add(ArrayList(current))
            return
        }
        if (target < 0) {
            return
        }
        for (i in currIndex until candidates.size) {
            if (target < candidates[i]) break
            current.add(candidates[i])
            backtrack(candidates, target - candidates[i], current, i, result)
            current.removeAt(current.size - 1)
        }
    }
}
