package easy

/**
 * You are given an integer array nums. You need to ensure that the elements in the array are distinct. To achieve this, you can perform the following operation any number of times:
 *
 * Remove 3 elements from the beginning of the array. If the array has fewer than 3 elements, remove all remaining elements.
 * Note that an empty array is considered to have distinct elements. Return the minimum number of operations needed to make the elements in the array distinct.
 *
 * [URL](https://leetcode.com/problems/minimum-number-of-operations-to-make-elements-in-array-distinct/)
 */
object MinimumNumberOfOperationsToMakeElementsInArrayDistinct {
    fun minimumOperations(nums: IntArray): Int {
        var right = 0
        var left = 0

        val counts = HashMap<Int, Int>()
        var result = 0
        while (left < nums.size) {
            val n = nums[left]
            counts[n] = counts.getOrDefault(n, 0) + 1
            while (counts[n]!! > 1) {
                for (i in 0 until 3) {
                    if (right + 1 >= nums.size) {
                        break
                    }
                    val toRemove = nums[right++]
                    if (counts.getOrDefault(toRemove, 0) > 0) {
                        counts[toRemove] = counts[toRemove]!! - 1
                    }
                }
                result++
            }
            left = maxOf(left + 1, right)
        }
        return result
    }

    fun minimumOperationsLastDuplicate(nums: IntArray): Int {
        var lastDuplicate = -1
        val map = HashMap<Int, Int>()

        for (i in nums.indices) {
            val n = nums[i]
            if (n in map) {
                lastDuplicate = maxOf(map[n]!!, lastDuplicate)
                map[n] = i
            } else {
                map[n] = i
            }
        }

        return if (lastDuplicate == -1) 0 else (lastDuplicate / 3 + 1)
    }
}
