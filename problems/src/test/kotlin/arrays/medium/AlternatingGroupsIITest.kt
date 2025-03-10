package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AlternatingGroupsIITest {
    @Test
    fun test1() {
        val colors = intArrayOf(0, 1, 0, 1, 0)
        val k = 3
        val expected = 3

        assertEquals(expected, AlternatingGroupsII.numberOfAlternatingGroups(colors, k))
    }

    @Test
    fun test2() {
        val colors = intArrayOf(0, 1, 0, 0, 1, 0, 1)
        val k = 6
        val expected = 2

        assertEquals(expected, AlternatingGroupsII.numberOfAlternatingGroups(colors, k))
    }

    @Test
    fun test3() {
        val colors = intArrayOf(1, 1, 0, 1)
        val k = 4
        val expected = 0

        assertEquals(expected, AlternatingGroupsII.numberOfAlternatingGroups(colors, k))
    }
}