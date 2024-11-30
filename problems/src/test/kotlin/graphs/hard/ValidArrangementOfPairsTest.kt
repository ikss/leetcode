package graphs.hard

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class ValidArrangementOfPairsTest {
    @Test
    fun test1() {
        val pairs = arrayOf(intArrayOf(5, 1), intArrayOf(4, 5), intArrayOf(11, 9), intArrayOf(9, 4))
        val expected = arrayOf(intArrayOf(11, 9), intArrayOf(9, 4), intArrayOf(4, 5), intArrayOf(5, 1))

        assertArrayEquals(expected, ValidArrangementOfPairs.validArrangement(pairs))
    }

    @Test
    fun test2() {
        val pairs = arrayOf(intArrayOf(1, 3), intArrayOf(3, 2), intArrayOf(2, 1))
        val expected = arrayOf(intArrayOf(1, 3), intArrayOf(3, 2), intArrayOf(2, 1))

        assertArrayEquals(expected, ValidArrangementOfPairs.validArrangement(pairs))
    }

    @Test
    fun test3() {
        val pairs = arrayOf(intArrayOf(1, 2), intArrayOf(1, 3), intArrayOf(2, 1))
        val expected = arrayOf(intArrayOf(1, 2), intArrayOf(2, 1), intArrayOf(1, 3))

        assertArrayEquals(expected, ValidArrangementOfPairs.validArrangement(pairs))
    }
}