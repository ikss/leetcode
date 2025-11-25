package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ThreeConsecutiveOddsTest {
    @Test
    fun test1() {
        val arr = intArrayOf(2, 6, 4, 1)
        val expected = false

        assertEquals(expected, ThreeConsecutiveOdds.threeConsecutiveOdds(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(1, 2, 34, 3, 4, 5, 7, 23, 12)
        val expected = true

        assertEquals(expected, ThreeConsecutiveOdds.threeConsecutiveOdds(arr))
    }
}