package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KthSmallestAmountWithSingleDenominationCombinationTest {
    @Test
    fun test1() {
        val coins = intArrayOf(3, 6, 9)
        val k = 3
        val expected = 9L

        assertEquals(expected, KthSmallestAmountWithSingleDenominationCombination.findKthSmallest(coins, k))
    }

    @Test
    fun test2() {
        val coins = intArrayOf(5, 2)
        val k = 7
        val expected = 12L

        assertEquals(expected, KthSmallestAmountWithSingleDenominationCombination.findKthSmallest(coins, k))
    }
}