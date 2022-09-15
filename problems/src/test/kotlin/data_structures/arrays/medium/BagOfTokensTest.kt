package data_structures.arrays.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class BagOfTokensTest {
    @Test
    fun test1() {
        val tokens = intArrayOf(100)
        val power = 50
        val expected = 0

        assertEquals(expected, BagOfTokens.bagOfTokensScore(tokens, power))
    }

    @Test
    fun test2() {
        val tokens = intArrayOf(100, 200)
        val power = 150
        val expected = 1

        assertEquals(expected, BagOfTokens.bagOfTokensScore(tokens, power))
    }

    @Test
    fun test3() {
        val tokens = intArrayOf(100, 200, 300, 400)
        val power = 200
        val expected = 2

        assertEquals(expected, BagOfTokens.bagOfTokensScore(tokens, power))
    }
}