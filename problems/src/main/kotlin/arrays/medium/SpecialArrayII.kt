package arrays.medium

/**
 * An array is considered special if every pair of its adjacent elements contains two numbers with different parity.
 *
 * You are given an array of integer nums and a 2D integer matrix queries, where for `queries[i] = [fromi, toi]`
 * your task is to check that subarray `nums[fromi..toi]` is special or not.
 *
 * Return an array of booleans answer such that `answer[i]` is true if `nums[fromi..toi]` is special.
 *
 * [URL](https://leetcode.com/problems/special-array-ii/)
 */
object SpecialArrayII {
    fun isArraySpecialNaive(nums: IntArray, queries: Array<IntArray>): BooleanArray {
        val wrongIndex = ArrayList<Int>()

        for (i in 0 until nums.size - 1) {
            val first = nums[i] % 2
            val second = nums[i + 1] % 2
            if (first == second) {
                wrongIndex.add(i)
            }
        }
        val result = BooleanArray(queries.size)
        for (i in queries.indices) {
            val (start, end) = queries[i]
            var valid = true
            for (wrong in wrongIndex) {
                if (wrong < start) continue
                if (wrong > end) break
                if (wrong < end) {
                    valid = false
                    break
                }
            }
            if (valid) {
                result[i] = true
            }
        }
        return result
    }

    fun isArraySpecialPrefixSum(nums: IntArray, queries: Array<IntArray>): BooleanArray {
        val wrongIndexCount = IntArray(nums.size)

        for (i in 1 until nums.size) {
            val first = nums[i - 1] % 2
            val second = nums[i] % 2
            val wrong = if (first == second) 1 else 0
            wrongIndexCount[i] = wrongIndexCount[i - 1] + wrong
        }
        val result = BooleanArray(queries.size)
        for (i in queries.indices) {
            val (start, end) = queries[i]
            result[i] = wrongIndexCount[end] == wrongIndexCount[start]
        }
        return result
    }
}
