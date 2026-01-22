package easy

/**
 * Given an array nums, you can perform the following operation any number of times:
 * * Select the adjacent pair with the minimum sum in nums. If multiple such pairs exist, choose the leftmost one.
 * * Replace the pair with their sum.
 *
 * Return the minimum number of operations needed to make the array non-decreasing.
 *
 * An array is said to be non-decreasing if each element is greater than or equal to its previous element (if it exists).
 *
 * [URL](https://leetcode.com/problems/minimum-pair-removal-to-sort-array-i/)
 */
object MinimumPairRemovalToSortArrayI {
    fun minimumPairRemoval(nums: IntArray): Int {
        var result = 0
        var size = nums.size

        while (!isSorted(nums, size)) {
            var sum = nums[0] + nums[1]
            var index = 0

            for (i in 1 until size - 1) {
                val left = nums[i]
                val right = nums[i + 1]

                if (left + right < sum) {
                    sum = left + right
                    index = i
                }
            }
            nums[index] = sum
            size--

            for (i in index + 1 until size) {
                nums[i] = nums[i + 1]
            }

            result++
        }

        return result
    }

    private fun isSorted(arr: IntArray, size: Int): Boolean {
        if (size == 1) return true
        for (i in 0 until size - 1) {
            if (arr[i] > arr[i + 1]) {
                return false
            }
        }
        return true
    }
}
