package hard

/**
 * You are given an array routes representing bus routes where `routes[i]` is a bus route that the ith bus repeats forever.
 *
 * For example, if routes[0] = [1, 5, 7], this means that the 0th bus travels in the sequence
 * 1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 -> ... forever.
 * You will start at the bus stop source (You are not on any bus initially), and you want to go to the bus stop target.
 * You can travel between bus stops by buses only.
 *
 * Return the least number of buses you must take to travel from source to target. Return -1 if it is not possible.
 *
 * [URL](https://leetcode.com/problems/bus-routes/)
 */
object BusRoutes {
    fun numBusesToDestination(routes: Array<IntArray>, source: Int, target: Int): Int {
        if (source == target) {
            return 0
        }
        val adjList = HashMap<Int, ArrayList<Int>>()
        // Create a map from the bus stop to all the routes that include this stop.
        for (r in routes.indices) {
            for (stop in routes[r]) {
                // Add all the routes that have this stop.
                val route = adjList.getOrDefault(stop, ArrayList())
                route.add(r)
                adjList[stop] = route
            }
        }
        val q = java.util.ArrayDeque<Int>()
        val vis = HashSet<Int>(routes.size)
        // Insert all the routes in the queue that have the source stop.
        for (route in adjList[source]!!) {
            q.add(route)
            vis.add(route)
        }
        var busCount = 1
        while (!q.isEmpty()) {
            val size = q.size
            for (i in 0 until size) {
                val route = q.poll()

                // Iterate over the stops in the current route.
                for (stop in routes[route]) {
                    // Return the current count if the target is found.
                    if (stop == target) {
                        return busCount
                    }

                    // Iterate over the next possible routes from the current stop.
                    for (nextRoute in adjList[stop]!!) {
                        if (vis.add(nextRoute)) {
                            q.add(nextRoute)
                        }
                    }
                }
            }
            busCount++
        }
        return -1
    }
}