package easy

/**
 * Given an array of integers nums, return the number of good pairs.
 *
 * A pair (i, j) is called good if `nums[i] == nums[j]` and i < j.
 *
 * [URL](https://leetcode.com/problems/number-of-good-pairs/)
 */
object NumberOfGoodPairs {
    fun numIdenticalPairs(nums: IntArray): Int {
        var result = 0

        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[i] == nums[j]) result++
            }
        }

        return result
    }

    fun numIdenticalPairsArray(nums: IntArray): Int {
        val array = IntArray(101)
        var result = 0

        for (i in nums) {
            result += (array[i]++)
        }

        return result
    }

    fun numIdenticalPairsMap(nums: IntArray): Int {
        val map = HashMap<Int, Int>()
        var result = 0

        for (i in nums) {
            result += map.merge(i, 1, Integer::sum)!! - 1
        }

        return result
    }
}
