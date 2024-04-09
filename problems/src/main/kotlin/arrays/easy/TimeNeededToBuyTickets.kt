package arrays.easy

/**
 * There are n people in a line queuing to buy tickets, where the 0th person is at the front of the line
 * and the (n - 1)th person is at the back of the line.
 *
 * You are given a 0-indexed integer array tickets of length n where the number of tickets that
 * the ith person would like to buy is `tickets[i]`.
 *
 * Each person takes exactly 1 second to buy a ticket. A person can only buy 1 ticket at a time and has to go back
 * to the end of the line (which happens instantaneously) in order to buy more tickets.
 * If a person does not have any tickets left to buy, the person will leave the line.
 *
 * Return the time taken for the person at position k (0-indexed) to finish buying tickets.
 *
 * [URL](https://leetcode.com/problems/time-needed-to-buy-tickets/)
 */
object TimeNeededToBuyTickets {
    fun timeRequiredToBuySimulation(tickets: IntArray, k: Int): Int {
        var needed = tickets[k]
        var result = 0

        while (needed > 0) {
            for (i in tickets.indices) {
                if (tickets[i] > 0) {
                    result++
                    tickets[i]--
                }
                if (i == k && --needed == 0) break
            }
        }
        return result
    }

    fun timeRequiredToBuySinglePass(tickets: IntArray, k: Int): Int {
        var result = 0

        for (i in tickets.indices) {
            if (i <= k) {
                result += minOf(tickets[i], tickets[k])
            } else {
                result += minOf(tickets[i], tickets[k] - 1)
            }
        }
        return result
    }
}
