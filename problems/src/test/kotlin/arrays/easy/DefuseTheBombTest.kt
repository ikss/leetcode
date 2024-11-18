package arrays.easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class DefuseTheBombTest {
    @Test
    fun test1() {
        val code = intArrayOf(5, 7, 1, 4)
        val k = 3
        val expected = intArrayOf(12, 10, 16, 13)

        assertArrayEquals(expected, DefuseTheBomb.decrypt(code, k))
    }

    @Test
    fun test2() {
        val code = intArrayOf(1, 2, 3, 4)
        val k = 0
        val expected = intArrayOf(0, 0, 0, 0)

        assertArrayEquals(expected, DefuseTheBomb.decrypt(code, k))
    }

    @Test
    fun test3() {
        val code = intArrayOf(2, 4, 9, 3)
        val k = -2
        val expected = intArrayOf(12, 5, 6, 13)

        assertArrayEquals(expected, DefuseTheBomb.decrypt(code, k))
    }
}