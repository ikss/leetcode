package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TheKthFactorOfNTest {
    @Test
    fun test1() {
        val n = 12
        val k = 3
        val expected = 3

        assertEquals(expected, TheKthFactorOfN.kthFactor(n, k))
    }

    @Test
    fun test2() {
        val n = 7
        val k = 2
        val expected = 7

        assertEquals(expected, TheKthFactorOfN.kthFactor(n, k))
    }

    @Test
    fun test3() {
        val n = 4
        val k = 4
        val expected = -1

        assertEquals(expected, TheKthFactorOfN.kthFactor(n, k))
    }

    @Test
    fun test1sqrt() {
        val n = 12
        val k = 3
        val expected = 3

        assertEquals(expected, TheKthFactorOfN.kthFactorSqrt(n, k))
    }

    @Test
    fun test2sqrt() {
        val n = 7
        val k = 2
        val expected = 7

        assertEquals(expected, TheKthFactorOfN.kthFactorSqrt(n, k))
    }

    @Test
    fun test3sqrt() {
        val n = 4
        val k = 4
        val expected = -1

        assertEquals(expected, TheKthFactorOfN.kthFactorSqrt(n, k))
    }
}