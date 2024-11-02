package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class GeneralizedAbbreviationTest {
    @Test
    fun test1() {
        val word = "word"
        val expected = listOf("word", "wor1", "wo1d", "wo2", "w1rd", "w1r1", "w2d", "w3", "1ord", "1or1", "1o1d", "1o2", "2rd", "2r1", "3d", "4")
        
        assertEquals(expected, GeneralizedAbbreviation.generateAbbreviations(word))
    }


    @Test
    fun test2() {
        val word = "a"
        val expected = listOf("a", "1")

        assertEquals(expected, GeneralizedAbbreviation.generateAbbreviations(word))
    }
}