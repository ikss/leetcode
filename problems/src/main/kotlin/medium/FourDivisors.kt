package medium

/**
 * Given an integer array nums, return the sum of divisors of the integers in that array that have exactly four
 * divisors. If there is no such integer in the array, return 0.
 *
 * [URL](https://leetcode.com/problems/four-divisors/)
 */
object FourDivisors {
    fun sumFourDivisors(nums: IntArray): Int {
        var result = 0

        val divisors = HashMap<Int, List<Int>>()
        for (n in nums) {
            val divs = divisors.computeIfAbsent(n) { getDivisors(n) }
            if (divs.size == 4) {
                result += divs.sum()
            }
        }

        return result
    }

    private fun getDivisors(n: Int): List<Int> {
        if (n == 1) return listOf(1)
        val divisors = ArrayList<Int>()

        for (i in 1..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                val second = n / i
                divisors.add(i)
                if (i != second) {
                    divisors.add(second)
                }
            }
            if (divisors.size > 4) break
        }

        return divisors
    }
}
