package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class InterleavingStringTest {

    @Test
    fun test1dp() {
        val s1 = "aabcc"
        val s2 = "dbbca"
        val s3 = "aadbbcbcac"
        val expected = true

        assertEquals(expected, InterleavingString.isInterleaveDp(s1, s2, s3))
    }

    @Test
    fun test2dp() {
        val s1 = "aabcc"
        val s2 = "dbbca"
        val s3 = "aadbbbaccc"
        val expected = false

        assertEquals(expected, InterleavingString.isInterleaveDp(s1, s2, s3))
    }

    @Test
    fun test3dp() {
        val s1 = ""
        val s2 = ""
        val s3 = ""
        val expected = true

        assertEquals(expected, InterleavingString.isInterleaveDp(s1, s2, s3))
    }

    @Test
    fun test1dpSpaceOptimized() {
        val s1 = "aabcc"
        val s2 = "dbbca"
        val s3 = "aadbbcbcac"
        val expected = true

        assertEquals(expected, InterleavingString.isInterleaveDpSpaceOptimized(s1, s2, s3))
    }

    @Test
    fun test2dpSpaceOptimized() {
        val s1 = "aabcc"
        val s2 = "dbbca"
        val s3 = "aadbbbaccc"
        val expected = false

        assertEquals(expected, InterleavingString.isInterleaveDpSpaceOptimized(s1, s2, s3))
    }

    @Test
    fun test3dpSpaceOptimized() {
        val s1 = ""
        val s2 = ""
        val s3 = ""
        val expected = true

        assertEquals(expected, InterleavingString.isInterleaveDpSpaceOptimized(s1, s2, s3))
    }
}
