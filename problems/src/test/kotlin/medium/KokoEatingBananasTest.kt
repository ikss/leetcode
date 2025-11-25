package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KokoEatingBananasTest {
    @Test
    fun test1() {
        val piles = intArrayOf(3, 6, 7, 11)
        val h = 8
        val expected = 4

        assertEquals(expected, KokoEatingBananas.minEatingSpeed(piles, h))
    }

    @Test
    fun test2() {
        val piles = intArrayOf(30, 11, 23, 4, 20)
        val h = 5
        val expected = 30

        assertEquals(expected, KokoEatingBananas.minEatingSpeed(piles, h))
    }

    @Test
    fun test3() {
        val piles = intArrayOf(30, 11, 23, 4, 20)
        val h = 6
        val expected = 23

        assertEquals(expected, KokoEatingBananas.minEatingSpeed(piles, h))
    }
}