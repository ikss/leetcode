package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KidsWithTheGreatestNumberOfCandiesTest {
    @Test
    fun test1() {
        val candies = intArrayOf(2, 3, 5, 1, 3)
        val extraCandies = 3
        val expected = listOf(true, true, true, false, true)

        assertEquals(expected, KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies))
    }

    @Test
    fun test2() {
        val candies = intArrayOf(4, 2, 1, 1, 2)
        val extraCandies = 1
        val expected = listOf(true, false, false, false, false)

        assertEquals(expected, KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies))
    }

    @Test
    fun test3() {
        val candies = intArrayOf(12, 1, 12)
        val extraCandies = 10
        val expected = listOf(true, false, true)

        assertEquals(expected, KidsWithTheGreatestNumberOfCandies.kidsWithCandies(candies, extraCandies))
    }
}