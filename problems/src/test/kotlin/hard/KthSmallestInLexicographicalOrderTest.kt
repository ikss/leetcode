package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class KthSmallestInLexicographicalOrderTest {
    @Test
    fun test1() {
        val n = 13
        val k = 2
        val expected = 10

        assertEquals(expected, KthSmallestInLexicographicalOrder.findKthNumber(n, k))
    }

    @Test
    fun test2() {
        val n = 2
        val k = 2
        val expected = 2

        assertEquals(expected, KthSmallestInLexicographicalOrder.findKthNumber(n, k))
    }
}