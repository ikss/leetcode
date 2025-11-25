package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfGoodPairsTest {
    @Test
    fun test1() {
        val input = intArrayOf(1, 2, 3, 1, 1, 3)
        val expected = 4

        assertEquals(expected, NumberOfGoodPairs.numIdenticalPairs(input))
    }

    @Test
    fun test2() {
        val input = intArrayOf(1, 1, 1, 1)
        val expected = 6

        assertEquals(expected, NumberOfGoodPairs.numIdenticalPairs(input))
    }

    @Test
    fun test3() {
        val input = intArrayOf(1, 2, 3)
        val expected = 0

        assertEquals(expected, NumberOfGoodPairs.numIdenticalPairs(input))
    }

    @Test
    fun test1array() {
        val input = intArrayOf(1, 2, 3, 1, 1, 3)
        val expected = 4

        assertEquals(expected, NumberOfGoodPairs.numIdenticalPairsArray(input))
    }

    @Test
    fun test2array() {
        val input = intArrayOf(1, 1, 1, 1)
        val expected = 6

        assertEquals(expected, NumberOfGoodPairs.numIdenticalPairsArray(input))
    }

    @Test
    fun test3array() {
        val input = intArrayOf(1, 2, 3)
        val expected = 0

        assertEquals(expected, NumberOfGoodPairs.numIdenticalPairsArray(input))
    }

    @Test
    fun test1map() {
        val input = intArrayOf(1, 2, 3, 1, 1, 3)
        val expected = 4

        assertEquals(expected, NumberOfGoodPairs.numIdenticalPairsMap(input))
    }

    @Test
    fun test2map() {
        val input = intArrayOf(1, 1, 1, 1)
        val expected = 6

        assertEquals(expected, NumberOfGoodPairs.numIdenticalPairsMap(input))
    }

    @Test
    fun test3map() {
        val input = intArrayOf(1, 2, 3)
        val expected = 0

        assertEquals(expected, NumberOfGoodPairs.numIdenticalPairsMap(input))
    }
}