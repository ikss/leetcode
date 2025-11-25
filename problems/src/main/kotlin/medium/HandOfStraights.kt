package medium

/**
 * Alice has some number of cards and she wants to rearrange the cards into groups so that each group is of size
 * groupSize, and consists of groupSize consecutive cards.
 *
 * Given an integer array hand where `hand[i]` is the value written on the ith card and an integer groupSize,
 * return true if she can rearrange the cards, or false otherwise.
 *
 * Return the following:
 * * If version1 < version2, return -1.
 * * If version1 > version2, return 1.
 * * Otherwise, return 0.
 *
 * [URL](https://leetcode.com/problems/hand-of-straights/)
 */
object HandOfStraights {
    fun isNStraightHand(hand: IntArray, groupSize: Int): Boolean {
        if (hand.size % groupSize != 0) {
            return false
        }

        // HashMap to store the count of each card value
        val cardCount = HashMap<Int, Int>()
        for (card in hand) {
           cardCount.merge(card, 1, Int::plus)
        }

        for (card in hand) {
            var startCard = card
            // Find the start of the potential straight sequence
            while (cardCount.getOrDefault(startCard - 1, 0) > 0) {
                startCard--
            }
            
            // Process the sequence starting from startCard
            while (startCard <= card) {
                while (cardCount.getOrDefault(startCard, 0) > 0) {
                    val count = cardCount[startCard]!!
                    // Check if we can form a consecutive sequence
                    // of groupSize cards
                    for (nextCard in startCard until startCard + groupSize) {
                        if (cardCount.getOrDefault(nextCard, 0) < count) {
                            return false
                        }
                        cardCount.merge(nextCard, count, Int::minus)
                    }
                }
                startCard++
            }
            val a: Integer
        }

        return true
    }
}