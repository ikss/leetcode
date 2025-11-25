package hard

/**
 * There is a game dungeon comprised of n x n rooms arranged in a grid.
 *
 * You are given a 2D array fruits of size n x n, where `fruits[i][j]` represents the number of fruits
 * in the room (i, j). Three children will play in the game dungeon, with initial positions
 * at the corner rooms (0, 0), (0, n - 1), and (n - 1, 0).
 *
 * The children will make exactly n - 1 moves according to the following rules to reach the room (n - 1, n - 1):
 *
 * * The child starting from (0, 0) must move from their current room (i, j) to one of the rooms (i + 1, j + 1),
 * (i + 1, j), and (i, j + 1) if the target room exists.
 * * The child starting from (0, n - 1) must move from their current room (i, j) to one of the rooms (i + 1, j - 1),
 * (i + 1, j), and (i + 1, j + 1) if the target room exists.
 * * The child starting from (n - 1, 0) must move from their current room (i, j) to one of the rooms (i - 1, j + 1),
 * (i, j + 1), and (i + 1, j + 1) if the target room exists.
 *
 * When a child enters a room, they will collect all the fruits there. If two or more children enter the same room,
 * only one child will collect the fruits, and the room will be emptied after they leave.
 *
 * Return the maximum number of fruits the children can collect from the dungeon.
 *
 * [URL](https://leetcode.com/problems/find-the-maximum-number-of-fruits-collected/)
 */
object FindTheMaximumNumberOfFruitsCollected {

    fun maxCollectedFruits(fruits: Array<IntArray>): Int {
        val n = fruits.size
        var ans = 0
        for (i in 0..<n) {
            ans += fruits[i][i]
        }

        ans += dp(fruits)

        for (i in 0..<n) {
            for (j in 0..<i) {
                val temp = fruits[j][i]
                fruits[j][i] = fruits[i][j]
                fruits[i][j] = temp
            }
        }

        ans += dp(fruits)
        return ans
    }

    private fun dp(fruits: Array<IntArray>): Int {
        val n = fruits.size
        var prev = IntArray(n) { Int.MIN_VALUE }
        var curr = IntArray(n) { Int.MIN_VALUE }
        prev[n - 1] = fruits[0][n - 1]

        for (i in 1..<n - 1) {
            for (j in maxOf(n - 1 - i, i + 1)..<n) {
                var best = prev[j]
                if (j - 1 >= 0) best = maxOf(best, prev[j - 1])
                if (j + 1 < n) best = maxOf(best, prev[j + 1])
                curr[j] = best + fruits[i][j]
            }
            val temp = prev
            prev = curr
            curr = temp
        }
        return prev[n - 1]
    }
}
