package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindTheMaximumNumberOfFruitsCollectedTest {
    @Test
    fun test1() {
        val fruits = arrayOf(
            intArrayOf(1, 2, 3, 4),
            intArrayOf(5, 6, 8, 7),
            intArrayOf(9, 10, 11, 12),
            intArrayOf(13, 14, 15, 16),
        )
        val expected = 100

        assertEquals(expected, FindTheMaximumNumberOfFruitsCollected.maxCollectedFruits(fruits))
    }

    @Test
    fun test2() {
        val fruits = arrayOf(
            intArrayOf(1, 1),
            intArrayOf(1, 1),
        )
        val expected = 4

        assertEquals(expected, FindTheMaximumNumberOfFruitsCollected.maxCollectedFruits(fruits))
    }
}