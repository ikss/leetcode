package arrays.medium

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class RevealCardsInIncreasingOrderTest {
    @Test
    fun test1simulationArray() {
        val deck = intArrayOf(17, 13, 11, 2, 3, 5, 7)
        val expected = intArrayOf(2, 13, 3, 11, 5, 17, 7)

        assertArrayEquals(expected, RevealCardsInIncreasingOrder.deckRevealedIncreasingSimulationArray(deck))
    }

    @Test
    fun test2simulationArray() {
        val deck = intArrayOf(1, 1000)
        val expected = intArrayOf(1, 1000)

        assertArrayEquals(expected, RevealCardsInIncreasingOrder.deckRevealedIncreasingSimulationArray(deck))
    }

    @Test
    fun test1simulationQueue() {
        val deck = intArrayOf(17, 13, 11, 2, 3, 5, 7)
        val expected = intArrayOf(2, 13, 3, 11, 5, 17, 7)

        assertArrayEquals(expected, RevealCardsInIncreasingOrder.deckRevealedIncreasingSimulationQueue(deck))
    }

    @Test
    fun test2simulationQueue() {
        val deck = intArrayOf(1, 1000)
        val expected = intArrayOf(1, 1000)

        assertArrayEquals(expected, RevealCardsInIncreasingOrder.deckRevealedIncreasingSimulationQueue(deck))
    }
}