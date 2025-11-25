package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class Convert1DArrayInto2DArrayTest {
    @Test
    fun test1() {
        val original = intArrayOf(1, 2, 3, 4)
        val m = 2
        val n = 2
        val expected = arrayOf(intArrayOf(1, 2), intArrayOf(3, 4))

        assertArrayEquals(expected, Convert1DArrayInto2DArray.construct2DArray(original, m, n))
    }

    @Test
    fun test2() {
        val original = intArrayOf(1, 2, 3)
        val m = 1
        val n = 3
        val expected = arrayOf(intArrayOf(1, 2, 3))

        assertArrayEquals(expected, Convert1DArrayInto2DArray.construct2DArray(original, m, n))
    }

    @Test
    fun test3() {
        val original = intArrayOf(1, 2)
        val m = 1
        val n = 1
        val expected = emptyArray<IntArray>()

        assertArrayEquals(expected, Convert1DArrayInto2DArray.construct2DArray(original, m, n))
    }
}