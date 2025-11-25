package medium

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
        var maxElement = arr[0]
        val queue = java.util.ArrayDeque<Int>()
        for (i in 1 until arr.size) {
            maxElement = maxOf(maxElement, arr[i])
            queue.offer(arr[i])
        }

        var curr = arr[0]
        var winstreak = 0

        while (!queue.isEmpty()) {
            val opponent = queue.poll()
            if (curr > opponent) {
                queue.offer(opponent)
                winstreak++
            } else {
                queue.offer(curr)
                curr = opponent
                winstreak = 1
            }
            if (winstreak == k || curr == maxElement) {
                return curr
            }
        }

        return -1
    }
}
