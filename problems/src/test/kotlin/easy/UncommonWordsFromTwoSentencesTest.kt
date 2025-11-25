package easy

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.api.Test

class UncommonWordsFromTwoSentencesTest {
    @Test
    fun test1() {
        val s1 = "this apple is sweet"
        val s2 = "this apple is sour"
        val expected = arrayOf("sour", "sweet")
        
        assertArrayEquals(expected, UncommonWordsFromTwoSentences.uncommonFromSentences(s1, s2))
    }
    
    @Test
    fun test2() {
        val s1 = "apple apple"
        val s2 = "banana"
        val expected = arrayOf("banana")
        
        assertArrayEquals(expected, UncommonWordsFromTwoSentences.uncommonFromSentences(s1, s2))
    }
}
