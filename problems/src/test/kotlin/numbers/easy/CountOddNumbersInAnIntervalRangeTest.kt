package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountOddNumbersInAnIntervalRangeTest {

    @Test
    fun test1my() {
        val low = 3
        val high = 7
        val expected = 3

        assertEquals(expected, CountOddNumbersInAnIntervalRange.countOddsMy(low, high))
    }

    @Test
    fun test2my() {
        val low = 8
        val high = 10
        val expected = 1

        assertEquals(expected, CountOddNumbersInAnIntervalRange.countOddsMy(low, high))
    }

    @Test
    fun test3my() {
        val low = 3
        val high = 3
        val expected = 1

        assertEquals(expected, CountOddNumbersInAnIntervalRange.countOddsMy(low, high))
    }

    @Test
    fun test4my() {
        val low = 4
        val high = 4
        val expected = 0

        assertEquals(expected, CountOddNumbersInAnIntervalRange.countOddsMy(low, high))
    }

    @Test
    fun test1official() {
        val low = 3
        val high = 7
        val expected = 3

        assertEquals(expected, CountOddNumbersInAnIntervalRange.countOddsOfficial(low, high))
    }

    @Test
    fun test2official() {
        val low = 8
        val high = 10
        val expected = 1

        assertEquals(expected, CountOddNumbersInAnIntervalRange.countOddsOfficial(low, high))
    }

    @Test
    fun test3official() {
        val low = 3
        val high = 3
        val expected = 1

        assertEquals(expected, CountOddNumbersInAnIntervalRange.countOddsOfficial(low, high))
    }

    @Test
    fun test4official() {
        val low = 4
        val high = 4
        val expected = 0

        assertEquals(expected, CountOddNumbersInAnIntervalRange.countOddsOfficial(low, high))
    }
}