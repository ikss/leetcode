package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StoneGameIXTest {
    @Test
    fun test1() {
        val stones = intArrayOf(2, 1)
        val expected = true

        assertEquals(expected, StoneGameIX.stoneGameIX(stones))
    }

    @Test
    fun test2() {
        val stones = intArrayOf(2)
        val expected = false

        assertEquals(expected, StoneGameIX.stoneGameIX(stones))
    }

    @Test
    fun test3() {
        val stones = intArrayOf(5,1,2,4,3)
        val expected = false

        assertEquals(expected, StoneGameIX.stoneGameIX(stones))
    }
}