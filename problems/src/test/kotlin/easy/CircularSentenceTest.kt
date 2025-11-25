package easy

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class CircularSentenceTest {
    @Test
    fun test1() {
        val sentence = "leetcode exercises sound delightful"
        val expected = true

        assertEquals(expected, CircularSentence.isCircularSentence(sentence))
    }

    @Test
    fun test2() {
        val sentence = "eetcode"
        val expected = true

        assertEquals(expected, CircularSentence.isCircularSentence(sentence))
    }

    @Test
    fun test3() {
        val sentence = "Leetcode is cool"
        val expected = false

        assertEquals(expected, CircularSentence.isCircularSentence(sentence))
    }
}