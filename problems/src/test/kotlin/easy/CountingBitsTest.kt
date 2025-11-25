package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class CountingBitsTest {

    @Test
    fun test1() {
        val n = 2
        val expected = intArrayOf(0, 1, 1)

        assertArrayEquals(expected, CountingBits.countBits(n))
    }

    @Test
    fun test2() {
        val n = 5
        val expected = intArrayOf(0, 1, 1, 2, 1, 2)

        assertArrayEquals(expected, CountingBits.countBits(n))
    }

    @Test
    fun test3() {
        val n = 0
        val expected = intArrayOf(0)

        assertArrayEquals(expected, CountingBits.countBits(n))
    }
}