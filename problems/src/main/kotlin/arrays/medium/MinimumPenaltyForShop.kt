package arrays.medium

/**
 * You are given the customer visit log of a shop represented by a 0-indexed string customers
 * consisting only of characters 'N' and 'Y':
 * * if the ith character is 'Y', it means that customers come at the ith hour
 * * whereas 'N' indicates that no customers come at the ith hour.
 *
 * If the shop closes at the jth hour (0 <= j <= n), the penalty is calculated as follows:
 * * For every hour when the shop is open and no customers come, the penalty increases by 1.
 * * For every hour when the shop is closed and customers come, the penalty increases by 1.
 *
 * Return the earliest hour at which the shop must be closed to incur a minimum penalty.
 *
 * Note that if a shop closes at the jth hour, it means the shop is closed at the hour j.
 *
 * [URL](https://leetcode.com/problems/minimum-penalty-for-a-shop/)
 */
object MinimumPenaltyForShop {
    fun bestClosingTime(customers: String): Int {
        var minPenalty = 0
        var curPenalty = 0
        var earliestHour = 0

        for (i in customers.indices) {
            val customer = customers[i]

            if (customer == 'Y') {
                curPenalty--
            } else {
                curPenalty++
            }

            if (curPenalty < minPenalty) {
                minPenalty = curPenalty
                earliestHour = i + 1
            }
        }

        return earliestHour
    }
}
