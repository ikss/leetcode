package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NthMagicalNumberTest {
    @Test
    fun test1PriorityQueue() {
        val n = 1
        val a = 2
        val b = 3
        val expected = 2

        assertEquals(expected, NthMagicalNumber.nthMagicalNumberPriorityQueue(n, a, b))
    }

    @Test
    fun test2PriorityQueue() {
        val n = 4
        val a = 2
        val b = 3
        val expected = 6

        assertEquals(expected, NthMagicalNumber.nthMagicalNumberPriorityQueue(n, a, b))
    }
    @Test
    fun test1BinarySearch() {
        val n = 1
        val a = 2
        val b = 3
        val expected = 2

        assertEquals(expected, NthMagicalNumber.nthMagicalNumberBinarySearch(n, a, b))
    }

    @Test
    fun test2BinarySearch() {
        val n = 4
        val a = 2
        val b = 3
        val expected = 6

        assertEquals(expected, NthMagicalNumber.nthMagicalNumberBinarySearch(n, a, b))
    }
}