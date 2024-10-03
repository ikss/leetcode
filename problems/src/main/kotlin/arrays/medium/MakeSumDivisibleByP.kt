package arrays.medium


/**
 * Given an array of positive integers nums, remove the smallest subarray (possibly empty)
 * such that the sum of the remaining elements is divisible by p. It is not allowed to remove the whole array.
 *
 * Return the length of the smallest subarray that you need to remove, or -1 if it's impossible.
 *
 * A subarray is defined as a contiguous block of elements in the array.
 *
 * [URL](https://leetcode.com/problems/make-sum-divisible-by-p/)
 */
object MakeSumDivisibleByP {
    fun minSubarray(nums: IntArray, p: Int): Int {
        val n = nums.size
        var totalSum = 0

        for (num in nums) {
            totalSum = (totalSum + num) % p
        }

        val target = totalSum % p
        if (target == 0) {
            return 0
        }

        val modMap = HashMap<Int, Int>()
        modMap[0] = -1
        var currentSum = 0
        var result = n

        for (i in 0 until n) {
            currentSum = (currentSum + nums[i]) % p

            val needed = (currentSum - target + p) % p

            modMap[needed]?.let {
                result = minOf(result, i - it)
            }
            modMap[currentSum] = i
        }

        return if (result == n) -1 else result
    }
}
