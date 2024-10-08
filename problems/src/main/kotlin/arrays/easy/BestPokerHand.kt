package arrays.easy

/**
 * You are given an integer array ranks and a character array suits. You have 5 cards where the ith card has a rank
 * of `ranks[i]` and a suit of `suits[i]`.
 *
 * The following are the types of poker hands you can make from best to worst:
 * * "Flush": Five cards of the same suit.
 * * "Three of a Kind": Three cards of the same rank.
 * * "Pair": Two cards of the same rank.
 * * "High Card": Any single card.
 *
 * Return a string representing the best type of poker hand you can make with the given cards.
 *
 * Note that the return values are case-sensitive.
 *
 * [URL](https://leetcode.com/problems/buy-two-chocolates/)
 */
object BestPokerHand {
    fun bestHand(ranks: IntArray, suits: CharArray): String {
        if (suits.all { it == suits[0] }) {
            return "Flush"

        }
        
        var maxRanks = 0
        val ranksArr = IntArray(14)
        for (r in ranks) {
            ranksArr[r]++
            maxRanks = maxOf(maxRanks, ranksArr[r])
        }

        return when (maxRanks) {
            in 3..5 -> "Three of a Kind"
            2 -> "Pair"
            else -> "High Card"
        }
    }
}
