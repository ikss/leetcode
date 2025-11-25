package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GrumpyBookstoreOwnerTest {
    @Test
    fun test1() {
        val customers = intArrayOf(1, 0, 1, 2, 1, 1, 7, 5)
        val grumpy = intArrayOf(0, 1, 0, 1, 0, 1, 0, 1)
        val minutes = 3
        val expected = 16

        assertEquals(expected, GrumpyBookstoreOwner.maxSatisfied(customers, grumpy, minutes))
    }

    @Test
    fun test2() {
        val customers = intArrayOf(1)
        val grumpy = intArrayOf(0)
        val minutes = 1
        val expected = 1

        assertEquals(expected, GrumpyBookstoreOwner.maxSatisfied(customers, grumpy, minutes))
    }

    @Test
    fun test3() {
        val customers = intArrayOf(2, 6, 6, 9)
        val grumpy = intArrayOf(0, 0, 1, 1)
        val minutes = 1
        val expected = 17

        assertEquals(expected, GrumpyBookstoreOwner.maxSatisfied(customers, grumpy, minutes))
    }
}