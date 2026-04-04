package medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class DecodeTheSlantedCiphertextTest {
    @Test
    fun test1() {
        val encodedText = "ch   ie   pr"
        val rows = 3
        val expected = "cipher"

        assertEquals(expected, DecodeTheSlantedCiphertext.decodeCiphertext(encodedText, rows))
    }

    @Test
    fun test2() {
        val encodedText = "iveo    eed   l te   olc"
        val rows = 4
        val expected = "i love leetcode"

        assertEquals(expected, DecodeTheSlantedCiphertext.decodeCiphertext(encodedText, rows))
    }

    @Test
    fun test3() {
        val encodedText = "coding"
        val rows = 1
        val expected = "coding"

        assertEquals(expected, DecodeTheSlantedCiphertext.decodeCiphertext(encodedText, rows))
    }
}