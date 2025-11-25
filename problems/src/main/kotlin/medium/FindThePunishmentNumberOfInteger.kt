package medium

/**
 * Given a positive integer n, return the punishment number of n.
 *
 * The punishment number of n is defined as the sum of the squares of all integers i such that:
 * * 1 <= i <= n
 * * The decimal representation of i * i can be partitioned into contiguous substrings such that the sum of the integer
 * values of these substrings equals i.
 *
 * [URL](https://leetcode.com/problems/find-the-punishment-number-of-an-integer/)
 */
object FindThePunishmentNumberOfInteger {

    fun canPartition(num: Int, target: Int): Boolean {
        // Invalid partition found
        if (target < 0 || num < target) {
            return false
        }

        // Valid partition found
        if (num == target) {
            return true
        }

        // Recursively check all partitions for a valid partition
        return (canPartition(num / 10, target - (num % 10)) ||
                canPartition(num / 100, target - (num % 100)) ||
                canPartition(num / 1000, target - (num % 1000))
                )
    }

    fun punishmentNumber(n: Int): Int {
        var result = 0

        // Iterate through numbers in range [1, n]
        for (currentNum in 1..n) {
            val squareNum = currentNum * currentNum

            // Check if valid partition can be found and add squared number if so
            if (canPartition(squareNum, currentNum)) {
                result += squareNum
            }
        }
        return result
    }

}