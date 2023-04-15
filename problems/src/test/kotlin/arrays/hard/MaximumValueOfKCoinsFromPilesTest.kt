package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumValueOfKCoinsFromPilesTest {

    @Test
    fun test1() {
        val piles = listOf(
            listOf(1, 100, 3),
            listOf(7, 8, 9),
        )
        val k = 2
        val expected = 101

        assertEquals(expected, MaximumValueOfKCoinsFromPiles.maxValueOfCoins(piles, k))
    }

    @Test
    fun test2() {
        val piles = listOf(
            listOf(100),
            listOf(100),
            listOf(100),
            listOf(100),
            listOf(100),
            listOf(100),
            listOf(1, 1, 1, 1, 1, 1, 700),
        )
        val k = 7
        val expected = 706

        assertEquals(expected, MaximumValueOfKCoinsFromPiles.maxValueOfCoins(piles, k))
    }
}