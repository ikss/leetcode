package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddToArrayFormOfIntegerTest {

    @Test
    fun test1simple() {
        val num = intArrayOf(1, 2, 0, 0)
        val k = 34
        val expected = listOf(1, 2, 3, 4)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayFormSimple(num, k))
    }

    @Test
    fun test2simple() {
        val num = intArrayOf(1, 2, 0, 0)
        val k = 34
        val expected = listOf(1, 2, 3, 4)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayFormSimple(num, k))
    }

    @Test
    fun test3simple() {
        val num = intArrayOf(2, 1, 5)
        val k = 806
        val expected = listOf(1, 0, 2, 1)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayFormSimple(num, k))
    }

    @Test
    fun test4simple() {
        val num = intArrayOf(6)
        val k = 806
        val expected = listOf(8, 1, 2)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayFormSimple(num, k))
    }

    @Test
    fun test1official() {
        val num = intArrayOf(1, 2, 0, 0)
        val k = 34
        val expected = listOf(1, 2, 3, 4)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayFormOfficial(num, k))
    }

    @Test
    fun test2official() {
        val num = intArrayOf(1, 2, 0, 0)
        val k = 34
        val expected = listOf(1, 2, 3, 4)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayFormOfficial(num, k))
    }

    @Test
    fun test3official() {
        val num = intArrayOf(2, 1, 5)
        val k = 806
        val expected = listOf(1, 0, 2, 1)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayFormOfficial(num, k))
    }

    @Test
    fun test4official() {
        val num = intArrayOf(6)
        val k = 806
        val expected = listOf(8, 1, 2)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayFormOfficial(num, k))
    }
}