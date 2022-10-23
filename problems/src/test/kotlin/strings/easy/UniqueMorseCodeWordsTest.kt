package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class UniqueMorseCodeWordsTest {

    @Test
    fun test1() {
        val words = arrayOf("gin", "zen", "gig", "msg")
        val expected = 2

        assertEquals(expected, UniqueMorseCodeWords.uniqueMorseRepresentations(words))
    }

    @Test
    fun test2() {
        val words = arrayOf("a")
        val expected = 1

        assertEquals(expected, UniqueMorseCodeWords.uniqueMorseRepresentations(words))
    }
}
