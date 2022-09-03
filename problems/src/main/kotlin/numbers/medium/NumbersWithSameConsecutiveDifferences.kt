package numbers.medium

/**
 * Return all non-negative integers of length n such that
 * the absolute difference between every two consecutive digits is k.
 *
 * Note that every number in the answer must not have leading zeros. For example, 01 has one leading zero and is invalid.
 *
 * You may return the answer in any order.
 *
 * [URL](https://leetcode.com/problems/integer-to-roman/)
 */
object NumbersWithSameConsecutiveDifferences {
    fun numsSameConsecDiffNaive(n: Int, k: Int): IntArray {
        val result = mutableListOf<Int>()

        val numbers = mutableListOf(
            mutableListOf(1), mutableListOf(2), mutableListOf(3),
            mutableListOf(4), mutableListOf(5), mutableListOf(6),
            mutableListOf(7), mutableListOf(8), mutableListOf(9)
        )
        generateNums(result, n, k, numbers)

        return result.toIntArray()
    }

    private fun generateNums(result: MutableList<Int>, n: Int, k: Int, numbers: MutableList<MutableList<Int>>) {
        val newNumbers = mutableListOf<MutableList<Int>>()
        for (nums in numbers) {
            if (nums.size == n) {
                result.add(nums.joinToString("").toInt())
                continue
            }
            val last = nums.last()
            if (last - k >= 0 && k != 0) {
                val copy = nums.toMutableList()
                copy.add(last - k)
                newNumbers.add(copy)
            }
            if (last + k < 10) {
                nums.add(last + k)
                newNumbers.add(nums)
            }
        }
        if (newNumbers.isEmpty()) return
        generateNums(result, n, k, newNumbers)
    }
}
