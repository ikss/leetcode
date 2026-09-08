package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class HighFiveTest {
    @Test
    fun test1() {
        val items = arrayOf(
            intArrayOf(1, 91),
            intArrayOf(1, 92),
            intArrayOf(2, 93),
            intArrayOf(2, 97),
            intArrayOf(1, 60),
            intArrayOf(2, 77),
            intArrayOf(1, 65),
            intArrayOf(1, 87),
            intArrayOf(1, 100),
            intArrayOf(2, 100),
            intArrayOf(2, 76),
        )
        val expected = arrayOf(intArrayOf(1, 87), intArrayOf(2, 88))

        assertArrayEquals(expected, HighFive.highFive(items))
    }

    @Test
    fun test2() {
        val items = arrayOf(
            intArrayOf(1, 100),
            intArrayOf(7, 100),
            intArrayOf(1, 100),
            intArrayOf(7, 100),
            intArrayOf(1, 100),
            intArrayOf(7, 100),
            intArrayOf(1, 100),
            intArrayOf(7, 100),
            intArrayOf(1, 100),
            intArrayOf(7, 100),
        )
        val expected = arrayOf(intArrayOf(1, 100), intArrayOf(7, 100))

        assertArrayEquals(expected, HighFive.highFive(items))
    }
}