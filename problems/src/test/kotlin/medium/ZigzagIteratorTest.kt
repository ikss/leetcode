package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ZigzagIteratorTest {

    @Test
    fun test1() {
        val v1 = intArrayOf(1, 2)
        val v2 = intArrayOf(3, 4, 5, 6)
        val zigzagIterator = ZigzagIterator.ZigzagIterator(v1, v2)
        val expected = listOf(1, 3, 2, 4, 5, 6)

        val result = mutableListOf<Int>()
        while (zigzagIterator.hasNext()) {
            result.add(zigzagIterator.next())
        }

        assertEquals(expected, result)
    }

    @Test
    fun test2() {
        val v1 = intArrayOf(1)
        val v2 = intArrayOf(2, 3, 4)
        val zigzagIterator = ZigzagIterator.ZigzagIterator(v1, v2)
        val expected = listOf(1, 2, 3, 4)

        val result = mutableListOf<Int>()
        while (zigzagIterator.hasNext()) {
            result.add(zigzagIterator.next())
        }

        assertEquals(expected, result)
    }

    @Test
    fun test3() {
        val v1 = intArrayOf(1, 2)
        val v2 = intArrayOf()
        val zigzagIterator = ZigzagIterator.ZigzagIterator(v1, v2)
        val expected = listOf(1, 2)

        val result = mutableListOf<Int>()
        while (zigzagIterator.hasNext()) {
            result.add(zigzagIterator.next())
        }

        assertEquals(expected, result)
    }
}