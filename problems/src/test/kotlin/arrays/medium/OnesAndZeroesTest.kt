package arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class OnesAndZeroesTest {
    @Test
    fun test1() {
        val strs = arrayOf("10", "0001", "111001", "1", "0")
        val m = 5
        val n = 3
        val expected = 4

        assertEquals(expected, OnesAndZeroes.findMaxForm(strs, m, n))
    }

    @Test
    fun test2() {
        val strs = arrayOf("10", "0", "1")
        val m = 1
        val n = 1
        val expected = 2

        assertEquals(expected, OnesAndZeroes.findMaxForm(strs, m, n))
    }

    @Test
    fun test3() {
        val strs = arrayOf("10", "0001", "111001", "1", "0")
        val m = 4
        val n = 3
        val expected = 3

        assertEquals(expected, OnesAndZeroes.findMaxForm(strs, m, n))
    }
}