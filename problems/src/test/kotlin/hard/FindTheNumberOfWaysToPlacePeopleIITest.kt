package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheNumberOfWaysToPlacePeopleIITest {
    @Test
    fun test1() {
        val points = arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(3, 3))
        val expected = 0

        assertEquals(expected, FindTheNumberOfWaysToPlacePeopleII.numberOfPairs(points))
    }

    @Test
    fun test2() {
        val points = arrayOf(intArrayOf(6, 2), intArrayOf(4, 4), intArrayOf(1, 6))
        val expected = 2

        assertEquals(expected, FindTheNumberOfWaysToPlacePeopleII.numberOfPairs(points))
    }

    @Test
    fun test3() {
        val points = arrayOf(intArrayOf(3, 1), intArrayOf(1, 3), intArrayOf(1, 1))
        val expected = 2

        assertEquals(expected, FindTheNumberOfWaysToPlacePeopleII.numberOfPairs(points))
    }
}