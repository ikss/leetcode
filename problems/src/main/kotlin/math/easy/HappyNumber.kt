package math.easy

/**
 * Write an algorithm to determine if a number n is happy.
 *
 * A happy number is a number defined by the following process:
 *
 * * Starting with any positive integer, replace the number by the sum of the squares of its digits.
 * * Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
 * * Those numbers for which this process ends in 1 are happy.
 * Return true if n is a happy number, and false if not.
 *
 * [URL](https://leetcode.com/problems/happy-number/)
 */
object HappyNumber {

    fun isHappy(n: Int): Boolean {
        val nums = mutableSetOf<Int>()
        var sum = n
        while (sum !in nums) {
            nums.add(sum)
            sum = getSum(sum)
            if (sum == 1) return true
        }
        return false
    }

    private fun getSum(n: Int): Int {
        var sum = 0
        var local = n
        while (local > 9) {
            val digit = local % 10
            sum += digit * digit
            local /= 10
        }
        sum += local * local
        return sum
    }
}
