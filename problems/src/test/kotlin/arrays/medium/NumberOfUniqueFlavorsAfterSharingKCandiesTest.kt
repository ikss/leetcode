package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfUniqueFlavorsAfterSharingKCandiesTest {
    @Test
    fun test1() {
        val candies = intArrayOf(1, 2, 2, 3, 4, 3)
        val k = 3
        val expected = 3

        assertEquals(expected, NumberOfUniqueFlavorsAfterSharingKCandies.shareCandies(candies, k))
    }

    @Test
    fun test2() {
        val candies = intArrayOf(2, 2, 2, 2, 3, 3)
        val k = 2
        val expected = 2

        assertEquals(expected, NumberOfUniqueFlavorsAfterSharingKCandies.shareCandies(candies, k))
    }

    @Test
    fun test3() {
        val candies = intArrayOf(2, 4, 5)
        val k = 0
        val expected = 3

        assertEquals(expected, NumberOfUniqueFlavorsAfterSharingKCandies.shareCandies(candies, k))
    }

    @Test
    fun test4() {
        val candies = intArrayOf(3, 3, 3, 4)
        val k = 3
        val expected = 1

        assertEquals(expected, NumberOfUniqueFlavorsAfterSharingKCandies.shareCandies(candies, k))
    }
}