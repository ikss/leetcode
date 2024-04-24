package numbers.medium

/**
 * Given a list of non-negative integers nums, arrange them such that they form the largest number and return it.
 *
 * Since the result may be very large, so you need to return a string instead of an integer.
 *
 * [URL](https://leetcode.com/problems/largest-number/)
 */
object LargestNumber {
    fun largestNumber(nums: IntArray): String {
        val sorted = nums.map { it.toString() }
            .sortedWith(::compareNumbers)
        if (sorted[0] == "0") return "0"

        return sorted.joinToString("")
    }

    private fun compareNumbers(n1: String, n2: String): Int {
        if (n1 == n2) return 0

        return (n2 + n1).compareTo(n1 + n2)
    }
}