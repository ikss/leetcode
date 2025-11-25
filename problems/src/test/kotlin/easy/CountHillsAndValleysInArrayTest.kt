package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CountHillsAndValleysInArrayTest {
    @Test
    fun test1() {
        val input = intArrayOf(2, 4, 1, 1, 6, 5)
        val expected = 3

        assertEquals(expected, CountHillsAndValleysInArray.countHillValley(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(6, 6, 5, 5, 4, 1)
        val expected = 0

        assertEquals(expected, CountHillsAndValleysInArray.countHillValley(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(1, 1, 1, 2, 1, 1, 1)
        val expected = 1

        assertEquals(expected, CountHillsAndValleysInArray.countHillValley(input))
    }
}