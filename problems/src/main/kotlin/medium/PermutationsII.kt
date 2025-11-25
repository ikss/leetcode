package medium

/**
 * Given a collection of numbers, nums, that might contain duplicates,
 * return all possible unique permutations in any order.
 *
 * [URL](https://leetcode.com/problems/permutations-ii/)
 */
object PermutationsII {

    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val results = ArrayList<List<Int>>()

        // count the occurrence of each number
        val counter = HashMap<Int, Int>()
        for (num in nums) {
            counter.merge(num, 1, Integer::sum)
        }
        val comb = ArrayList<Int>()
        backtrack(comb, nums.size, counter, results)
        return results
    }

    private fun backtrack(
        comb: ArrayList<Int>,
        size: Int,
        counter: HashMap<Int, Int>,
        results: ArrayList<List<Int>>,
    ) {
        if (comb.size == size) {
            // make a deep copy of the resulting permutation,
            // since the permutation would be backtracked later.
            results.add(comb.toList())
            return
        }
        for ((num, count) in counter) {
            if (count == 0) continue
            // add this number into the current combination
            comb.add(num)
            counter[num] = count - 1

            // continue the exploration
            backtrack(comb, size, counter, results)

            // revert the choice for the next exploration
            comb.removeAt(comb.size - 1)
            counter[num] = count
        }
    }
}
