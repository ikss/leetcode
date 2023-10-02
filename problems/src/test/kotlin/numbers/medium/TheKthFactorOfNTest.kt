package numbers.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class TheKthFactorOfNTest {
    @Test
    fun test1() {
        val n = 12
        val k = 3

        assertEquals(3, TheKthFactorOfN.kthFactor(n, k))
    }

    @Test
    fun test2() {
        val n = 7
        val k = 2

        assertEquals(7, TheKthFactorOfN.kthFactor(n, k))
    }
    
    @Test
    fun test3() {
        val n = 4
        val k = 4

        assertEquals(-1, TheKthFactorOfN.kthFactor(n, k))
    }
}