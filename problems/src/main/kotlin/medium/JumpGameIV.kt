package medium

/**
 * Given an array of integers arr, you are initially positioned at the first index of the array.
 *
 * In one step you can jump from index i to index:
 * * i + 1 where: i + 1 < arr.length.
 * * i - 1 where: i - 1 >= 0.
 * * j where: `arr[i] == arr[j]` and i != j.
 *
 * Return the minimum number of steps to reach the last index of the array.
 *
 * Notice that you can not jump outside of the array at any time.
 *
 * [URL](https://leetcode.com/problems/jump-game-iv/)
 */
object JumpGameIV {
    fun minJumps(arr: IntArray): Int {
        val n = arr.size
        if (n <= 1) {
            return 0
        }
        val graph = HashMap<Int, MutableList<Int>>()
        for (i in 0 until n) {
            graph.computeIfAbsent(arr[i]) { ArrayList() }.add(i)
        }
        var curs = arrayListOf(0) // store current layer
        val visited = HashSet<Int>()
        var step = 0

        // when current layer exists
        while (curs.isNotEmpty()) {
            val next = ArrayList<Int>()

            // iterate the layer
            for (node in curs) {
                // check if reached end
                if (node == n - 1) {
                    return step
                }

                // check same value
                val ints = graph[arr[node]]!!
                for (child in ints) {
                    if (visited.add(child)) {
                        next.add(child)
                    }
                }

                // clear the list to prevent redundant search
                ints.clear()

                // check neighbors
                if (node + 1 < n && visited.add(node + 1)) {
                    next.add(node + 1)
                }
                if (node - 1 >= 0 && visited.add(node - 1)) {
                    next.add(node - 1)
                }
            }
            curs = next
            step++
        }
        return -1
    }
}
