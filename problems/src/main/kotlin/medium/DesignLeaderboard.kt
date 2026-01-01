package medium

import java.util.*

/**
 * Design a Leaderboard class, which has 3 functions:
 *
 * 1. addScore(playerId, score): Update the leaderboard by adding score to the given player's score.
 * If there is no player with such id in the leaderboard, add him to the leaderboard with the given score.
 * 2. top(K): Return the score sum of the top K players.
 * 3. reset(playerId): Reset the score of the player with the given id to 0 (in other words erase it from the leaderboard).
 * It is guaranteed that the player was added to the leaderboard before calling this function.
 * Initially, the leaderboard is empty.
 *
 * [URL](https://leetcode.com/problems/design-a-leaderboard/)
 */
object DesignLeaderboard {
    class Leaderboard {
        private val queue = PriorityQueue<Pair<Int, Int>>{ p1, p2 -> p2.second - p1.second }
        private val stored = HashMap<Int, Int>()

        fun addScore(playerId: Int, score: Int) {
            val newScore = if (playerId in stored) {
                val old = stored[playerId]!!
                trueRemove(playerId)
                old + score
            } else {
                score
            }
            queue.offer(playerId to newScore)
            stored[playerId] = newScore
        }

        fun top(K: Int): Int {
            var result = 0
            if (queue.isEmpty()) return result

            val keep = ArrayList<Pair<Int, Int>>()

            var k = K

            while (queue.isNotEmpty()) {
                val (id, score) = queue.poll()
                if (id !in stored) {
                    continue
                }
                keep.add(id to score)
                result += score

                if (--k == 0) break
            }
            for (p in keep) {
                queue.offer(p)
            }
            return result
        }

        fun reset(playerId: Int) {
            trueRemove(playerId)
        }

        private fun trueRemove(playerId: Int) {
            stored.remove(playerId)
            val keep = ArrayList<Pair<Int, Int>>()

            while (queue.isNotEmpty()) {
                val (id, score) = queue.poll()
                if (id == playerId) break
                keep.add(id to score)
            }

            for (p in keep) {
                queue.offer(p)
            }
        }
    }
}