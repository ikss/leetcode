package arrays.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class NumberOfEquivalentDominoPairsTest {
    @Test
    fun test1() {
        val dominoes = arrayOf(intArrayOf(1, 2), intArrayOf(2, 1), intArrayOf(3, 4), intArrayOf(5, 6))
        val expected = 1

        assertEquals(expected, NumberOfEquivalentDominoPairs.numEquivDominoPairs(dominoes))
    }

    @Test
    fun test2() {
        val dominoes = arrayOf(intArrayOf(1, 2), intArrayOf(1, 2), intArrayOf(1, 1), intArrayOf(1, 2), intArrayOf(2, 2))
        val expected = 3

        assertEquals(expected, NumberOfEquivalentDominoPairs.numEquivDominoPairs(dominoes))
    }
}