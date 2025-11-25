package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DecodeTheMessageTest {

    @Test
    fun test1() {
        val key = "the quick brown fox jumps over the lazy dog"
        val message = "vkbs bs t suepuv"
        val expected = "this is a secret"

        assertEquals(expected, DecodeTheMessage.decodeMessage(key, message))
    }

    @Test
    fun test2() {
        val key = "eljuxhpwnyrdgtqkviszcfmabo"
        val message = "zwx hnfx lqantp mnoeius ycgk vcnjrdb"
        val expected = "the five boxing wizards jump quickly"

        assertEquals(expected, DecodeTheMessage.decodeMessage(key, message))
    }

}
