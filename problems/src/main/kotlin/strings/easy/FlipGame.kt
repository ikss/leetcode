package strings.easy

/**
 * You are playing a Flip Game with your friend.
 *
 * You are given a string currentState that contains only '+' and '-'. You and your friend take turns to flip
 * two consecutive "++" into "--". The game ends when a person can no longer make a move,
 * and therefore the other person will be the winner.
 *
 * Return all possible states of the string currentState after one valid move. You may return the answer in any order.
 * If there is no valid move, return an empty list [].
 *
 * [URL](https://leetcode.com/problems/flip-game/)
 */
object FlipGame {
    fun generatePossibleNextMoves(currentState: String): List<String> {
        val result = ArrayList<String>()

        var prev = 0

        for (i in 1 until currentState.length) {
            if (currentState[i - 1] == '+' && currentState[i] == '+') {
                result += currentState.substring(0, i - 1) + "--" + currentState.substring(i + 1, currentState.length)
            }
        }

        return result
    }
}