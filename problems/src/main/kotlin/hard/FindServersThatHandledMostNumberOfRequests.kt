package hard

import java.util.*

/**
 * You have k servers numbered from 0 to k-1 that are being used to handle multiple requests simultaneously.
 * Each server has infinite computational capacity but cannot handle more than one request at a time.
 * The requests are assigned to servers according to a specific algorithm:
 *
 * The ith (0-indexed) request arrives.
 * If all servers are busy, the request is dropped (not handled at all).
 * If the (i % k)th server is available, assign the request to that server.
 * Otherwise, assign the request to the next available server (wrapping around the list of servers and starting from 0
 * if necessary). For example, if the ith server is busy, try to assign the request to the (i+1)th server,
 * then the (i+2)th server, and so on.
 * You are given a strictly increasing array arrival of positive integers, where `arrival[i]` represents the arrival time
 * of the ith request, and another array load, where `load[i]` represents the load of the ith request
 * (the time it takes to complete). Your goal is to find the busiest server(s).
 * A server is considered busiest if it handled the most number of requests successfully among all the servers.
 *
 * Return a list containing the IDs (0-indexed) of the busiest server(s). You may return the IDs in any order.
 *
 * [URL](https://leetcode.com/problems/find-servers-that-handled-most-number-of-requests/)
 */
object FindServersThatHandledMostNumberOfRequests {
    fun busiestServers(k: Int, arrival: IntArray, load: IntArray): List<Int> {
        val handled = IntArray(k)
        val free = TreeSet<Int>()
        for (i in 0 until k) {
            free.add(i)
        }

        val busy = PriorityQueue<Pair<Int, Int>> { b1, b2 ->
            if (b1.first == b2.first) {
                b1.second - b2.second
            } else {
                b1.first - b2.first
            }
        }

        for (i in arrival.indices) {
            val reqTime = arrival[i]
            val reqLoad = load[i]

            while (busy.isNotEmpty() && busy.peek().first <= reqTime) {
                free.add(busy.poll().second)
            }

            val server = pickServer(i % k, free)
            // dropped
            if (server == null) continue

            handled[server]++
            free.remove(server)
            busy.offer(reqTime + reqLoad to server)
        }

        val max = handled.max()
        val result = ArrayList<Int>()

        for (i in handled.indices) {
            if (handled[i] == max) {
                result.add(i)
            }
        }

        return result
    }

    private fun pickServer(index: Int, free: TreeSet<Int>): Int? {
        // no free servers
        if (free.isEmpty()) return null

        val next = free.ceiling(index)
        if (next != null) return next

        return free.ceiling(0)
    }
}
