package arrays.medium

/**
 * There is a restaurant with a single chef. You are given an array customers, where `customers[i] = [arrivali, timei]`:
 * * arrivali is the arrival time of the ith customer. The arrival times are sorted in non-decreasing order.
 * * timei is the time needed to prepare the order of the ith customer.
 * 
 * When a customer arrives, he gives the chef his order, and the chef starts preparing it once he is idle.
 * The customer waits till the chef finishes preparing his order. The chef does not prepare food for more than one
 * customer at a time. The chef prepares food for customers in the order they were given in the input.
 *
 * Return the average waiting time of all customers. Solutions within 10-5 from the actual answer are considered accepted.
 *
 * [URL](https://leetcode.com/problems/average-waiting-time/)
 */
object AverageWaitingTime {
    fun averageWaitingTime(customers: Array<IntArray>): Double {
        var totalWaitingTime = 0L
        var currTime = 0

        for ((arrival, preparation) in customers) {
            val start = maxOf(currTime, arrival)

            currTime = start + preparation

            totalWaitingTime += (currTime - arrival)
        }

        return totalWaitingTime.toDouble() / customers.size
    }
}
