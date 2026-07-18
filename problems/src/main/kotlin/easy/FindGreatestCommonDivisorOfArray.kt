package easy

/**
 * Given an integer array nums, return the greatest common divisor of the smallest number and largest number in nums.
 *
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * [URL](https://leetcode.com/problems/find-greatest-common-divisor-of-array/)
 */
object FindGreatestCommonDivisorOfArray {
    fun findGCD(nums: IntArray): Int {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE

        for (n in nums) {
            min = minOf(min, n)
            max = maxOf(max, n)
        }

        return gcd(max, min)
    }

    private fun gcd(a: Int, b: Int): Int {
        var a = a
        var b = b

        while (b != 0) {
            val temp = a
            a = b
            b = temp % b
        }

        return a
    }
}