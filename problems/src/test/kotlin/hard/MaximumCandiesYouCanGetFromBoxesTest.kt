package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumCandiesYouCanGetFromBoxesTest {
    @Test
    fun test1() {
        val status = intArrayOf(1, 0, 1, 0)
        val candies = intArrayOf(7, 5, 4, 100)
        val keys = arrayOf(intArrayOf(), intArrayOf(), intArrayOf(1), intArrayOf())
        val containedBoxes = arrayOf(intArrayOf(1, 2), intArrayOf(3), intArrayOf(), intArrayOf())
        val initialBoxes = intArrayOf(0)
        val expected = 16

        assertEquals(expected, MaximumCandiesYouCanGetFromBoxes.maxCandies(status, candies, keys, containedBoxes, initialBoxes))
    }

    @Test
    fun test2() {
        val status = intArrayOf(1, 0, 0, 0, 0, 0)
        val candies = intArrayOf(1, 1, 1, 1, 1, 1)
        val keys = arrayOf(intArrayOf(1, 2, 3, 4, 5), intArrayOf(), intArrayOf(), intArrayOf(), intArrayOf(), intArrayOf())
        val containedBoxes = arrayOf(intArrayOf(1, 2, 3, 4, 5), intArrayOf(), intArrayOf(), intArrayOf(), intArrayOf(), intArrayOf())
        val initialBoxes = intArrayOf(0)
        val expected = 6

        assertEquals(expected, MaximumCandiesYouCanGetFromBoxes.maxCandies(status, candies, keys, containedBoxes, initialBoxes))
    }
}