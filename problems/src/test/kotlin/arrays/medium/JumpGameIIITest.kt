package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class JumpGameIIITest {
    @Test
    fun test1() {
        val arr = intArrayOf(4, 2, 3, 0, 3, 1, 2)
        val start = 5
        val expected = true

        assertEquals(expected, JumpGameIII.canReach(arr, start))
    }

    @Test
    fun test2() {
        val arr = intArrayOf(4, 2, 3, 0, 3, 1, 2)
        val start = 0
        val expected = true

        assertEquals(expected, JumpGameIII.canReach(arr, start))
    }

    @Test
    fun test3() {
        val arr = intArrayOf(3, 0, 2, 1, 2)
        val start = 2
        val expected = false

        assertEquals(expected, JumpGameIII.canReach(arr, start))
    }

    @Test
    fun test4() {
        val arr = intArrayOf(0, 1)
        val start = 1
        val expected = true

        assertEquals(expected, JumpGameIII.canReach(arr, start))
    }
}