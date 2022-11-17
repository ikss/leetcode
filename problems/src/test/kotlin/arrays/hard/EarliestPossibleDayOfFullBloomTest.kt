package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class EarliestPossibleDayOfFullBloomTest {

    @Test
    fun test1() {
        val plantTime = intArrayOf(1, 4, 3)
        val growTime = intArrayOf(2, 3, 1)
        val expected = 9

        assertEquals(expected, EarliestPossibleDayOfFullBloom.earliestFullBloom(plantTime, growTime))
    }

    @Test
    fun test2() {
        val plantTime = intArrayOf(1, 2, 3, 2)
        val growTime = intArrayOf(2, 1, 2, 1)
        val expected = 9

        assertEquals(expected, EarliestPossibleDayOfFullBloom.earliestFullBloom(plantTime, growTime))
    }

    @Test
    fun test3() {
        val plantTime = intArrayOf(1)
        val growTime = intArrayOf(1)
        val expected = 2

        assertEquals(expected, EarliestPossibleDayOfFullBloom.earliestFullBloom(plantTime, growTime))
    }
}