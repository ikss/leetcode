package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumNumberOfCoinsYouCanGetTest {
    @Test
    fun test1() {
        val piles = intArrayOf(2, 4, 1, 2, 7, 8)
        val expected = 9

        assertEquals(expected, MaximumNumberOfCoinsYouCanGet.maxCoins(piles))
    }

    @Test
    fun test2() {
        val piles = intArrayOf(2, 4, 5)
        val expected = 4

        assertEquals(expected, MaximumNumberOfCoinsYouCanGet.maxCoins(piles))
    }

    @Test
    fun test3() {
        val piles = intArrayOf(9, 8, 7, 6, 5, 1, 2, 3, 4)
        val expected = 18

        assertEquals(expected, MaximumNumberOfCoinsYouCanGet.maxCoins(piles))
    }
}