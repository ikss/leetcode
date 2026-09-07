package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DistinctSubsequencesIITest {
    @Test
    fun test1() {
        val s = "abc"
        val expected = 7

        assertEquals(expected, DistinctSubsequencesII.distinctSubseqII(s))
    }

    @Test
    fun test2() {
        val s = "aba"
        val expected = 6

        assertEquals(expected, DistinctSubsequencesII.distinctSubseqII(s))
    }

    @Test
    fun test3() {
        val s = "aaa"
        val expected = 3

        assertEquals(expected, DistinctSubsequencesII.distinctSubseqII(s))
    }
}