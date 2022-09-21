package arrays.medium

/**
 * You are given an integer array nums and an array queries where `queries[i] = [vali, indexi]`.
 *
 * For each query i, first, apply `nums[indexi] = nums[indexi] + vali`, then print the sum of the even values of nums.
 *
 * Return an integer array answer where `answer[i]` is the answer to the ith query.
 *
 * [URL](https://leetcode.com/problems/sum-of-even-numbers-after-queries/)
 */
object SumOfEvenNumbersAfterQueries {
    fun sumEvenAfterQueries(nums: IntArray, queries: Array<IntArray>): IntArray {
        val result = IntArray(queries.size)
        var sum = 0

        for (n in nums) {
            if (n % 2 == 0) sum += n
        }

        for (i in queries.indices) {
            val (value, index) = queries[i]

            val oldNum = nums[index]
            if (oldNum % 2 == 0) sum -= oldNum

            val newNum = oldNum + value
            if (newNum % 2 == 0) sum += newNum
            nums[index] = newNum

            result[i] = sum
        }

        return result
    }
}
