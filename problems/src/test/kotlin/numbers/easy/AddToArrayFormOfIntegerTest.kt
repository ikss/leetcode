package numbers.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class AddToArrayFormOfIntegerTest {

    @Test
    fun test1() {
        val num = intArrayOf(1, 2, 0, 0)
        val k = 34
        val expected = listOf(1, 2, 3, 4)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayForm(num, k))
    }

    @Test
    fun test2() {
        val num = intArrayOf(1, 2, 0, 0)
        val k = 34
        val expected = listOf(1, 2, 3, 4)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayForm(num, k))
    }

    @Test
    fun test3() {
        val num = intArrayOf(2, 1, 5)
        val k = 806
        val expected = listOf(1, 0, 2, 1)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayForm(num, k))
    }

    @Test
    fun test4() {
        val num = intArrayOf(6)
        val k = 806
        val expected = listOf(8, 1, 2)

        assertEquals(expected, AddToArrayFormOfInteger.addToArrayForm(num, k))
    }
}