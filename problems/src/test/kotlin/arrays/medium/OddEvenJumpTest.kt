package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OddEvenJumpTest {
    @Test
    fun test1() {
        val arr = intArrayOf(10, 13, 12, 14, 15)
        val expected = 2

        assertEquals(expected, OddEvenJump.oddEvenJumps(arr))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(2, 3, 1, 1, 4)
        val expected = 3

        assertEquals(expected, OddEvenJump.oddEvenJumps(arr))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(5, 1, 3, 4, 2)
        val expected = 3

        assertEquals(expected, OddEvenJump.oddEvenJumps(arr))
    }
}