package strings.medium

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReplaceWordsTest {
    @Test
    fun test1() {
        val dict = listOf("cat", "bat", "rat")
        val sentence = "the cattle was rattled by the battery"
        val expected = "the cat was rat by the bat"

        assertEquals(expected, ReplaceWords.replaceWords(dict, sentence))
    }

    @Test
    fun test2() {
        val dict = listOf("a", "aa", "aaa", "aaaa")
        val sentence = "a aa a aaaa aaa aaa aaa aaaaaa bbb baba ababa"
        val expected = "a a a a a a a a bbb baba a"

        assertEquals(expected, ReplaceWords.replaceWords(dict, sentence))
    }
}