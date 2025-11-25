package medium

/**
 * You are given an integer array nums. Two players are playing a game with this array: player 1 and player 2.
 *
 * Player 1 and player 2 take turns, with player 1 starting first. Both players start the game with a score of 0.
 * At each turn, the player takes one of the numbers from either end of the array
 * (i.e., `nums[0]` or `nums[nums.length - 1]`) which reduces the size of the array by 1.
 * The player adds the chosen number to their score. The game ends when there are no more elements in the array.
 *
 * Return true if Player 1 can win the game. If the scores of both players are equal, then player 1 is still the winner,
 * and you should also return true. You may assume that both players are playing optimally.
 *
 * [URL](https://leetcode.com/problems/predict-the-winner/)
 */
object PredictTheWinner {
    fun predictTheWinner(nums: IntArray): Boolean {
        val n = nums.size
        if (n % 2 == 0) {
            return true
        }
        val dp = nums.copyOf()

        for (diff in 1 until n) {
            for (left in 0 until n - diff) {
                val right = left + diff
                val chooseLeft = nums[left] - dp[left + 1]
                val chooseRight = nums[right] - dp[left]
                dp[left] = maxOf(chooseLeft, chooseRight)
            }
        }

        return dp[0] >= 0
    }
}
