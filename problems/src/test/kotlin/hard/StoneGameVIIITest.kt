package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StoneGameVIIITest {
    @Test
    fun test1() {
        val stones = intArrayOf(-1, 2, -3, 4, -5)
        val expected = 5

        assertEquals(expected, StoneGameVIII.stoneGameVIII(stones))
    }

    @Test
    fun test2() {
        val stones = intArrayOf(7, -6, 5, 10, 5, -2, -6)
        val expected = 13

        assertEquals(expected, StoneGameVIII.stoneGameVIII(stones))
    }

    @Test
    fun test3() {
        val stones = intArrayOf(-10, -12)
        val expected = -22

        assertEquals(expected, StoneGameVIII.stoneGameVIII(stones))
    }

}