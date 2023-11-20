package arrays.medium

import java.util.*

/**
 * On a campus represented on the X-Y plane, there are n workers and m bikes, with n <= m.
 *
 * You are given an array workers of length n where `workers[i] = [xi, yi]` is the position of the ith worker.
 * You are also given an array bikes of length m where `bikes[j] = [xj, yj]` is the position of the jth bike.
 * All the given positions are unique.
 *
 * Assign a bike to each worker. Among the available bikes and workers, we choose the (workeri, bikej) pair with the
 * shortest Manhattan distance between each other and assign the bike to that worker.
 *
 * If there are multiple (workeri, bikej) pairs with the same shortest Manhattan distance, we choose the pair with the
 * smallest worker index. If there are multiple ways to do that, we choose the pair with the smallest bike index.
 * Repeat this process until there are no available workers.
 *
 * Return an array answer of length n, where `answer[i]` is the index (0-indexed) of the bike that the ith worker is
 * assigned to.
 *
 * The Manhattan distance between two points p1 and p2 is Manhattan(p1, p2) = |p1.x - p2.x| + |p1.y - p2.y|.
 *
 * [URL](https://leetcode.com/problems/campus-bikes/)
 */
object CampusBikes {
    fun assignBikes(workers: Array<IntArray>, bikes: Array<IntArray>): IntArray {
        val result = IntArray(workers.size) { -1 }

        val pq = PriorityQueue<IntArray> { a1, a2 ->
            if (a1[0] != a2[0]) a1[0].compareTo(a2[0])
            else if (a1[1] != a2[1]) a1[1].compareTo(a2[1])
            else a1[2].compareTo(a2[2])
        }

        for (wi in workers.indices) {
            val (wx, wy) = workers[wi]

            for (bi in bikes.indices) {
                val (bx, by) = bikes[bi]
                val distance = Math.abs(wx - bx) + Math.abs(wy - by)
                pq.offer(intArrayOf(distance, wi, bi))
            }
        }

        val used = HashSet<Int>()
        while (pq.isNotEmpty()) {
            val (_, w, b) = pq.poll()
            if (result[w] == -1 && used.add(b)) {
                result[w] = b
            }
        }

        return result
    }

}