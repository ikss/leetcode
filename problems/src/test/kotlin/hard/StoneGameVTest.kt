package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StoneGameVTest {
    @Test
    fun test1() {
        val stones = intArrayOf(6, 2, 3, 4, 5, 5)
        val expected = 18

        assertEquals(expected, StoneGameV.stoneGameV(stones))
    }

    @Test
    fun test2() {
        val stones = intArrayOf(7, 7, 7, 7, 7, 7, 7)
        val expected = 28

        assertEquals(expected, StoneGameV.stoneGameV(stones))
    }

    @Test
    fun test3() {
        val stones = intArrayOf(4)
        val expected = 0

        assertEquals(expected, StoneGameV.stoneGameV(stones))
    }
}