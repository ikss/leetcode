package arrays.hard

import java.util.*

/**
 * You are given an integer array coins (1-indexed) of length n and an integer maxJump.
 * You can jump to any index i of the array coins if coins[i] != -1 and you have to pay coins[i] when you visit index i.
 * In addition to that, if you are currently at index i, you can only jump to any index i + k where i + k <= n and k is
 * a value in the range [1, maxJump].
 *
 * You are initially positioned at index 1 (coins[1] is not -1).
 * You want to find the path that reaches index n with the minimum cost.
 *
 * Return an integer array of the indices that you will visit in order so that you can reach index n with
 * the minimum cost. If there are multiple paths with the same cost, return the lexicographically smallest such path. If it is not possible to reach index n, return an empty array.
 *
 * A path p1 = `[Pa1, Pa2, ..., Pax]` of length x is lexicographically smaller than p2 = `[Pb1, Pb2, ..., Pbx]`
 * of length y, if and only if at the first j where Paj and Pbj differ, Paj < Pbj; when no such j exists, then x < y.
 *
 * [URL](https://leetcode.com/problems/coin-path/)
 */
object CoinPath {
    private data class State(
        val cost: Int,
        val index: Int,
        val path: List<Int>,
    ) : Comparable<State> {
        override fun compareTo(other: State): Int {
            if (cost != other.cost) {
                return cost - other.cost
            }

            for (i in path.indices) {
                val curr = path[i]
                val next = other.path.getOrNull(i) ?: -1

                if (curr != next) {
                    return curr - next
                }
            }
            return 0
        }
    }

    fun cheapestJump(coins: IntArray, maxJump: Int): List<Int> {
        val pq = PriorityQueue<State>()
        pq.offer(State(coins[0], 1, listOf(1)))
        val visited = HashSet<Int>()

        while (pq.isNotEmpty()) {
            val currState = pq.poll()

            if (currState.index == coins.size) {
                return currState.path
            }

            if (!visited.add(currState.index - 1)) continue

            for (ni in maxOf(0, currState.index - 1 - maxJump) until minOf(coins.size, currState.index + maxJump)) {
                if (ni in visited || coins[ni] == -1) continue
                val newState = State(currState.cost + coins[ni], ni + 1, currState.path + (ni + 1))
                pq.offer(newState)
            }
        }

        return emptyList()
    }
}
