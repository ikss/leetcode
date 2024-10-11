package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TheNumberOfTheSmallestUnoccupiedChairTest {
    @Test
    fun test1() {
        val times = arrayOf(intArrayOf(1, 4), intArrayOf(2, 3), intArrayOf(4, 6))
        val targetFriend = 1
        val expected = 1

        assertEquals(expected, TheNumberOfTheSmallestUnoccupiedChair.smallestChair(times, targetFriend))
    }

    @Test
    fun test2() {
        val times = arrayOf(intArrayOf(3, 10), intArrayOf(1, 5), intArrayOf(2, 6))
        val targetFriend = 0
        val expected = 2

        assertEquals(expected, TheNumberOfTheSmallestUnoccupiedChair.smallestChair(times, targetFriend))
    }
}