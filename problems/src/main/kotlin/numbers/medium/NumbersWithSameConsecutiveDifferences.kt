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
    fun numsSameConsecDiffRecursive(n: Int, k: Int): IntArray {
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

    fun numsSameConsecDiffOptimized(n: Int, k: Int): IntArray {
        if (n == 1) {
            return intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
        }
        var levelQueue = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
        for (level in 1 until n) {
            val nextLevelQueue = arrayListOf<Int>()
            for (num in levelQueue) {
                val tailDigit = num % 10
                if (tailDigit - k >= 0) {
                    nextLevelQueue.add(num * 10 + tailDigit - k)
                }
                if (tailDigit + k < 10 && k != 0) {
                    nextLevelQueue.add(num * 10 + tailDigit + k)
                }
            }
            levelQueue = nextLevelQueue
        }
        return levelQueue.toIntArray()
    }
}
