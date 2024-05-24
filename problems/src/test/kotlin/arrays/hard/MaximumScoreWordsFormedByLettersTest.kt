package arrays.hard

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class MaximumScoreWordsFormedByLettersTest {
    @Test
    fun test1() {
        val words = arrayOf("dog", "cat", "dad", "good")
        val letters = charArrayOf('a', 'a', 'c', 'd', 'd', 'd', 'g', 'o', 'o')
        val score = intArrayOf(1, 0, 9, 5, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
        val expected = 23

        assertEquals(expected, MaximumScoreWordsFormedByLetters.maxScoreWords(words, letters, score))
    }

    @Test
    fun test2() {
        val words = arrayOf("xxxz", "ax", "bx", "cx")
        val letters = charArrayOf('z', 'a', 'b', 'c', 'x', 'x', 'x')
        val score = intArrayOf(4, 11, 12, 13, 18, 18, 18, 18)
        val expected = 40

        assertEquals(expected, MaximumScoreWordsFormedByLetters.maxScoreWords(words, letters, score))
    }

    @Test
    fun test3() {
        val words = arrayOf("leetcode")
        val letters = charArrayOf('l', 'e', 't', 'c', 'o', 'd')
        val score = intArrayOf(0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0, 0, 0, 0, 0)
        val expected = 0

        assertEquals(expected, MaximumScoreWordsFormedByLetters.maxScoreWords(words, letters, score))
    }
}