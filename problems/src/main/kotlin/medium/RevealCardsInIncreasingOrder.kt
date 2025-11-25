package medium

/**
 * You are given an integer array deck. There is a deck of cards where every card has a unique integer.
 * The integer on the ith card is `deck[i]`.
 *
 * You can order the deck in any order you want. Initially, all the cards start face down (unrevealed) in one deck.
 *
 * You will do the following steps repeatedly until all cards are revealed:
 *
 * * Take the top card of the deck, reveal it, and take it out of the deck.
 * * If there are still cards in the deck then put the next top card of the deck at the bottom of the deck.
 * * If there are still unrevealed cards, go back to step 1. Otherwise, stop.
 *
 * Return an ordering of the deck that would reveal the cards in increasing order.
 *
 * Note that the first entry in the answer is considered to be the top of the deck.
 *
 * [URL](https://leetcode.com/problems/reveal-cards-in-increasing-order/)
 */
object RevealCardsInIncreasingOrder {
    fun deckRevealedIncreasingSimulationArray(deck: IntArray): IntArray {
        val cards = deck.sorted()

        val result = IntArray(deck.size)

        var index = 0
        result[0] = cards[0]

        for (i in 1 until cards.size) {
            val c = cards[i]
            val nextZero = result.indexOf(0, index)
            index = result.indexOf(0, nextZero)
            result[index] = c
        }

        return result
    }

    private fun IntArray.indexOf(value: Int, fromIndex: Int): Int {
        for (i in fromIndex + 1 until size) {
            if (this[i] == value) {
                return i
            }
        }
        for (i in indices) {
            if (this[i] == value) {
                return i
            }
        }
        throw IllegalStateException("Value $value not found in array")
    }

    fun deckRevealedIncreasingSimulationQueue(deck: IntArray): IntArray {
        val cards = deck.sorted()
        val result = IntArray(deck.size)
        val queue = java.util.ArrayDeque<Int>()

        for (i in cards.indices) {
            queue.add(i)
        }

        for (card in cards) {
            result[queue.poll()] = card
            if (queue.isNotEmpty()) {
                queue.offer(queue.poll())
            }
        }

        return result
    }
}