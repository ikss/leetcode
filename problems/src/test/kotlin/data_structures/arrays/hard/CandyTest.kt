package data_structures.arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CandyTest {

    @Test
    fun test1() {
        val ratings = intArrayOf(1, 0, 2)
        val expected = 5

        assertEquals(expected, Candy.candy(ratings))
    }

    @Test
    fun test2() {
        val ratings = intArrayOf(1, 2, 2)
        val expected = 4

        assertEquals(expected, Candy.candy(ratings))
    }

    @Test
    fun test3() {
        val ratings = intArrayOf(1)
        val expected = 1

        assertEquals(expected, Candy.candy(ratings))
    }
}
