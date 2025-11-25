package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReverseWordsInStringIIITest {

    @Test
    fun test1() {
        val s = "Let's take LeetCode contest"
        val expected = "s'teL ekat edoCteeL tsetnoc"

        assertEquals(expected, ReverseWordsInStringIII.reverseWords(s))
    }

    @Test
    fun test2() {
        val s = "God Ding"
        val expected = "doG gniD"

        assertEquals(expected, ReverseWordsInStringIII.reverseWords(s))
    }

    @Test
    fun test4() {
        val s = "ABCDE"
        val expected = "EDCBA"

        assertEquals(expected, ReverseWordsInStringIII.reverseWords(s))
    }
}
