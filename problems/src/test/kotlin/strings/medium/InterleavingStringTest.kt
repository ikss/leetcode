package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InterleavingStringTest {

    @Test
    fun test1() {
        val s1 = "aabcc"
        val s2 = "dbbca"
        val s3 = "aadbbcbcac"
        val expected = true

        assertEquals(expected, InterleavingString.isInterleave(s1, s2, s3))
    }

    @Test
    fun test2() {
        val s1 = "aabcc"
        val s2 = "dbbca"
        val s3 = "aadbbbaccc"
        val expected = false

        assertEquals(expected, InterleavingString.isInterleave(s1, s2, s3))
    }

    @Test
    fun test3() {
        val s1 = ""
        val s2 = ""
        val s3 = ""
        val expected = true

        assertEquals(expected, InterleavingString.isInterleave(s1, s2, s3))
    }
}
