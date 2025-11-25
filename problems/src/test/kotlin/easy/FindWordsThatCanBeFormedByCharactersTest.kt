package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FindWordsThatCanBeFormedByCharactersTest {
    @Test
    fun test1() {
        val words = arrayOf("cat", "bt", "hat", "tree")
        val chars = "atach"
        val expected = 6

        assertEquals(expected, FindWordsThatCanBeFormedByCharacters.countCharacters(words, chars))
    }

    @Test
    fun test2() {
        val words = arrayOf("hello", "world", "leetcode")
        val chars = "welldonehoneyr"
        val expected = 10

        assertEquals(expected, FindWordsThatCanBeFormedByCharacters.countCharacters(words, chars))
    }
}