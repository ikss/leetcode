package numbers.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class IntegerToEnglishWordsTest {
    @Test
    fun test1() {
        val input = 123
        val expected = "One Hundred Twenty Three"

        assertEquals(expected, IntegerToEnglishWords.numberToWords(input))
    }
    
    @Test
    fun test2() {
        val input = 12345
        val expected = "Twelve Thousand Three Hundred Forty Five"

        assertEquals(expected, IntegerToEnglishWords.numberToWords(input))
    }
    
    @Test
    fun test3() {
        val input = 1234567
        val expected = "One Million Two Hundred Thirty Four Thousand Five Hundred Sixty Seven"

        assertEquals(expected, IntegerToEnglishWords.numberToWords(input))
    }
}