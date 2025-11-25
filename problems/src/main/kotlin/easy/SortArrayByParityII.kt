package easy

/**
 * Given an array of integers nums, half of the integers in nums are odd, and the other half are even.
 *
 * Sort the array so that whenever `nums[i]` is odd, i is odd, and whenever `nums[i]` is even, i is even.
 *
 * Return any answer array that satisfies this condition.
 *
 * [URL](https://leetcode.com/problems/sort-array-by-parity-ii/)
 */
object SortArrayByParityII {
    fun sortArrayByParityII(nums: IntArray): IntArray {
        val result = IntArray(nums.size)
        var evenIndex = 0
        var oddIndex = 1
        
        for (n in nums) {
            if (n % 2 == 0) {
                result[evenIndex] = n
                evenIndex += 2
            } else {
                result[oddIndex] = n
                oddIndex += 2
            }
        }

        return result
    }
}