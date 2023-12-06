package numbers.easy

/**
 * Hercy wants to save money for his first car. He puts money in the Leetcode bank every day.
 *
 * He starts by putting in $1 on Monday, the first day. Every day from Tuesday to Sunday, he will put in $1 more than
 * the day before. On every subsequent Monday, he will put in $1 more than the previous Monday.
 * Given n, return the total amount of money he will have in the Leetcode bank at the end of the nth day.
 *
 * [URL](https://leetcode.com/problems/calculate-money-in-leetcode-bank/)
 */
object CalculateMoneyInLeetcodeBank {
    fun totalMoney(n: Int): Int {
        val fullWeeks = n / 7
        val first = 28
        val last = 28 + (fullWeeks - 1) * 7

        var result = fullWeeks * (first + last) / 2

        val daysLeft = n - fullWeeks * 7

        if (daysLeft > 0) {
            result += daysLeft * (daysLeft + 1) / 2 + daysLeft * fullWeeks
        }
        return result
    }
}

fun main() {
    println(CalculateMoneyInLeetcodeBank.totalMoney(10))
}