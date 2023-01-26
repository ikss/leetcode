package graphs.medium


/**
 * There are n cities connected by some number of flights. You are given an array flights where
 * `flights[i] = [fromi, toi, pricei]` indicates that there is a flight from city fromi to city toi with cost pricei.
 *
 * You are also given three integers src, dst, and k, return the cheapest price from src to dst with at most k stops.
 * If there is no such route, return -1.
 *
 * [URL](https://leetcode.com/problems/cheapest-flights-within-k-stops/)
 */
object CheapestFlightsWithinKStops {
    fun findCheapestPriceOwn(n: Int, flights: Array<IntArray>, src: Int, dst: Int, k: Int): Int {
        val graph = mutableMapOf<Int, MutableList<Pair<Int, Int>>>()

        for ((start, end, price) in flights) {
            graph.computeIfAbsent(start) { mutableListOf() }.add(end to price)
        }

        var result = Int.MAX_VALUE
        var count = -1
        val queue = java.util.ArrayDeque<Pair<Int, Int>>()
        queue.offer(src to 0)
        val visited = mutableMapOf<Int, Int>()
        while (queue.isNotEmpty() && count <= k) {
            val size = queue.size

            for (i in 0 until size) {
                val (airport, currSum) = queue.poll()
                val prevVisited = visited[airport]
                if (prevVisited != null && prevVisited <= currSum) continue
                visited[airport] = currSum
                if (airport == dst) {
                    result = minOf(result, currSum)
                }
                for ((dest, price) in graph[airport] ?: ArrayList()) {
                    queue.offer(dest to currSum + price)
                }
            }
            count++
        }

        return if (result == Int.MAX_VALUE) -1 else result
    }
}
