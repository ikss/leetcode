package arrays.medium

/**
 * Given an integer array arr of distinct integers and an integer k.
 *
 * A game will be played between the first two elements of the array (i.e. `arr[0]` and `arr[1]`).
 * In each round of the game, we compare `arr[0]` with `arr[1]`, the larger integer wins and remains at position 0,
 * and the smaller integer moves to the end of the array. The game ends when an integer wins k consecutive rounds.
 *
 * Return the integer which will win the game.
 *
 * It is guaranteed that there will be a winner of the game.
 *
 * [URL](https://leetcode.com/problems/find-the-winner-of-an-array-game/)
 */
object FindTheWinnerOfAnArrayGame {
    fun getWinnerOwn(arr: IntArray, k: Int): Int {
        val queue = java.util.ArrayDeque<Pair<Int, Int>>()

        for (n in arr) {
            queue.offer(n to 0)
        }

        while (true) {
            val e1 = queue.pollFirst()
            if (e1.second == k || e1.second == arr.size - 1) return e1.first

            val e2 = queue.pollFirst()

            if (e1.first > e2.first) {
                queue.offerFirst(e1.first to e1.second + 1)
                queue.offerLast(e2.first to 1)
            } else {
                queue.offerFirst(e2.first to e2.second + 1)
                queue.offerLast(e1.first to 1)
            }
        }
    }
}
