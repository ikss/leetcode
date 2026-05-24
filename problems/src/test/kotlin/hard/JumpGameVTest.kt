package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JumpGameVTest {

    @Test
    fun test1() {
        val arr = intArrayOf(6, 4, 14, 6, 8, 13, 9, 7, 10, 6, 12)
        val d = 2
        val expected = 4

        assertEquals(expected, JumpGameV.maxJumps(arr, d))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(3, 3, 3, 3, 3)
        val d = 3
        val expected = 1

        assertEquals(expected, JumpGameV.maxJumps(arr, d))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(7, 6, 5, 4, 3, 2, 1)
        val d = 1
        val expected = 7

        assertEquals(expected, JumpGameV.maxJumps(arr, d))
    }
}