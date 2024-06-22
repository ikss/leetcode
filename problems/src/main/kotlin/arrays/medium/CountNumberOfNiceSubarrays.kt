package arrays.medium

/**
 * Given an array of integers nums and an integer k.
 * A continuous subarray is called nice if there are k odd numbers on it.
 *
 * Return the number of nice sub-arrays.
 */
object CountNumberOfNiceSubarrays {
    fun numberOfSubarrays(nums: IntArray, k: Int): Int {
        var result = 0
        var currSum = 0
        val map = hashMapOf(0 to 1)

        for (i in nums.indices) {
            currSum += nums[i] % 2
            map[currSum - k]?.let {
                result += it
            }

            map.merge(currSum, 1, Int::plus)
        }

        return result
    }
}