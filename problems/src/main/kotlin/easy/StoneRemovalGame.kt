package easy

/**
 * Alice and Bob are playing a game where they take turns removing stones from a pile, with Alice going first.
 * * Alice starts by removing exactly 10 stones on her first turn.
 * * For each subsequent turn, each player removes exactly 1 fewer stone than the previous opponent.
 *
 * The player who cannot make a move loses the game.
 *
 * Given a positive integer n, return true if Alice wins the game and false otherwise.
 *
 * [URL](https://leetcode.com/problems/stone-removal-game/)
 */
object StoneRemovalGame {
    fun canAliceWin(n: Int): Boolean {
        var aliceTurn = true
        var currStep = 10
        var n = n

        while (n >= currStep) {
            n -= currStep--
            aliceTurn = !aliceTurn
        }
        return !aliceTurn
    }
}
