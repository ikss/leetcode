package strings.easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class VerifyingAnAlienDictionaryTest {

    @Test
    fun test1() {
        val words = arrayOf("hello", "leetcode")
        val order = "hlabcdefgijkmnopqrstuvwxyz"
        val expected = true

        assertEquals(expected, VerifyingAnAlienDictionary.isAlienSortedNaive(words, order))
    }

    @Test
    fun test2() {
        val words = arrayOf("word", "world", "row")
        val order = "worldabcefghijkmnpqstuvxyz"
        val expected = false

        assertEquals(expected, VerifyingAnAlienDictionary.isAlienSortedNaive(words, order))
    }

    @Test
    fun test3() {
        val words = arrayOf("apple", "app")
        val order = "abcdefghijklmnopqrstuvwxyz"
        val expected = false

        assertEquals(expected, VerifyingAnAlienDictionary.isAlienSortedNaive(words, order))
    }
}