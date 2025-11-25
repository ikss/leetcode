package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class FindNUniqueIntegersSumUpToZeroTest {
    @Test
    fun test1() {
        val n = 5
        val expected = intArrayOf(1, 2, 0, -2, -1)

        assertArrayEquals(expected, FindNUniqueIntegersSumUpToZero.sumZero(n))
    }

    @Test
    fun test2() {
        val n = 3
        val expected = intArrayOf(1, 0, -1)

        assertArrayEquals(expected, FindNUniqueIntegersSumUpToZero.sumZero(n))
    }

    @Test
    fun test3() {
        val n = 1
        val expected = intArrayOf(0)

        assertArrayEquals(expected, FindNUniqueIntegersSumUpToZero.sumZero(n))
    }

    @Test
    fun test4() {
        val n = 2
        val expected = intArrayOf(1, -1)

        assertArrayEquals(expected, FindNUniqueIntegersSumUpToZero.sumZero(n))
    }
}