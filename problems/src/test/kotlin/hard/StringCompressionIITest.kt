package hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StringCompressionIITest {

    @Test
    fun test1() {
        val s = "aaabcccd"
        val k = 2
        val expected = 4

        assertEquals(expected, StringCompressionII.getLengthOfOptimalCompression(s, k))
    }

    @Test
    fun test2() {
        val s = "aabbaa"
        val k = 2
        val expected = 2

        assertEquals(expected, StringCompressionII.getLengthOfOptimalCompression(s, k))
    }

    @Test
    fun test3() {
        val s = "aaaaaaaaaaa"
        val k = 0
        val expected = 3

        assertEquals(expected, StringCompressionII.getLengthOfOptimalCompression(s, k))
    }
}