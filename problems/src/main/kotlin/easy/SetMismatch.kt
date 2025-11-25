package easy

/**
 * You have a set of integers s, which originally contains all the numbers from 1 to n.
 * Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set,
 * which results in repetition of one number and loss of another number.
 *
 * You are given an integer array nums representing the data status of this set after the error.
 *
 * Find the number that occurs twice and the number that is missing and return them in the form of an array.
 *
 * [URL](https://leetcode.com/problems/set-mismatch/)
 */
object SetMismatch {
    fun findErrorNumsAdditionalArray(nums: IntArray): IntArray {
        val result = mutableListOf<Int>()
        val arr = IntArray(nums.size) { 1 }

        for (n in nums) {
            arr[n - 1]--
            if (arr[n - 1] == -1) {
                result.add(n)
            }
        }
        for (i in arr.indices) {
            if (arr[i] == 1) {
                result.add(i + 1)
            }
        }

        return result.toIntArray()
    }

    fun findErrorNumsSquareSum(nums: IntArray): IntArray {
        var diff = 0
        var squareDiff = 0

        for (i in nums.indices) {
            diff += i + 1 - nums[i]
            squareDiff += (i + 1) * (i + 1) - nums[i] * nums[i]
        }
        val sum = squareDiff / diff
        return intArrayOf((sum - diff) / 2, (sum + diff) / 2)
    }
}
